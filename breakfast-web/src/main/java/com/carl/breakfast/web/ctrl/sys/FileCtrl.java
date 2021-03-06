package com.carl.breakfast.web.ctrl.sys;

import com.carl.breakfast.dao.sys.pojo.SysFile;
import com.carl.breakfast.web.service.SysFileService;
import com.carl.framework.core.file.DefaultFileSaveStrategy;
import com.carl.framework.core.file.FileSaveStrategy;
import com.carl.framework.ui.ctrl.BaseCtrl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * 系统文件
 *
 * @author Carl
 * @date 2016/11/28
 * © 2016 - 2020 , all rights reserved .卡尔工作室
 */
@Controller
@RequestMapping("/sys/file")
public class FileCtrl extends BaseCtrl {
    protected static final Log logger = LogFactory.getLog(FileCtrl.class);
    @Autowired
    @Qualifier("sysFileService") //注释指定注入 Bean
    private SysFileService sysFileService;

    private DefaultFileSaveStrategy defaultFileSaveStrategy = new DefaultFileSaveStrategy();

    protected String getModuleName() {
        return "sys/file";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public Object upload(@RequestParam("file") MultipartFile file,
                         @RequestParam(value = "remark", required = false, defaultValue = "") String remark,
                         @RequestParam(value = "busiCode", required = false, defaultValue = "base") String busiCode,
                         HttpServletRequest request
    ) {
        SysFile sysFile = new SysFile();
        sysFile.setFileSize(file.getSize());
        sysFile.setUploadName(file.getOriginalFilename());
        sysFile.setUploadIp(request.getRemoteAddr());
        sysFile.setRemark(remark);
        defaultFileSaveStrategy.setBusiCode(busiCode);
        sysFile.setBizCode(busiCode);
        Object obj = SecurityUtils.getSubject().getPrincipal();
        sysFile.setUploadUser((String) obj);
        try {
            FileSaveStrategy.FileInfo info = defaultFileSaveStrategy.save(request.getRealPath("/"), file);
            sysFile.setVisitPath(info.getFilePath());
            sysFileService.save(sysFile);
        } catch (Exception e) {
            logger.error(e);
            return fail(e.getMessage());
        }
        return success(sysFile);
    }

    /**
     * 删除文件
     * @param id 文件id
     * @return
     */
    @ResponseBody
    @RequestMapping("/deleteById")
    public Object deleteById(@RequestParam("id") int id) {
        try {
            int i = sysFileService.deleteById(id);
            if(i == 1) {
                return success();
            }
            return fail("该文件不存在");
        } catch (Exception e) {
            return fail(e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value = "/list.json")
    public Object listGoods(@RequestParam(required = false, value = "name") String name,
                            @RequestParam(required = false, defaultValue = "1", value = "page") int page,
                            @RequestParam(required = false, defaultValue = "15", value = "pageSize") int limit) {
        try {
            return success(sysFileService.list(limit, page, name, 1));
        } catch (Exception e) {
            return fail(e.getMessage());
        }
    }
}
