<#include "/common/header.ftl">
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>即时业务</title>
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
        width:100%;
        height: 85px;
        /*background: #3d3d3d;*/
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
        width:160px;
        height:50px;
    }





    /*    banner*/
    .rank-banner {
        width: 100%;
        height: 300px;
        background-position: center center;
        background-repeat: no-repeat;
        background-size: cover;
    }
    .rank-banner-title {
        text-align: center;
        line-height: 300px;
        font-size: 36px;
        font-weight: 500;
        letter-spacing: 1px;
        color: #fff;
    }
    /*main-banner*/
    .main {
        width: 100%;
        margin-top:-3px;
        background: #fff;
    }
    .main-banner {
        width: 1200px;
        margin:0 auto;
        padding:70px 0 100px 0;
    }
    .main-banner-title {
        position: relative;
        text-align: center;
    }
    .main-banner-rectangular {
        width:280px;
    }
    .main-type-title {
        position: absolute;
        top:-10px;
        left:50%;
        transform: translateX(-50%);
        font-size: 18px;
        color: #333;
    }
    .main-type-detail {
        position: absolute;
        bottom:0;
        left:50%;
        transform: translateX(-50%);
        font-size: 12px;
        color:#656565;
    }
    .main-banner-content {
        display: flex;
        flex-direction: row;
        align-items: center;
        justify-content: space-between;
        margin-top:30px;
    }
    .main-banner-item {
        width:30%;
        position: relative;
    }
    .main-banner-item-bg {
        width: 100%;
        height:220px;
        position: relative;
        background-size: cover;
        background-position: center center;
        background-repeat: no-repeat;
    }
    .main-banner-item-tag {
        position: absolute;
        bottom:0;
        left:0;
        right:0;
        height:30px;
        text-align: center;
        line-height: 30px;
        font-size: 12px;
        color:#fff;
        background:rgba(0,0,0,.5);
    }
    .main-banner-item-detail {
        position: absolute;
        bottom:-50px;
        left:50%;
        transform: translateX(-50%);
        width:80px;
        height:30px;
        color:#fff;
        text-align: center;
        line-height: 30px;
        border:none;
        outline: none;
        cursor: pointer;
        border-radius: 5px;
        background-color: #1C85DFFF;
    }
    .easy-main {
        background-color: #ECEFF3FF;
    }
    .easy-main .main-banner-item-bg {
        height:200px;
    }
    .easy-main .main-banner-item {
        background-color: #fff;
    }
    .easy-main-item-detail {
        position: relative;
        height:130px;
        padding:15px 20px 15px 20px;
    }
    .easy-main-title {
        font-size: 12px;
        color:#000000FF;
    }
    .easy-main-detail {
        position: absolute;
        bottom:15px;
        right:20px;
        font-size: 12px;
        color:#1B85DFFF!important;
        text-decoration: none;
    }

</style>
<body>
<div class="page">
    <!--导航栏-->
    <div class="nav">
        <div class="nav-content">
            <img class="nav-logo" src="./img/acos/business/logo.png" alt="">
            <ul class="nav-ul">
                <li class="nav-li show-border">
                    <span class="nav-title">企业LOGO</span>
                </li>
                <li class="nav-li">
                    <span class="nav-title">网站LOGO</span>
                </li>
                <li class="nav-li">
                    <span class="nav-title">餐饮LOGO</span>
                </li>
                <li class="nav-li">
                    <span class="nav-title">机械LOGO</span>
                </li>
                <li class="nav-li">
                    <span class="nav-title">科技LOGO</span>
                </li>
                <li class="nav-li">
                    <span class="nav-title">联系我们</span>
                </li>
            </ul>
        </div>
    </div>
    <!--rank-banner-->
    <div class="rank-banner" style="background:#101010;">
        <h1 class="rank-banner-title">莫斯蒂恩LOGO设计</h1>
    </div>
    <!--main-banner-->
    <div class="main">
        <div class="main-banner">
            <div class="main-banner-title">
                <img class="main-banner-rectangular" src="./img/acos/business/rectangular.png" alt="">
                <h2 class="main-type-title">大气企业LOGO</h2>
                <span class="main-type-detail">LOGO是一个企业的灵魂</span>
            </div>
            <ul class="main-banner-content">
                <li class="main-banner-item">
                    <div class="main-banner-item-bg" style="background-image: url(./img/acos/business/a.png)">
                        <div class="main-banner-item-tag">
                            678家企业购买了此服务
                        </div>
                    </div>
                    <button class="main-banner-item-detail" id="consult1">详情</button>
                </li>
                <li class="main-banner-item">
                    <div class="main-banner-item-bg" style="background-image: url(./img/acos/business/b.png)">
                        <div class="main-banner-item-tag">
                            658家企业购买了此服务
                        </div>
                    </div>
                    <button class="main-banner-item-detail" id="consult2">详情</button>
                </li>
                <li class="main-banner-item">
                    <div class="main-banner-item-bg" style="background-image: url(./img/acos/business/c.png)">
                        <div class="main-banner-item-tag">
                            666家企业购买了此服务
                        </div>
                    </div>
                    <button class="main-banner-item-detail" id="consult3">详情</button>
                </li>
            </ul>
        </div>
    </div>
    <div class="main easy-main">
        <div class="main-banner">
            <div class="main-banner-title">
                <img class="main-banner-rectangular" src="./img/acos/business/rectangular.png" alt="">
                <h2 class="main-type-title">简约LOGO</h2>
                <span class="main-type-detail">LOGO是一个企业的第一形象</span>
            </div>
            <ul class="main-banner-content">
                <li class="main-banner-item">
                    <div class="main-banner-item-bg" style="background-image: url(./img/acos/business/d.png)">
                    </div>
                    <div class="easy-main-item-detail">
                        <p class="easy-main-title">简单好记</p>
                        <a class="easy-main-detail" id="consult4">了解详情</a>

                    </div>
                </li>
                <li class="main-banner-item">
                    <div class="main-banner-item-bg" style="background-image: url(./img/acos/business/e.png)">
                    </div>
                    <div class="easy-main-item-detail">
                        <p class="easy-main-title">简介传统</p>
                        <a class="easy-main-detail" id="consult5">了解详情</a>

                    </div>
                </li>
                <li class="main-banner-item">
                    <div class="main-banner-item-bg" style="background-image: url(./img/acos/business/f.png)">
                    </div>
                    <div class="easy-main-item-detail">
                        <p class="easy-main-title">简易识别</p>
                        <a class="easy-main-detail" id="consult6">了解详情</a>

                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
</body>
<script src="js/jquery-3.4.1.min.js"></script>
<script>
    $(function () {
        $(".nav-li").on('click',function () {
            $('.nav-li').eq($(this).index()).addClass('show-border');
            $('.nav-li').eq($(this).index()).siblings().removeClass('show-border');
            var nav_index = $(this).index();
            if(nav_index==0){
                $(".rank-banner-title").html('莫斯蒂恩企业LOGO设计');
                return false;
            }
            if(nav_index==1){
                $(".rank-banner-title").html('莫斯蒂恩网站LOGO设计');
                return false;
            }
            if(nav_index==2){
                $(".rank-banner-title").html('莫斯蒂恩餐饮LOGO设计');
                return false;
            }
            if(nav_index==3){
                $(".rank-banner-title").html('莫斯蒂恩机械LOGO设计');
                return false;
            }
            if(nav_index==4){
                $(".rank-banner-title").html('莫斯蒂恩科技LOGO设计');
                return false;
            }
        })

        $("#consult1").click(function () {
            dolphin.iframe("/sys/acos/consult1", "联系我们", "420px", "430px")
        })
        $("#consult2").click(function () {
            dolphin.iframe("/sys/acos/consult1", "联系我们", "420px", "410px")
        })
        $("#consult3").click(function () {
            dolphin.iframe("/sys/acos/consult1", "联系我们", "420px", "410px")
        })
        $("#consult4").click(function () {
            dolphin.iframe("/sys/acos/consult1", "联系我们", "420px", "410px")
        })
        $("#consult5").click(function () {
            dolphin.iframe("/sys/acos/consult1", "联系我们", "420px", "410px")
        })
        $("#consult6").click(function () {
            dolphin.iframe("/sys/acos/consult1", "联系我们", "420px", "410px")
        })
    })
</script>
<#include "/common/footer.ftl">
</html>
