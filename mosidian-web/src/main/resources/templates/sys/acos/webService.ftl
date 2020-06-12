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

    /*蔡蔡 14:51:26*/
    .nav {
        position: fixed;
        width:100%;
        height: 60px;
        z-index:5;
        background-color: rgba(13, 13, 13, 0.5);
    }

    /*蔡蔡 14:30:44*/
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

    /*蔡蔡 14:51:25*/
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
    /*.nav-banner {*/
    /*    display: flex;*/
    /*    flex-direction: column;*/
    /*    align-items: center;*/
    /*    justify-content: flex-end;*/
    /*    width:100%;*/
    /*    height:320px;*/
    /*    background-repeat: no-repeat;*/
    /*    background-position: center;*/
    /*    background-size: cover;*/
    /*}*/
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
    .our-services-line {
        width:100%;
        margin: 10px 0 30px 0;
        border-top:1px solid #DDDDDD;
    }
    .our-services-content {
        display: flex;
        flex-direction: row;
        align-items: center;
        justify-content: space-between;
    }
    .our-services-item {
        position: relative;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        width:12%;
        height: 170px;
        padding:20px;

    }
    .our-services-active {
        box-shadow: 0px 3px 8px 1px #ccc;
    }
    .our-services-active .our-services-item-line {
        position: absolute;
        top:-32px;
        left:50%;
        transform: translateX(-50%);
        width:40px;
        height:3px;
        background-color: #3599B9;
        transition: all .3s linear;
    }
    .our-services-item-icon {
        display: flex;
        flex-direction: row;
        align-items: center;
        justify-content: center;
        width:60px;
        height:60px;
        border-radius: 50%;
        background-color: #DFDFDF;
    }
    .our-services-active .our-services-item-ring-bg {
        background-color: #3599B9!important;
    }
    .our-services-icon {
        display: flex;
        flex-direction: row;
        align-items: center;
        justify-content: center;
        width:50px;
        height:50px;
        border-radius: 50%;
        border:1px solid #fff;
    }
    .services-icon {
        width:32px;
        height:32px;
        border-radius: 50%;
    }
    .our-services-item-title {
        margin:10px 0 5px 0;
        font-size: 14px;
        color:#262626;
    }
    .our-services-item-info {
        font-size: 10px;
        color:#262626;
    }
    .our-services-look-detail {
        display: none;
    }
    .our-services-active .our-services-look-detail {
        display: block;
        position: absolute;
        bottom: -45px;
        width: 56px;
        border: none;
        outline: none;
        cursor: pointer;
        font-size: 9px;
        background-color: #3599B9;
        color: #fff;
        line-height: 20px;
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
            <img class="nav-logo" src="./img/acos/webService/logo.png" alt="">
            <div class="nav-company">
                <p class="company-name">上海莫斯蒂恩科技有限公司</p>
                <span class="company-pinyin">Shanghai&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Mosidian&nbsp;&nbsp;&nbsp;&nbsp;Network&nbsp;&nbsp;&nbsp;&nbsp;Technology&nbsp;&nbsp;&nbsp;&nbsp;Co.,&nbsp;Ltd</span>
            </div>
        </div>
    </div>
    <!--莫斯蒂恩，网络服务 -->
    <div class="nav-banner" style="background-image: url(./img/acos/webService/banner.png)">
        <p class="nav-banner-title">莫斯蒂恩&nbsp;&nbsp;网络服务</p>
    </div>
    <!--我们的服务-->
    <div class="our-services-contain">
        <div class="our-services">
            <h2 class="our-services-title">我们的服务</h2>
            <span class="our-services-detail">TITLETITLE</span>
            <div class="our-services-line"></div>
            <ul class="our-services-content">
                <li class="our-services-item ">
                    <div class="our-services-item-line"></div>
                    <div class="our-services-item-icon our-services-item-ring-bg">
                        <div class="our-services-icon">
                            <img class="services-icon" src="./img/acos/webService/serviceOne.png" alt="">
                        </div>
                    </div>
                    <p class="our-services-item-title">商城开发</p>
                    <span class="our-services-item-info">商城系统开发、商城网站定制</span>
                    <button class="our-services-look-detail">查看详情</button>

                </li>
                <li class="our-services-item">
                    <div class="our-services-item-line"></div>
                    <div class="our-services-item-icon our-services-item-ring-bg">
                        <div class="our-services-icon">
                            <img class="services-icon" src="./img/acos/webService/serviceTwo.png" alt="">
                        </div>
                    </div>
                    <p class="our-services-item-title">SEO优化</p>
                    <span class="our-services-item-info">网站SEO优化、百度首页排名优化、网站快照更新</span>
                    <button class="our-services-look-detail">查看详情</button>
                </li>
                <li class="our-services-item our-services-active">
                    <div class="our-services-item-line"></div>
                    <div class="our-services-item-icon our-services-item-ring-bg">
                        <div class="our-services-icon">
                            <img class="services-icon" src="./img/acos/webService/serviceThree.png" alt="">
                        </div>
                    </div>
                    <p class="our-services-item-title">微信小程序</p>
                    <span class="our-services-item-info">微信小程序开发、微信公众号小程序定制</span>
                    <button class="our-services-look-detail">查看详情</button>
                </li>
                <li class="our-services-item">
                    <div class="our-services-item-line"></div>
                    <div class="our-services-item-icon our-services-item-ring-bg">
                        <div class="our-services-icon">
                            <img class="services-icon" src="./img/acos/webService/serviceFour.png" alt="">
                        </div>
                    </div>
                    <p class="our-services-item-title">管理软件</p>
                    <span class="our-services-item-info">物流后台管理软件</span>
                    <button class="our-services-look-detail">查看详情</button>

                </li>
                <li class="our-services-item">
                    <div class="our-services-item-line"></div>
                    <div class="our-services-item-icon our-services-item-ring-bg">
                        <div class="our-services-icon">
                            <img class="services-icon" src="./img/acos/webService/serviceFive.png" alt="">
                        </div>
                    </div>
                    <p class="our-services-item-title">服务器</p>
                    <span class="our-services-item-info">网站服务器建设</span>
                    <button class="our-services-look-detail">查看详情</button>

                </li>
            </ul>
        </div>
    </div>
    <!--莫斯蒂恩开发工程师-->
    <div class="our-services-contain" style="background-image: url(./img/acos/webService/engineer.png)">
        <div class="our-services mosidien-engineer">
            <img class="mosidien-engineer-logo" src="./img/acos/webService/logo.png" alt="">
        </div>
    </div>
    <!--关于我们-->
    <div class="about-us-contain">
        <div class="about-us">
            <div class="about-us-img" style="background-image: url(./img/acos/webService/aboutUs.png)"></div>
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
<#include "/common/foot_info.ftl">
</body>
<#include "/common/footer.ftl">
<script>
    $(function () {
        $(".our-services-item").on('click',function () {
            $(this).addClass('our-services-active').siblings().removeClass('our-services-active')
        })
    })
</script>

