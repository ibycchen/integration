<#include "freemarker/base/mallBase.ftl">
<section class="contain">
    <header class="header">
        <p>我的订单</p>
    </header>

    <div id="ID_myOrdersApp">
    <!-- orders -->
    <main class="orders" v-if="orders.length>0" v-cloak>
        <div class="popupHint" id="deleteHint">
            <div class="popupHint-top">确认删除此订单？</div>
            <ul>
                <li>取消</li>
                <a href="javascript:void(0)">
                    <li id="ordersDelete">删除</li>
                </a>
            </ul>
        </div>

        <div class="orders-goods" v-for="(order, index) in orders">
            <div class="orders-top">
                <p>订单号：{{order.orderNo}}</p>
                <i class="fa fa-trash-o fa-lg ordersDeleteBtn" @click="removeOrder(order, index)"></i>
            </div>
            <div class="clearfix"></div>
            <div class="orders-info">
                <a v-bind:href="'/order/' + order.id + '/detail'">
                    <ul>
                        <li v-for="goods in order.items">
                            <img v-bind:src="'${var_domain_url}/file/img/~/' + goods.goodsImgPath" alt=""/>
                        </li>
                    </ul>
                </a>
            </div>
            <div class="clearfix"></div>
            <div class="orders-foot">
                <div class="orders-foot1">
                    <p class="orders-foot1Left">状态：<span>已完成</span></p>
                    <p class="orders-foot1Right">共{{order.items.length}}件商品&nbsp;&nbsp;&nbsp;<span class="red">实付款：￥{{order.price}}</span>
                    </p>
                </div>
                <div class="clearfix"></div>
                <div class="orders-foot2">
                    <#--<button type="button" value="" @click="goComment(order.id)" class="review">评价晒单</button>-->
                <#--<button type="button" value="" class="buyAgain">再次购买</button>-->
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
        <div class="loadmore" @click="loadMore">{{loadMoreTitle}}</div>
    </main>
    <main class="no-orders" v-if="orders.length==0 && loaded" v-cloak>
        <i class="fa fa-star fa-2x"></i>
        <p>你还没有下过订单呦</p>
    </main>
    </div>
    <script src="/js/~/order/myOrders.js"></script>
    <!-- orders -->
<#include "freemarker/base/mallFooter.ftl">
</section>
<#include "freemarker/base/mallEnd.ftl">