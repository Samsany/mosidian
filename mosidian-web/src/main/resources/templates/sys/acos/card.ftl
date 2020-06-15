<!doctype html>
<html lang="en">
<#include "/common/header.ftl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>MOSIDIAN</title>
    <!--====== Favicon Icon ======-->
    <link rel="shortcut icon" href="img/favicon1.png" type="image/png">
    <!--====== Bootstrap css ======-->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!--====== Fontawesome css ======-->
    <link rel="stylesheet" href="css/fontawesome-all.min.css">
    <!--====== Slick css ======-->
    <link rel="stylesheet" href="css/slick.css">
    <link rel="stylesheet" href="css/slick-theme.css">
    <!--====== Magnific Popup css ======-->
    <link rel="stylesheet" href="css/magnific-popup.css">
    <!--====== Animate css ======-->
    <link rel="stylesheet" href="css/animate.min.css">
    <!--====== Default css ======-->
    <link rel="stylesheet" href="css/default.css">
    <!--====== Style css ======-->
    <link rel="stylesheet" href="css/style.css">
    <!--====== Responsive css ======-->
    <link rel="stylesheet" href="css/responsive.css">
    <link rel="stylesheet" type="text/css" href="css/macroease.css"/>
    <link rel="stylesheet" type="text/css" href="layui/css/modules/layer/default/layer.css"/>
    <link rel="stylesheet" type="text/css" href="layui/css/modules/laydate/default/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="layui/css/layui.css"/>
    <!--====== 图标 css ======-->
    <link rel="stylesheet" href="http://at.alicdn.com/t/font_1598462_3lrn8hkd04i.css">
    <link rel="stylesheet" href="http://at.alicdn.com/t/font_1832976_dxo1jrajxyo.css">
</head>
<style>
    /*导航栏*/
    *{
        margin:0;
        padding:0;
    }
    li {
        list-style: none;
    }
    body,html {
        background-color: #fff!important;
    }
    .nav {
        position: fixed;
        width:100%;
        height: 60px;
        z-index:5;
        background-color: rgba(13, 13, 13, 0.5);
    }
    .nav-content {
        display: flex;
        flex-direction: row;
        align-items: center;
        justify-content: space-between;
        width: 1200px;
        height: 100%;
        margin:0 auto;
    }
    .nav-ul {
        display: flex;
        flex-direction: row;
        align-items: center;
    }
    .nav-li {
        position: relative;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        width:100px;

    }
    .show-border .nav-title {
        transition: all .5s linear;
        color: #1f8fff;
    }

    .nav-icon img {
        width: 30px;
        height: 30px;
        margin-bottom:5px;
    }
    .nav-title {
        font-size: 14px;
        color: #656565;
    }
    .nav-logo {
        width:140px;
        height:40px;
    }
    .nav-company {
        color:#fff;
        text-align: center;
    }
    .company-name {
        color:#fff;
        font-size: 18px;
        letter-spacing: 10px;
    }
    .company-pinyin {
        margin-left:-10px;
        margin-top:5px;
        font-size: 12px;
    }
    .nav-banner {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        width:100%;
        height:600px;
        background-repeat: no-repeat;
        background-position: center;
        background-size: cover;
    }
    .nav-banner-title {
        font-size: 40px;
        color: #fff;
        font-weight: 500;
        letter-spacing: 4px;
        margin-bottom: 50px;
    }
    /*banner*/
    .banner-content {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        margin-top:80px;
        color:#fff;
    }
    .page-title {
        font-size: 32px;
        font-weight: 500;
    }
    .high-business-circle-info {
        margin: 20px 0;
        color: #fff;
        font-size: 18px;
    }
    .aios-content-bg {
        margin-bottom:15px;
    }
    .high-business-date {
        font-size: 14px;
        line-height: 25px;
    }
    /*每一个人都是平凡而伟大*/
    .person-content-bg {
        background-color: #fff;
    }
    .person-content-title {
        margin-bottom:10px;
        max-width:160px;
        text-align: center;
    }
    .person-title {
        font-size: 14px;
        color:#000;
    }
    .person-detail {
        margin-top:3px;
        font-size: 10px;
        color:#D3D6DD;
    }
    .person-content-detail {
        min-height:400px;
        background-color: #F2F2F2;
    }
    .person-content-item {
        height:200px;
    }
    .person-content-item:nth-child(1){
        background-repeat: no-repeat;
        background-position: center center;
        background-size: cover;
    }
    .person-content-item:nth-child(2),
    .person-content-item:nth-child(4),
    .person-content-item:nth-child(6){
        display: flex;
        flex-direction: row;
        align-items: center;
        justify-content: center;
        text-align: center;
        padding:15px 30px;
        font-size: 14px;
        color:#000;
    }
/*    MOSIDIAN 你的好伙伴*/
    .your-partner-black {
        min-height: 350px;
        background-color: #000;
    }
    .your-partner-white {
        min-height: 200px;
        background-color: #fff;
    }
    .your-partner-gray {
        min-height: 350px;
        background-color: #EEEEEE;
    }
    .your-partner {
        position: relative;
    }
    .your-partner-content {
        position: absolute;
        top:135px;
        left:0;
        right:0;
    }
    .your-partner-item:nth-child(1),
    .your-partner-item:nth-child(6)
    {
        min-height: 280px;
    }
    .your-partner-item:nth-child(3),
    .your-partner-item:nth-child(4) {
        min-height: 60px;
        background-color: #fff;
    }
    .your-partner-item:nth-child(2),
    .your-partner-item:nth-child(5){
        display: flex;
        flex-direction: row;
        align-items: center;
        justify-content: center;
        min-height: 230px;
        text-align: center;
        padding:40px 60px;
        font-size: 14px;
        color:#000;
        background-color: #fff;
    }
    .your-partner-item:nth-child(2) {
        margin-top:80px;
    }
    .your-partner-item:nth-child(5) {
        margin-bottom:80px;
    }
    .mosidian-your-partner {
        font-size: 20px;
        color: #000;
        margin: 40px 0 80px 0;
        font-weight: 700;
    }
    .partner-card-item:nth-child(1){
        min-height: 280px;
        background-size: cover;
        background-position: center center;
        background-repeat: no-repeat;
    }
    .partner-card-item:nth-child(2) {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        text-align: center;
        background-color: #fff;
        margin-bottom:80px;
    }
    .partner-card-item:nth-child(2) p {
        font-size: 14px;
        color:#000;
    }
    /*会员卡信息*/
    .card-information {
        margin: 50px 0 60px 0;
        background-color: #000;
    }
    .card-info-num {
        text-align: center;
    }
    .card-sale-num {
        font-size: 30px;
        color:#fff;
        font-weight: 700;
    }
    .card-sale-unit {
        font-size: 18px;
        color:#fff;
        font-weight: 400!important;
    }
    .card-sale-title {
        margin-top:10px;
        font-size: 18px;
        color:#fff;
        letter-spacing: 5px;
    }
    .card-sale-row {
        display: flex;
        flex-direction: row;
        align-items: center;
        margin-top:40px;
        height:309px;
    }
    .card-sale {
        display: flex;
        flex-direction: row;
        align-items: center;
        justify-content: center;
        width:80%;
        padding:15px;
        background-color: #545454;
    }
    .card-sale-img {
        width:60%;
    }
    .card-sale-intro {
        width:40%;
    }
    .card-sale-intro {
        display: flex;
        flex-direction: column;
        justify-content: center;
        margin-left:80px;
        margin-right:20px;
    }
    .card-sale-intro-title {
        margin-bottom:15px;
        color:#fff;
        font-size: 18px;
        font-weight: 700;
        line-height: 40px;
    }
    .card-sale-intro-info {
        color:#fff;
        font-size: 14px;
        line-height: 40px;
    }
    .card-sale-btn {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        width:20%;
        height:100%;
    }
    .card-sale-btn-item {
        width:100%;
        height:33.1%;
        line-height: 100px;
        text-align: center;
        font-size: 18px;
        color:#D3D3D3;
    }
    .card-sale-btn-item-active {
        background-color: #545454;
    }
    /*莫斯蒂恩你的好帮手*/
    .good-helper {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
    }
    .good-helper-img {
        width: 300px;
        margin-bottom:10px;
    }
    .good-helper-title {
        margin: 15px 0 10px 0;
        font-size: 24px;
        color:#000;
        font-weight: 700;
    }
    .good-helper-txt {
        margin-top:20px;
        font-size: 18px;
        color:#000;
    }
    .good-helper-ul {
        display: flex;
        flex-direction: row;
        align-items: center;
        justify-content: center;
        margin: 20px 0 5px 0;
    }
    .good-helper-item {
        width: 22px;
        height: 22px;
        background-color: #ECAE38;
        transform: rotate(45deg);
    }
    .good-helper-item:nth-child(2){
        margin: 0 30px;
    }
    .good-helper-apply {
        width: 160px;
        margin-top:20px;
        line-height: 40px;
        font-size: 18px;
        color:#fff;
        outline: none;
        border-radius: 5px;
        border:none;
        cursor: pointer;
        background-color:#ECAE38;
    }
</style>
<body>
<div class="page">
    <!--导航栏-->
    <div class="nav">
        <div class="nav-content">
            <img class="nav-logo" src="./img/acos/card/logo.png" alt="">
            <div class="nav-company">
                <p class="company-name">上海莫斯蒂恩科技有限公司</p>
                <span class="company-pinyin">Shanghai&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Mosidian&nbsp;&nbsp;&nbsp;&nbsp;Network&nbsp;&nbsp;&nbsp;&nbsp;Technology&nbsp;&nbsp;&nbsp;&nbsp;Co.,&nbsp;Ltd</span>
            </div>
        </div>
    </div>
    <!--banner -->
    <div class="nav-banner" style="background-image: url(./img/acos/card/banner.png)">
        <div class="banner-content">
            <h1 class="page-title">莫斯蒂恩带您走进高端商业圈</h1>
            <p class="high-business-circle-info">中国付费会员制高端商务品牌</p>
            <img class="aios-content-bg" src="./img/acos/card/card.png" alt="">
            <p class="high-business-date">布局于2015年</p>
            <p class="high-business-date">成立于2020年</p>
            <p class="high-business-date">是致力于打造全球高端商业生态圈得开拓者</p>
        </div>
    </div>
    <#-- 每一个人都是平凡而伟大-->
    <div class="pt-50 pb-80 person-content-bg">
        <div class="container">
            <div class="person-content">
                <div class="person-content-title">
                    <h2 class="person-title">每一个人都是平凡而伟大</h2>
                    <p class="person-detail">TITLETITLE</p>
                </div>
                <ul class="person-content-detail row">
                    <li class="person-content-item col-xs-12 col-sm-5 col-md-5 col-lg-5" style="background-image: url(./img/acos/card/card_one.png)">
                    </li>
                    <li class="person-content-item col-xs-12 col-sm-5 col-md-5 col-lg-5">
                        我们相信，世界上一直存在这样一类人
                        他能够超越自己的初始背景、血缘关系、社会环境
                        能够挣脱时代的束缚，让世界另眼相看
                        这类人我们称之为冒险家
                    </li>
                    <li class="person-content-item col-xs-12 col-sm-2 col-md-2 col-lg-2" style="background-image: url(./img/acos/card/card_two.png)">
                    </li>
                    <li class="person-content-item col-xs-12 col-sm-5 col-md-5 col-lg-5">
                        我们单枪匹马地走进这个世界，只有活出自己
                        的一切可能，愿你今生处处都能生活在江湖上，
                        也有勇气追逐风追逐梦。
                    </li>
                    <li class="person-content-item col-xs-12 col-sm-2 col-md-2 col-lg-2" style="background-image: url(./img/acos/card/card_three.png)">
                    </li>
                    <li class="person-content-item col-xs-12 col-sm-5 col-md-5 col-lg-5">
                        岁月会告诉你，你想要的，不一定都能
                        给你，但只要你有所准备，那么事情就有可能会
                        随之而来。
                    </li>

                </ul>
            </div>
        </div>
    </div>
    <#--MOSIDIAN 你的好伙伴-->
    <div class="your-partner">
        <div class="your-partner-black"></div>
        <div class="your-partner-white"></div>
        <div class="your-partner-gray"></div>
        <div class="your-partner-white"></div>
        <div class="your-partner-black"></div>
        <div class="container your-partner-content">
            <ul class="row">
                <li class="your-partner-item col-xs-12 col-sm-6 col-md-6 col-lg-6" style="background-image: url(./img/acos/card/card_four.png)"></li>
                <li class="your-partner-item col-xs-12 col-sm-6 col-md-6 col-lg-6">
                    岁月会告诉你，你想要的，不一定都
                    能给你，但只要你有所准备，那么事情就
                    有可能会随之而来。
                </li>
                <li class="your-partner-item col-xs-6 col-sm-6 col-md-6 col-lg-6"></li>
                <li class="your-partner-item col-xs-6 col-sm-6 col-md-6 col-lg-6"></li>
                <li class="your-partner-item col-xs-6 col-sm-6 col-md-6 col-lg-6">
                    生活很累，你现在不累，以后会更
                    累。人生很苦，你现在不苦，以后会更苦。除了疲
                    劳，没有什么是空闲的。不尝不甜。
                </li>
                <li class="your-partner-item col-xs-12 col-sm-6 col-md-6 col-lg-6" style="background-image: url(./img/acos/card/card_five.png)"></li>
            </ul>
            <p class="mosidian-your-partner">莫斯蒂恩，你的好伙伴</p>
            <ul class="mosidian-partner-card row">
                <li class="partner-card-item col-xs-12 col-sm-6 col-md-6 col-lg-6" style="background-image: url(./img/acos/card/card_six.png)"></li>
                <li class="partner-card-item col-xs-12 col-sm-6 col-md-6 col-lg-6">
                    <p style="margin-bottom:10px;">边界，是自由的天敌，我们又怎会为你的特权设限</p>
                    <p>独有的企业服务平台</p>
                    <p>莫斯蒂恩，跨界整合权益</p>
                    <p>集合多行业、多种类、多等级特权</p>
                    <p>将不可能化为现实，通用，通行，通达</p>
                    <p style="margin-top:10px;">将无疆倾注于一张会员卡，助会员无界驰骋</p>
                </li>
            </ul>
        </div>
    </div>
    <#--会员卡信息-->
    <div class="card-information pt-50 pb-30">
        <div class="container">
            <ul class="card-info-num row">
                <li class="card-info-item col-xs-4 col-sm-4 col-md-4 col-lg-4">
                    <p class="card-sale-num">10<span class="card-sale-unit">&nbsp;万</span></p>
                    <span class="card-sale-title">持卡会员</span>
                </li>
                <li class="card-info-item col-xs-4 col-sm-4 col-md-4 col-lg-4">
                    <p class="card-sale-num">6<span class="card-sale-unit">&nbsp;个</span></p>
                    <span class="card-sale-title">遍布国家</span>
                </li>
                <li class="card-info-item col-xs-4 col-sm-4 col-md-4 col-lg-4">
                    <p class="card-sale-num">660<span class="card-sale-unit">&nbsp;个</span></p>
                    <span class="card-sale-title">遍布城市</span>
                </li>
            </ul>
            <div class="card-sale-row">
                <div class="card-sale">
                    <img class="card-sale-img" src="./img/acos/card/card_seven.png" alt="">
                    <div class="card-sale-intro">
                            <p class="card-sale-intro-title">包含</p>
                            <p class="card-sale-intro-info" id="member_info">铜卡会员</p>
                            <p class="card-sale-intro-info">一张莫斯帝恩会员卡</p>
                            <p class="card-sale-intro-info">就能帮你解决企业问题</p>
                        </div>
                </div>
                <ul class="card-sale-btn">
                    <li class="card-sale-btn-item card-sale-btn-item-active">铜卡会员</li>
                    <li class="card-sale-btn-item">银卡会员</li>
                    <li class="card-sale-btn-item">金卡会员</li>
                </ul>
            </div>
        </div>
    </div>
<#--    莫斯蒂恩你的好帮手-->
    <div class="good-helper pt-30 pb-40">
        <img class="good-helper-img" src="./img/acos/card/card_eight.png" alt="">
        <p class="good-helper-title">©莫斯蒂恩你的好帮手</p>
        <p class="good-helper-txt">商务/企业</p>
        <ul class="good-helper-ul">
            <li class="good-helper-item"></li>
            <li class="good-helper-item"></li>
            <li class="good-helper-item"></li>
        </ul>
        <p class="good-helper-txt">莫斯蒂恩 全球高端商业生态圈的开拓者</p>
        <p class="good-helper-txt">企业服务理念“创造价值，服务价值”。</p>
        <button class="good-helper-apply">申请会员</button>
    </div>
</div>
<#--公共foot-info引入，尾部-->
<#include "/common/foot_info.ftl"></body>
<#include "/common/footer.ftl">
<script>
    $(function () {
        $(".card-sale-btn li").on('click',function () {
            $(this).addClass('card-sale-btn-item-active').siblings().removeClass('card-sale-btn-item-active')
            var menber_index = $(this).index();

            console.log($('#member_info').text())
            console.log($(this).index())
            if(menber_index==0){
                $('#member_info').text('铜卡会员')
                return
            }
            if(menber_index==1){
                $('#member_info').text('银卡会员')
                return
            }
            if(menber_index==2){
                $('#member_info').text('金卡会员')
                return
            }
        })
    })
</script>
</html>
