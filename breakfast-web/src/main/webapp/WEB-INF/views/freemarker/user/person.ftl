<#include "freemarker/base/mallBase.ftl">
<section class="contain">
    <header class="header">
        <p>个人中心</p>
    </header>

    <!-- person -->
    <main class="person">
        <div class="person-top">
            <div class="person-img">
                <img src="${userInfoResult.headimgurl}" alt=""/>
            </div>
            <div class="person-name">${userInfoResult.nickname}</div>
        </div>
        <div class="person-main">
            <ul>
                <a href="/order/myOrders.html"><li><p>我的订单</p><i class="fa fa-chevron-right fa-1x"></i></li></a>
                <a href="/user/goAddress.html"><li><p>地址管理</p><i class="fa fa-chevron-right fa-1x"></i></li></a>
            </ul>
        </div>
    </main>
    <!-- person -->

<#include "freemarker/base/mallFooter.ftl">
</section>


<#include "freemarker/base/mallEnd.ftl">

