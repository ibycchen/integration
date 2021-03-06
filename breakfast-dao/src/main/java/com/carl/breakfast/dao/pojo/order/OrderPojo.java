package com.carl.breakfast.dao.pojo.order;

import com.carl.breakfast.dao.json.CustomDoubleSerialize;
import com.carl.framework.core.entity.BaseEntity;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
import java.util.List;

/**
 * 数据库订单映射
 *
 * @author Carl
 * @date 2016/12/14
 * 版权所有.(c)2016 - 2020. 卡尔工作室
 */
public class OrderPojo extends BaseEntity {
    //ID
    private String id;
    //ORDER_NO
    private String orderNo;
    //CREATE_TIME
    private Date createTime;
    //PAY_TIME
    private Date payTime;
    //USERNAME
    private String username;
    //CONTACT_NAME
    private String contactName;
    //CONTACT_NUMBER
    private String contactNumber;
    //MESSAGE
    private String message;
    //PRICE
//    @JsonSerialize(using = CustomDoubleSerialize.class, contentUsing = CustomDoubleSerialize.class)
    private float price;
    //PAY_STATE
    private int payState;
    //ORDER_STATE
    private int orderState;
    //END_OPERA_TIME
    private Date endOperaTime;
    //IS_REVERT
    private boolean revert;
    //REVERT_STATE
    private int revertState;
    //REVERT_COMPLETE_TIME
    private Date revertCompleteTime;
    //APPLY_REVERT_TIME
    private Date applyRevertTime;
    //REVERT_PRICE
    private float revertPrice;
    //IS_CANCEL
    private boolean cancel;
    //IS_REMOVE 是否已删除
    private boolean isRemove;
    //CANCEL_TIME
    private Date cancelTime;
    //PAY_SYSTEM_INFO
    private String paySystemInfo;
    //PAY_SYSTEM
    private int paySystem;
    //ADDRESS
    private String address;

    //ADD_CODE1
    private String addCode1;
    //ADD_CODE2
    private String addCode2;

    //ADD_NAME1
    private String addName1;
    //ADD_NAME2
    private String addName2;

    //IS_IMPATIENT
    private boolean isImpatient;

    private List<OrderGoodsItem> items;

    public List<OrderGoodsItem> getItems() {
        return items;
    }

    public OrderPojo setItems(List<OrderGoodsItem> items) {
        this.items = items;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public OrderPojo setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public OrderPojo setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }

    public String getId() {
        return id;
    }

    public OrderPojo setId(String id) {
        this.id = id;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public OrderPojo setPayTime(Date payTime) {
        this.payTime = payTime;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public OrderPojo setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getContactName() {
        return contactName;
    }

    public OrderPojo setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public OrderPojo setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public OrderPojo setPrice(float price) {
        this.price = price;
        return this;
    }

    public int getPayState() {
        return payState;
    }

    public OrderPojo setPayState(int payState) {
        this.payState = payState;
        return this;
    }

    public int getOrderState() {
        return orderState;
    }

    public OrderPojo setOrderState(int orderState) {
        this.orderState = orderState;
        return this;
    }

    public Date getEndOperaTime() {
        return endOperaTime;
    }

    public OrderPojo setEndOperaTime(Date endOperaTime) {
        this.endOperaTime = endOperaTime;
        return this;
    }

    public boolean isRevert() {
        return revert;
    }

    public OrderPojo setRevert(boolean revert) {
        this.revert = revert;
        return this;
    }

    public int getRevertState() {
        return revertState;
    }

    public OrderPojo setRevertState(int revertState) {
        this.revertState = revertState;
        return this;
    }

    public Date getRevertCompleteTime() {
        return revertCompleteTime;
    }

    public OrderPojo setRevertCompleteTime(Date revertCompleteTime) {
        this.revertCompleteTime = revertCompleteTime;
        return this;
    }

    public Date getApplyRevertTime() {
        return applyRevertTime;
    }

    public OrderPojo setApplyRevertTime(Date applyRevertTime) {
        this.applyRevertTime = applyRevertTime;
        return this;
    }

    public float getRevertPrice() {
        return revertPrice;
    }

    public OrderPojo setRevertPrice(float revertPrice) {
        this.revertPrice = revertPrice;
        return this;
    }

    public boolean isCancel() {
        return cancel;
    }

    public OrderPojo setCancel(boolean cancel) {
        this.cancel = cancel;
        return this;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public OrderPojo setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
        return this;
    }

    public String getPaySystemInfo() {
        return paySystemInfo;
    }

    public OrderPojo setPaySystemInfo(String paySystemInfo) {
        this.paySystemInfo = paySystemInfo;
        return this;
    }

    public int getPaySystem() {
        return paySystem;
    }

    public OrderPojo setPaySystem(int paySystem) {
        this.paySystem = paySystem;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public OrderPojo setAddress(String address) {
        this.address = address;
        return this;
    }

    public boolean isImpatient() {
        return isImpatient;
    }

    public OrderPojo setImpatient(boolean impatient) {
        isImpatient = impatient;
        return this;
    }

    public String getAddCode1() {
        return addCode1;
    }

    public OrderPojo setAddCode1(String addCode1) {
        this.addCode1 = addCode1;
        return this;
    }

    public String getAddCode2() {
        return addCode2;
    }

    public OrderPojo setAddCode2(String addCode2) {
        this.addCode2 = addCode2;
        return this;
    }

    public String getAddName1() {
        return addName1;
    }

    public OrderPojo setAddName1(String addName1) {
        this.addName1 = addName1;
        return this;
    }

    public String getAddName2() {
        return addName2;
    }

    public OrderPojo setAddName2(String addName2) {
        this.addName2 = addName2;
        return this;
    }

    public boolean isRemove() {
        return isRemove;
    }

    public OrderPojo setRemove(boolean remove) {
        isRemove = remove;
        return this;
    }
}
