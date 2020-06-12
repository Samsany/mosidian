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
    <link rel="shortcut icon" href="./img/favicon1.png" type="image/png">
    <!--====== Bootstrap css ======-->
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <!--====== Fontawesome css ======-->
    <link rel="stylesheet" href="./css/fontawesome-all.min.css">
    <!--====== Slick css ======-->
    <link rel="stylesheet" href="./css/slick.css">
    <link rel="stylesheet" href="./css/slick-theme.css">
    <!--====== Magnific Popup css ======-->
    <link rel="stylesheet" href="./css/magnific-popup.css">
    <!--====== Animate css ======-->
    <link rel="stylesheet" href="./css/animate.min.css">
    <!--====== Default css ======-->
    <link rel="stylesheet" href="./css/default.css">
    <!--====== Style css ======-->
    <link rel="stylesheet" href="./css/style.css">
    <!--====== Responsive css ======-->
    <link rel="stylesheet" href="./css/responsive.css">
    <link rel="stylesheet" type="text/css" href="./css/macroease.css"/>
    <link rel="stylesheet" type="text/css" href="./layui/css/modules/layer/default/layer.css"/>
    <link rel="stylesheet" type="text/css" href="./layui/css/modules/laydate/default/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="./layui/css/layui.css"/>
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
    .nav {
        position: fixed;
        width:100%;
        height: 60px;
        z-index:5;
        background-color: rgba(13, 13, 13, 0.6);
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
        color: #656565;
    }
    .nav-logo {
        width:160px;
        height:50px;
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
        justify-content: flex-end;
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
    /*我们的服务*/
    .our-services-contain {
    }
    .our-services {
        width:1200px;
        margin:0 auto;
        padding:40px 0 25px 0;
        text-align: center;
    }
    .our-services-title {
        font-size: 15px;
        color:#117A9AFF;
    }
    .our-services-detail {
        font-size: 8px;
        color:#D3D5DDFF;
    }
    .precision-marketing-content {
        position: relative;
        width: 600px;
        height: 500px;
        margin:15px auto 0 auto;
    }
    .precision-market-item{
        width:100%;
        height:100%;
    }
    .precision-market-item .precision-market-img {
        width: 100%;
    }

    /*    莫斯蒂恩开发工程师*/
    .mosidien-engineer {
        margin:80px auto 0 auto;
        padding:80px 0;

    }
    .mosidien-engineer .our-services-title {
        color:#fff;
    }
    .mosidien-engineer .our-services-item-line {
        background-color: #DDDDDD;
    }
    .mosidien-engineer-content {
        display: flex;
        flex-direction: row;
        align-items: center;
    }
    .mosidien-engineer-item {
        width:25%;
        height:200px;
    }
    .mosidien-engineer-item:nth-child(1){
        background-color: #4D75BB;
    }

    .mosidien-engineer-icon {
        width: 50px;
        height:50px;
        border-radius: 50%;
        background-size: cover;
        background-position: center center;
        background-repeat: no-repeat;
        background-color: #0B172F;
    }
    .mosidien-engineer-logo {
        width: 300px;
    }
    /*关于我们*/
    .about-us-contain {
        width:100%;
    }
    .about-us {
        display: flex;
        flex-direction: row;
        align-items: center;
        width: 1200px;
        padding: 50px 0;
        margin: 0 auto;
    }
    .about-us-img {
        min-width:20%;
        height:150px;
        background-repeat: no-repeat;
        background-position: center center;
        background-size: cover;
    }
    .about-us-content {
        display: flex;
        flex-direction: column;
        align-items: flex-start;
        width:50%;
        margin-left:5%;
    }
    .about-us-title {
        margin-bottom:20px;
        text-align: center;
    }
    .about-us-txt {
        font-size: 18px;
        color:#009AD9;
    }
    .about-us-en {
        font-size: 10px;
        color:#A7A7A7;
    }
    .about-us-introduce {
        line-height: 20px;
        font-size: 10px;
        color:#777;
    }
</style>
<body>
<div class="page">
    <!--导航栏-->
    <div class="nav">
        <div class="nav-content">
            <img class="nav-logo" src="./img/acos/promote/logo.png" alt="">
            <div class="nav-company">
                <p class="company-name">上海莫斯蒂恩科技有限公司</p>
                <span class="company-pinyin">Shanghai&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Mosidian&nbsp;&nbsp;&nbsp;&nbsp;Network&nbsp;&nbsp;&nbsp;&nbsp;Technology&nbsp;&nbsp;&nbsp;&nbsp;Co.,&nbsp;Ltd</span>
            </div>
        </div>
    </div>
    <!--莫斯蒂恩，精准推广 -->
    <div class="nav-banner" style="background-image: url(./img/acos/promote/banner.png)">
        <p class="nav-banner-title">莫斯蒂恩&nbsp;&nbsp;精准推广</p>
    </div>
    <!--全方位营销-->
    <div class="our-services-contain">
        <div class="our-services">
            <h2 class="our-services-title">全方位营销</h2>
            <span class="our-services-detail">TITLETITLE</span>
            <ul class="precision-marketing-content">
                <li class="precision-market-item">
                    <img class="precision-market-img" src="./img/acos/promote/content.png" alt="">
                </li>
            </ul>
        </div>
    </div>

    <!--关于我们-->
    <div class="about-us-contain">
        <div class="about-us">
            <div class="about-us-img" style="background-image: url(./img/acos/promote/aboutUs.png)"></div>
            <div class="about-us-content">
                <div class="about-us-title">
                    <h2 class="about-us-txt">关于我们</h2>
                    <span class="about-us-en">about us</span>
                </div>
                <p class="about-us-introduce">莫斯蒂恩网络服务，成立于2020年6月18日。迄今为止已在全国服务超过1420家公司，强大的建设团队，与公司的高效携作，使得建设工程进展迅速，获得业界好评。</p>
            </div>
        </div>
    </div>

</div>
<#--公共foot-info引入，尾部-->
<#include "/common/foot_info.ftl"></body>
<#include "/common/footer.ftl">
<script>
    $(function () {

    })
</script>
</html>
