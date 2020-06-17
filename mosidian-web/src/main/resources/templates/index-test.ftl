<!doctype html>
<html lang="zxx">

<head>
    <!--====== Required meta tags ======-->
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!--====== Title ======-->
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

<body>


<!--[if lte IE 9]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please upgrade
    your browser to improve your experience and security.</p>
<![endif]-->
<!--====== PREALODER PART START ======-->

<div class="preloader">
    <div class="loader graph">
        <div class="layer layer-1 color-1"></div>
        <div class="layer layer-2 color-2"></div>
        <div class="layer layer-3 color-1"></div>
        <div class="layer layer-4 color-2"></div>
        <div class="layer layer-5 color-1"></div>
    </div>
</div>
<!--====== PREALODER PART ENDS ======-->

<!--====== 导航栏 START ======-->
<nav   class="navbar navbar-expand-lg" >
    <div class="container navbar-cell">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navBarBag" id="bagBtn1">
            <span style="color: white">N</span>
            <!--            <span class="icon-bar"></span>-->
            <!--            <span class="icon-bar"></span>-->
            <!--            <span class="icon-bar"></span>-->
        </button>

        <!--- LOGO  --->
        <a class="navbar-brand" href="javascript:" data-toggle="modal" data-target=".bs-mosidian-modal-lg">
            <img src="img/logo.png" alt="Logo" style="width: 160px;height: 40px">
        </a>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navBarBag" id="bagBtn2"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span style="color: white">S</span>
        </button>

        <div class="collapse navbar-collapse" id="navBarBag">
            <ul class="navbar-nav">
                <li class="nav-item navBag1">
                    <a data-scroll-nav="0" href="#" class="language-change-en">HOME</a>
                    <a data-scroll-nav="0" href="#" class="language-change-zh">官网首页</a>
                </li>
                <li class="nav-item navBag1">
                    <a data-scroll-nav="1" href="#" class="language-change-en">COSE</a>
                    <a data-scroll-nav="1" href="#" class="language-change-zh">企业服务</a>
                </li>
                <li class="nav-item navBag1">
                    <a data-scroll-nav="2" href="#" class="language-change-en">ACOS</a>
                    <a data-scroll-nav="2" href="#" class="language-change-zh">业务系统</a>
                </li>
                <li class="nav-item navBag1">
                    <a data-scroll-nav="3" href="#" class="language-change-en">AiOS</a>
                    <a data-scroll-nav="3" href="#" class="language-change-zh">招商系统</a>
                </li>
                <li class="nav-item navBag1">
<#--                    bcLogin-->
                    <a href="#" data-scroll-nav="4"  class="language-change-en">BCOS</a>
                    <a href="#" data-scroll-nav="4"  class="language-change-zh">客户系统</a>
                </li>
                <li class="nav-item navBag1">
                    <a data-scroll-nav="5" href="#" class="language-change-en">ICOS</a>
                    <a data-scroll-nav="5" href="#" class="language-change-zh">保障系统</a>
                </li>
                <li class="nav-item navBag1">
                    <a href="meLogin" class="language-change-en">MEOS</a>
                    <a href="meLogin" class="language-change-zh">会员系统</a>
                </li>
                <li class="nav-item navBag1">
                    <a data-scroll-nav="6" href="#" class="language-change-en">TMIC</a>
                    <a data-scroll-nav="6" href="#" class="language-change-zh">我的团队</a>
                </li>
                <li class="nav-item navBag1">
                    <a data-scroll-nav="7" href="#" class="language-change-en">COWE</a>
                    <a data-scroll-nav="7" href="#" class="language-change-zh">联系我们</a>
                </li>
                <li class="nav-item navBag1">
                    <a tabindex="0"
                       id="popup-box"
                       data-toggle="popover"
                       data-trigger="focus"><i
                                class="iconfont icon56"></i></a>
                </li>
                <li class="nav-item navBag2">
                    <a data-scroll-nav="10" href="#" id="registerUser">
                        <i class='iconfont  iconfriendadd'></i>
                        注册</a>
                </li>
                <li class="nav-item navBag2">
                    <a data-scroll-nav="11" href="meLogin" >
                        <i class='iconfont  iconfriend'></i>登录</a>
                </li>
                <li class="nav-item navBag2">
                    <a data-scroll-nav="12" href="#" >
                        <i class='iconfont iconsort'></i>订单</a>
                </li>
                <li class="nav-item navBag2">
                    <a data-scroll-nav="13" href="#" >
                        <i class='iconfont iconlike'></i>收藏</a>
                </li>
                <li class="nav-item navBag2">
                    <a data-scroll-nav="14" href="#" >
                        <i class='iconfont icongouwuche'></i>售后服务</a>
                </li>
            </ul>
        </div>
        <div class="lang-change">
            <button id="langZh" class="lang-zh">中文</button>
            <span>\</span>
            <button id="langEn" class="lang-en" style="color:#1f8fff">EN</button>
        </div>

    </div>
</nav>
<!--====== 导航栏 ENDS ======-->

<!--====== 轮播图 START ======-->
<div class="slider_part" data-scroll-index="0">
        <div class="singel_slider d-flex align-items-center bg_cover" data-overlay="7"
             style="background-image: url(img/swiper/swiper1.jpg)">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8">
                        <div class="caption text-left">

                            <h4 style="color: white">莫斯蒂恩深耕企业服务行业，是您企业值得依赖的合作伙伴</h4>
                            <p>莫斯蒂恩为企业提供多领域的服务，以专业服务弥补企业发展短板，帮助企业专注于核心业务，在自己的专业领域提升竞争力。世界专业而美好，莫斯蒂恩则致力于用服务让企业更专业。</p>
                            <a href="#"><h4>为什么选择莫斯蒂恩 ></h4></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="singel_slider d-flex align-items-center bg_cover" data-overlay="7"
             style="background-image: url(img/swiper/swiper2.png)">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 offset-lg-2">
                        <div class="caption text-center" style="position: relative;text-align: center;top: 40%;">

                            <h4 style="color: white">上海莫斯蒂恩网络科技有限公司</h4>
                            <p>
                                上海莫斯蒂恩网络科技有限公司，总部位于上海市奉贤区，
                                是一家基于互联网信息服务方面的创新型企业。公司始终以“为客户提供整体解决方案、
                                为客户创造价值”为目标，在“和谐、上进、奉献、包容、厚德”企业文化的倡导下，让上海莫斯蒂恩网络科技有限公司的每一位员工分享公司成长带来的收获和喜悦。
                            </p>

                            <a href="#"><h4>进一步了解 ></h4></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="singel_slider d-flex align-items-center bg_cover" data-overlay="7"
             style="background-image: url(img/swiper/swiper3.jpg)">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 offset-lg-4">
                        <div class="caption text-right">
                            <h4 style="color: white">团队介绍

                            </h4>

                            <p> 我们是一支专业的团队。我们的成员拥有多年的网站专业技术背景</br>
                                我们是一支年轻的团队。充满了朝气和创新精神</br>
                                我们是一支专注的团队。我们坚信，品质源自客户的信任。只有专注，才能做好品质</p>
                            <a href="#"><h4>关于我们 ></h4></a>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
<!--====== 轮播图 PART ENDS ======-->

<!--====== 企业服务 COSE PART START 新版======-->
<!--====== 企业服务 COSE PART START 旧版待定======-->
<div  class="about pb-20 pt-95 " data-scroll-index="1">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 offset-lg-2">
                <div class="section_title text-center">
                    <h2>为什么选择莫斯蒂恩</h2>
                    <p>莫斯蒂恩为企业提供多领域的服务，以专业服务弥补企业发展短板，帮助企业专注于核心业务，在自己的专业领域提升竞争力。世界专业而美好，莫斯蒂恩则致力于用服务让企业更专业。</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
                <div class="about_text pt-70">
                    <#--                    <span>多维度客户需求全面感知</span>-->
                    <h3 style="font-size: 20px;">莫斯蒂恩深耕企业服务行业，是您企业值得依赖的合作伙伴</h3>
                    <ul class="nav nav-tabs row" id="myTab" role="tablist" style="margin-left:20px;">
                        <li class="nav-item ">
                            <a class="active" id="misson-tab" data-toggle="tab" href="#misson" role="tab"
                               aria-controls="misson" aria-selected="true">工商服务</a>
                        </li>
                        <li class="nav-item ">
                            <a id="gol-tab" data-toggle="tab" href="#gol" role="tab" aria-controls="gol"
                               aria-selected="false">综合服务</a>
                        </li>
                        <li class="nav-item ">
                            <a id="vision-tab" data-toggle="tab" href="#vision" role="tab" aria-controls="vision"
                               aria-selected="false">建站服务</a>
                        </li>
                    </ul>
                    <div class="tab-content" id="myTabContent" style="margin-left:20px;">
                        <div class="tab-pane fade show active" id="misson" role="tabpanel" aria-labelledby="misson-tab">
                            <p onclick="serviceModulel(1)">公司注册</p>
                            <p onclick="serviceModulel(2)">社保开户</p>
                            <p onclick="serviceModulel(3)">公积金开户</p>
                            <p onclick="serviceModulel(4)">法人信息变更</p>
                        </div>
                        <div class="tab-pane fade" id="gol" role="tabpanel" aria-labelledby="gol-tab">
                            <p onclick="serviceModulel(5)">版权服务</p>
                            <p onclick="serviceModulel(6)">商标服务</p>
                            <p onclick="serviceModulel(7)">法律服务</p>
                            <p onclick="serviceModulel(8)">证件服务</p>
                        </div>
                        <div class="tab-pane fade" id="vision" role="tabpanel" aria-labelledby="vision-tab">
                            <p onclick="serviceModulel(9)">企业建站</p>
                            <p onclick="serviceModulel(10)">一站式服务</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-6">
                <div class="about_video pt-70">
                    <div class="ovarlay" data-overlay="5">
                        <img src="img/about/1.png" alt="About Video">
                    </div>
                    <div class="video_icon">
                        <a class="Video-popup" href="https://www.youtube.com/watch?v=Joz1xBi7ex8"><i
                                    class="fa fa-play"></i></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--====== 企业服务 COSE PART ENDS 旧版待定 ======-->
<!--====== 企业服务 COSE PART ENDS 新版 ======-->

<!--=================================== ACOS 业务系统 ========================================-->
<div  style="background-color: #0b0b0b" data-scroll-index="2">
    <div class="acosPC section_title text-center">
        <h2 style="color: white" >业务系统</h2>
        <p style="color: white">本方案提供财务、进销存、批量订货、
            生产管理、多门店经营、风险预警、智能记帐等常见功能，打通企业管理的“人财货客”全链条</p>
        <div class="Grid"
             style="margin:0 auto; display: flex;width: 1140px;height: 200px; align-items:center;justify-content:space-around;">
            <div style="width: 260px;height: 150px;background: url(./img/business/businessMp1.jpg) 260px 150px">
                <p id="slide1" class="business-system-item">
                    <a href="acosWebService">科技为先</a>
                </p>
            </div>
            <div style="width: 260px;height: 150px;background: url(./img/business/businessMp2.jpg) 260px 150px">
                <p id="slide2" class="business-system-item">
                    <a href="acosPerson">以人为本</a></p>
            </div>
            <div style="width: 260px;height: 150px;background: url(./img/business/businessMp3.jpg) 260px 150px">
                <p id="slide3" class="business-system-item">
                <a href="acosOffice">随时办公</a></p>
            </div>
            <div style="width: 260px;height: 159px;background: url(./img/business/businessMp4.jpg) 260px 150px">
                <p id="slide4" class="business-system-item">
                    <a href="acosUrl">即时业务</a>
                </p>
            </div>
        </div>
        <div id="show"
             style="width: 1120px;height: 100px; position: relative;display:block; margin:0 auto;">
            <div style="width:900px;height: 100px;display:block;position: absolute;left: 0;top: 0;bottom: 0;right: 0;margin: auto;">
                <h3 id="showh" style="color: white">会员系统</h3>
                <p id="showp1" style="color: white"></p>
                <p id="showp2" style="color: white">财富不能创造文化,文化却能创造财富</p>
            </div>
        </div>
        <div class="Grid"
             style="margin: 0 auto;display: flex;width: 1140px;height: 200px; align-items:center;justify-content:space-around;">
            <div style="width: 260px;height: 150px;background: url(img/business/businessMp5.jpg) 260px 150px">
                <p id="slide5" class="business-system-item">
                    <a href="acosPromote">精准推广</a>
                </p>
            </div>
            <div style="width: 260px;height: 150px;background: url(img/business/businessMp6.jpg) 260px 150px">
                <p id="slide6" class="business-system-item">
                    <a href="acosBackground">专业后台</a>
                </p>
            </div>
            <div style="width: 260px;height: 150px;background: url(img/business/businessMp7.jpg) 260px 150px">
                <p id="slide7" class="business-system-item">
                    <a href="acosTechnology">科技改变</a>
                </p>
            </div>
            <div style="width: 260px;height: 159px;background: url(img/business/businessMp8.jpg) 260px 150px">
                <p id="slide8" class="business-system-item">
                    <a href="acosCustomer">专属客服</a>
                </p>
            </div>
        </div>
    </div>
    <!--====== ACOS 业务系统 ipad\移动适配下的样式  ======-->
    <div data-scroll-index="2" class="acosMP pb-10 pt-50">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 offset-lg-2">
                    <div class="section_title text-center">
                        <h2 class="business-system-color">业务系统</h2>
                        <p class="business-system-color" style="padding-top: 20px;font-size: 10px">本方案提供财务、进销存、批量订货、 生产管理、多门店经营、风险预警、智能记帐等常见功能，打通企业管理的“人财货客”全链条。</p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="Grid"
                     style="display: flex;width: 1140px; display: -webkit-flex;flex-wrap: wrap;align-items:center;justify-content:space-around;">
                    <div style="width: 260px;height: 280px;">
                        <img src="img/business/businessMp1.jpg"
                             style="display:block; margin:0 auto;width:100px; height:100px;background-size: cover;-webkit-clip-path: polygon(50% 0, 100% 25%, 100% 75%, 50% 100%, 0 75%, 0 25%);clip-path: polygon(50% 0, 100% 25%, 100% 75%, 50% 100%, 0 75%, 0 25%);">
                        <h5 style="text-align: center">以人为本</h5>
                        <hr/>
                        <p class="business-system-color" style="font-size: 12px;text-align: center">满足初创需求</p>
                        <hr/>
                        <p class="business-system-color" style="font-size: 13px">初创公司的核心不是技术能力，提供满足需求的ERP等心选产品。</p>
                    </div>
                    <div style="width: 260px;height: 280px;">
                        <img src="img/business/businessMp2.jpg"
                             style="display:block; margin:0 auto;width:100px; height:100px;background-size: cover;-webkit-clip-path: polygon(50% 0, 100% 25%, 100% 75%, 50% 100%, 0 75%, 0 25%);clip-path: polygon(50% 0, 100% 25%, 100% 75%, 50% 100%, 0 75%, 0 25%);">
                        <h5 style="text-align: center">规范管理员工</h5>
                        <hr/>
                        <p class="business-system-color" style="font-size: 12px;text-align: center">规范管理员工</p>
                        <hr/>
                        <p class="business-system-color" style="font-size: 13px">通过系统规范员工行为，避免损害公司利益的行为。</p>
                    </div>
                    <div style="width: 260px;height: 280px;">
                        <img src="img/business/businessMp3.jpg"
                             style="display:block; margin:0 auto;width:100px; height:100px;background-size: cover;-webkit-clip-path: polygon(50% 0, 100% 25%, 100% 75%, 50% 100%, 0 75%, 0 25%);clip-path: polygon(50% 0, 100% 25%, 100% 75%, 50% 100%, 0 75%, 0 25%);">
                        <h5 class="business-system-color" style="text-align: center">随时随地移动办公</h5>
                        <hr/>
                        <p class="business-system-color" style="font-size: 12px;text-align: center">成为用户体验最佳的互联网金融平台</p>
                        <hr/>
                        <p class="business-system-color" style="font-size: 13px">随时随地管理企业需求，打通企业管理的“人财货客”全链条。</p>
                    </div>
                    <div style="width: 260px;height: 280px;">
                        <img src="img/business/businessMp4.jpg"
                             style="display:block; margin:0 auto;width:100px; height:100px;background-size: cover;-webkit-clip-path: polygon(50% 0, 100% 25%, 100% 75%, 50% 100%, 0 75%, 0 25%);clip-path: polygon(50% 0, 100% 25%, 100% 75%, 50% 100%, 0 75%, 0 25%);">
                        <h5 class="business-system-color" style="text-align: center">即时业务洞察</h5>
                        <hr/>
                        <p class="business-system-color" style="font-size: 12px;text-align: center">成为用户体验最佳的互联网金融平台</p>
                        <hr/>
                        <p class="business-system-color" style="font-size: 13px">简易搭建专业水准的可视化大屏，进行即时业务洞察。</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--==================================== ACOS 业务系统 ========================================-->


<!--==AIOS(招商)莫斯蒂恩带您走向高端商业圈==-->
<#--莫斯蒂恩带您走向高端商业圈--------新版-->
<div class="aios-high-business-circle pt-50" data-scroll-index="3">
    <div class="container-fluid high-business-circle-container">
        <div class="row aios">
            <div class="col-lg-8 offset-lg-2">
                <div class="section_title text-center">
                    <h1 class="page-title">莫斯蒂恩带您走进高端商业圈</h1>
                    <p class="high-business-circle-info">中国付费会员制高端商务品牌</p>
                </div>
            </div>
        </div>
        <div class="row aios-advantages">
            <div class="aios-content">
                <img class="aios-content-bg" src="./img/AIOS/membership_card.png" alt="">
                <p class="high-business-date">布局于2015年</p>
                <p class="high-business-date">成立于2020年</p>
                <p class="high-business-date">是致力于打造全球高端商业生态圈得开拓者</p>
                <a class="high-business-look-detail" href="acosCard">查看详情&nbsp;>&nbsp;></a>
            </div>
        </div>
    </div>

    <div class="free">
        <div class="container">
            <h1 class="page-title">企业申请流程</h1>
            <!--                <span class="blue-line"></span> -->
            <img class="free-img" src="img/AIOS/free-application-pic.png" alt="">
            <div class="page-content">
                <div class="page-zhiti">
                    <h4>提交申请</h4>
                    <p>用户填写企业及个人身份信息</p>
                </div>
                <div class="page-zhiti">
                    <h4>系统审核</h4>
                    <p>客服人员确认企业信息<br>提交研发测试</p>
                </div>
                <div class="page-zhiti">
                    <h4>申请反馈</h4>
                    <p>客服人员与您确认测试情况<br>即刻加入</p>
                </div>
            </div>
            <div class="page-btn">
                <a class="button button-bg button-white" id="userRegister">免费申请</a>
            </div>
        </div>
    </div>
</div>
<#--莫斯蒂恩助您实现商业目标-->
<div class="services pb-100 pt-90 gray-bg">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 offset-lg-2">
                <div class="section_title text-center">
                    <h2>莫斯蒂恩助您实现商业目标</h2>
                    <p>莫斯蒂恩网络科技有限公司利用先进的互联网技术，打破原有的行业运营模式，
                        将发展过程中积累的技术和业务经验转化和应用于信息化整合平台中，为企业提供现代化营销新平台。</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4 col-md-6">
                <div class="singel_services text-center mt-70">
                    <div class="services_icon">
                        <img src="img/services/business.png" alt="Business Plan">
                    </div>
                    <div class="services_content">
                        <h4>商业计划</h4>
                        <p style="color: black">创新项目规划!</br>深入市场挖掘!</br>专业创新定制!</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="singel_services text-center mt-70">
                    <div class="services_icon">
                        <img src="img/services/marketing.png" alt="Digital Marketing">
                    </div>
                    <div class="services_content">
                        <h4>数字营销</h4>
                        <p style="color: black">提升营销效率!</br>降低成本!</br>提升企业价值!</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="singel_services text-center mt-70">
                    <div class="services_icon">
                        <img src="img/services/support.png" alt="Professional Support">
                    </div>
                    <div class="services_content">
                        <h4>专业支持</h4>
                        <p style="color: black">专业互联网提供商!</br>手把手教您修改网站信息!</br>完善的升级方案!</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--会员系统-->

<!--====== 客户系统 BCOS ======-->
<div data-scroll-index="4" style="background: #0b0b0b" class="become bg_cover pt-95 pb-100">
    <!--     style="background-image: url(img/bg.jpg)">-->
    <div class="container">
        <div class="row">
            <div class="col-lg-8 offset-lg-2">
                <div class="become_contant text-center">
                    <h5>与我们一起获得成功</h5>
                    <h2>是否想从今天开始增加业务量？</h2>
                    <a id="registerKH" class="button button-bg button-white">成为客户</a>
                </div>
            </div>
        </div>
    </div>
</div>
<!--====== BECOME PART ENDS ======-->

<!--====== 产品5 PART START 我们的客户 ======-->
<div  class="client pb-100 pt-90" >
    <div class="container">
        <div class="row">
            <div class="col-lg-8 offset-lg-2">
                <div class="section_title text-center">
                    <h2>我们的客户</h2>
                    <p>客户的微笑是我们努力追求的！</p>
                </div>
            </div>
        </div>
        <div class="client-slied" style="margin-top:50px;">
            <img src="img/logobg.png" alt="" >
        </div>
<#--        需保存的原始代码 --------->
        <div class="client-slied" style="display: none">
            <div class="col-lg-12">
                <div class="singel_client mt-100 text-center">
                    <div class="client_image">
                        <img src="img/client/Apple.jpg" alt="Client">
                    </div>
                    <div class="client_text">
                        <h4>史蒂夫▪乔布斯</h4>
                        <span>Steve Jobs</span>
                        <i class="fa fa-quote-left"></i>
                        <p>2018年8月2日晚间，苹果盘中市值首次超过1万亿美元，股价刷新历史最高位至203.57美元。入选2019《财富》世界500强、2019福布斯全球数字经济100强榜第1位。</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-12">
                <div class="singel_client mt-100 text-center">
                    <div class="client_image">
                        <img src="img/client/huawei.jpg" alt="Client">
                    </div>
                    <div class="client_text">
                        <h4>任正非</h4>
                        <span>Ren Zhengfei </span>
                        <i class="fa fa-quote-left"></i>
                        <p>华为是全球领先的ICT（信息与通信）基础设施和智能终端提供商，我们致力于把数字世界带入每个家庭构建万物互联的智能世界。目前华为业务遍及170多个国家和地区，服务30多亿人口。</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-12">
                <div class="singel_client mt-100 text-center">
                    <div class="client_image">
                        <img src="img/client/xiaomi.jpg" alt="Client">
                    </div>
                    <div class="client_text">
                        <h4>雷军</h4>
                        <span>LeiJun</span>
                        <i class="fa fa-quote-left"></i>
                        <p>小米公司是一家专注于智能手机自主研发的移动互联网公司，定位于高性能发烧手机。小米手机、MIUI、米聊是小米公司旗下三大核心业务。“为发烧而生”是小米的产品理念。</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-12">
                <div class="singel_client mt-100 text-center">
                    <div class="client_image">
                        <img src="img/client/lenovo.jpg" alt="Client">
                    </div>
                    <div class="client_text">
                        <h4>柳传志</h4>
                        <span>Chuanzhi Liu</span>
                        <i class="fa fa-quote-left"></i>
                        <p>
                            2019年9月，2019中国制造业企业500强发布，联想集团有限公司位列第16位。2019年10月福布斯全球数字经济100强榜位列89位。2019年11月1日联想成立35周年时，联想年收入超3500亿元人民币。</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--====== CLIENT PART ENDS ======-->

<!--====== 合作伙伴 PART START ======-->
<div  class="brand pt-95 pb-100" style="background-color: #0b0b0b">
    <div class="container">
        <div class="brand_slied">
            <div class="singel_brand">
                <img src="img/logo.png" alt="Envato" style="width: 164px;height: 70px">
            </div>
<#--            <div class="singel_brand">-->
<#--                <img src="img/brand/douyin.jpg" alt="Envato" style="width: 164px;height: 70px">-->
<#--            </div>-->
<#--            <div class="singel_brand">-->
<#--                <img src="img/brand/kuaishou.jpg" alt="Envato" style="width: 164px;height: 70px">-->
<#--            </div>-->
<#--            <div class="singel_brand">-->
<#--                <img src="img/brand/douyu.jpg" alt="Envato" style="width: 164px;height: 70px">-->
<#--            </div>-->
<#--            <div class="singel_brand">-->
<#--                <img src="img/brand/huya.jpg" alt="Envato" style="width: 164px;height: 70px">-->
<#--            </div>-->
<#--            <div class="singel_brand">-->
<#--                <img src="img/brand/weibo.jpg" alt="Envato" style="width: 164px;height: 70px">-->
<#--            </div>-->
<#--            <div class="singel_brand">-->
<#--                <img src="img/brand/apple.jpg" alt="Envato" style="width: 164px;height: 70px">-->
<#--            </div>-->
<#--            <div class="singel_brand">-->
<#--                <img src="img/brand/xiaomi.jpg" alt="Envato" style="width: 164px;height: 70px">-->
<#--            </div>-->
<#--            <div class="singel_brand">-->
<#--                <img src="img/brand/huawei.jpg" alt="Envato" style="width: 164px;height: 70px">-->
<#--            </div>-->

        </div>
    </div>
</div>

<!--====== BRAND PART ENDS ======-->
<!--====== 保障系统 ======-->
<!--====== 保障系统 ======-->
<div  data-scroll-index="5" class="pb-40">
    <div class="col-lg-12">
        <div class="project_menu text-center pt-60 pb-40">
            <h2 style="margin-bottom: 20px"><b>保障系统</b></h2>
            <h3 style="margin-bottom: 20px">客户端保障协议</h3>
            <ul>
                <li><h3 id="safeguardButtenA" style="color: #1f8ffd">APS·ICAS&nbsp;</h3></li>
                <li><h3 id="safeguardButtenB">BPS·ICAS&nbsp;</h3></li>
                <li><h3 id="safeguardButtenC">CPS·ICAS</h3></li>
            </ul>
        </div>
        <div id="safeguardA" class="text-center col-lg-8 offset-lg-2">
            <h3>A客户端·保障协议</h3>
            <a class="btn h5-adapter" data-toggle="modal" data-target="#modalA" href="#" style="font-size: 20px">《上海莫斯蒂恩网络科技有限公司·APS·ICAS》</a>
        </div>
        <div id="safeguardB" class="text-center show-acos">
            <h3>B客户端·保障协议</h3>
            <a class="btn h5-adapter" data-toggle="modal" data-target="#modalB" href="#" style="font-size: 20px">《上海莫斯蒂恩网络科技有限公司·BPS·ICAS》</a>
        </div>
        <div id="safeguardC" class="text-center show-acos">
            <h3>C客户端·保障协议</h3>
            <a class="btn h5-adapter" data-toggle="modal" data-target="#modalC" href="#" style="font-size: 20px">《上海莫斯蒂恩网络科技有限公司·CPS·ICAS》</a>
        </div>
        <div class="project_menu text-center pt-60 pb-40">
            <h3 style="margin-bottom: 20px">数据协议</h3>
            <ul>
                <li><h3 id="dataA" style="color: #1f8ffd">ICSE&nbsp;</h3></li>
                <li><h3 id="dataB">ICID&nbsp;</h3></li>
            </ul>
        </div>
        <div id="dataShowA" class="text-center col-lg-8 offset-lg-2">
            <h3>数据加密算法</h3>
            <a class="btn h5-adapter" data-toggle="modal" data-target="#modaldataA" href="#"
               style="font-size: 20px">《上海莫斯蒂恩网络科技有限公司·ICSE·SEID》</a>
        </div>
        <div id="dataShowB" class="text-center show-acos">
            <h3>大数据分析算法</h3>
            <a class="btn h5-adapter" data-toggle="modal" data-target="#modaldataB" href="#"
               style="font-size: 20px">《上海莫斯蒂恩网络科技有限公司·ICID·SEID》</a>
        </div>
    </div>
</div>
<!--====== BRAND PART ENDS ======-->

<!--====== 团队 PART START ======-->
<!--====== TMIC 我们的团队 ======-->
<div data-scroll-index="5" class="our_team pt-90 pb-50" id="abstart">
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <div class="section_title text-center">
                    <h2 class="tmic" style="color: white">TMIC</h2>
                    <p class="abc" style="color: white">上海莫斯蒂恩网络科技有限公司成立于2020年5月18日，公司总部位于上海市奉贤区，
                        是经奉贤区市场监管局批准成立的一家创新型企业，
                        上海莫斯蒂恩网络科技有限公司始终以“为客户提供整体解决方案、
                        为客户创造价值”为目标，在”和谐、上进、奉献、包容、厚德”企业文化的倡导下，
                        让上海莫斯蒂恩网络科技有限公司的每一位员工分享公司成长带来的收获和喜悦。</p>
                </div>
            </div>
        </div>
        <div class="row team_main">
            <div class="team-main-img col-xs-12 col-sm-12 col-md-12 col-lg-12" style="background-image: url(./img/team/team.jpg)"></div>
        </div>
<#--        <div class="row team_main">-->
<#--            <div class="col-lg-4 col-md-6 team">-->
<#--                <div class="team_services text-center">-->
<#--                    <div class="team_img">-->
<#--                        <img src="img/team/01.png" alt="Business Plan">-->
<#--                    </div>-->
<#--                    <div class="team_content" >-->
<#--                        <h4>Dries</h4>-->
<#--                        <h5>CTO</h5>-->
<#--                        <p>Dries(郑祥祥) 精通大数据，深刻理解JavaWEB技术体系架构，精通SSH、SpringMVC、Spring Boot、JBPM、MyBatis、EJB等多种流行框架。</p>-->
<#--                        <div style="position:absolute;bottom:18px;left:50%;transform:translateX(-50%);display: flex;flex-direction: row;align-items: center;justify-content: center">-->
<#--                            <p style="border: 1px solid #9F9F9F;border-radius: 50%;width: 40px;height: 40px;display: flex;flex-direction: row;align-items: center;justify-content: center">-->
<#--                                <a href="javascript:"><i class="fa fa-angle-right iconfont iconyouxiang" style="font-size:20px;"></i></a>-->
<#--                            </p>-->
<#--                        </div>-->

<#--                    </div>-->
<#--                </div>-->
<#--            </div>-->
<#--            <div class="col-lg-4 col-md-6 team" style="">-->
<#--                <div class="team_services text-center">-->
<#--                    <div class="team_img">-->
<#--                        <img src="img/team/02.png" alt="Business Plan">-->
<#--                    </div>-->
<#--                    <div class="team_content">-->
<#--                        <h4>Tic</h4>-->
<#--                        <h5 style="color: #00A8FE">CEO</h5>-->
<#--                        <p>主持公司的日常经营、行政和业务活动-->
<#--                            努力营造良好的企业发展运营内外部环境，-->
<#--                            持公司的基本团队建设、拟订公司内部管-->
<#--                            理机构设方案和基本管理制度、规范内部-->
<#--                            管理，包括人、财、物、产、供、销等工作-->
<#--                            领导公司员工实现公司经营目标。</p>-->
<#--                        <div style="position:absolute;bottom:18px;left:50%;transform:translateX(-50%);display: flex;flex-direction: row;align-items: center;justify-content: center">-->
<#--                            <p style="border: 1px solid #9F9F9F;border-radius: 50%;width: 40px;height: 40px;display: flex;flex-direction: row;align-items: center;justify-content: center">-->
<#--                                <a href="javascript:"><i class="fa fa-angle-right iconfont iconyouxiang" style="font-size:20px;"></i></a>-->
<#--                            </p>-->
<#--                        </div>-->

<#--                    </div>-->
<#--                </div>-->
<#--            </div>-->
<#--            <div class="col-lg-4 col-md-6 team" style="">-->
<#--                <div class="team_services text-center">-->
<#--                    <div class="team_img">-->
<#--                        <img src="img/team/03.png" alt="Business Plan">-->
<#--                    </div>-->
<#--                    <div class="team_content">-->
<#--                        <h4>Micah</h4>-->
<#--                        <h5 style="color: #00A8FE">CDO</h5>-->
<#--                        <p>Micah (毛健)精通界面设计，深刻理解-->
<#--                            APP交互逻辑，精通Photosho P、-->
<#--                            llustrator、CINEMA 4D、CorelDraw.-->
<#--                            Axure RP、After Effects、Premiere 、-->
<#--                            XMind等多种设计软件。</p>-->
<#--                        <div style="position:absolute;bottom:18px;left:50%;transform:translateX(-50%);display: flex;flex-direction: row;align-items: center;justify-content: center">-->
<#--                            <p style="border: 1px solid #9F9F9F;border-radius: 50%;width: 40px;height: 40px;display: flex;flex-direction: row;align-items: center;justify-content: center">-->
<#--                                <a href="javascript:"><i class="fa fa-angle-right iconfont iconyouxiang" style="font-size:20px;"></i></a>-->
<#--                            </p>-->
<#--                        </div>-->

<#--                    </div>-->
<#--                </div>-->
<#--            </div>-->
<#--            <div class="col-lg-4 col-md-6 team">-->
<#--                <div class="team_services text-center">-->
<#--                    <div class="team_img">-->
<#--                        <img src="img/team/04.png" alt="Business Plan">-->
<#--                    </div>-->
<#--                    <div class="team_content">-->
<#--                        <h4>Alise</h4>-->
<#--                        <h5>COO</h5>-->
<#--                        <p>Alise(鲁燕)制定年度工作计划、商业投资经-->
<#--                            验丰富，投资预算精确，制定多个考核计划，-->
<#--                            以及运营系统整体设计方案的制作与实施。</p>-->
<#--                        <div style="position:absolute;bottom:18px;left:50%;transform:translateX(-50%);display: flex;flex-direction: row;align-items: center;justify-content: center">-->
<#--                            <p style="border: 1px solid #9F9F9F;border-radius: 50%;width: 40px;height: 40px;display: flex;flex-direction: row;align-items: center;justify-content: center">-->
<#--                                <a href="javascript:"><i class="fa fa-angle-right iconfont iconyouxiang" style="font-size:20px;"></i></a>-->
<#--                            </p>-->
<#--                        </div>-->
<#--                    </div>-->
<#--                </div>-->
<#--            </div>-->
<#--            <div class="col-lg-4 col-md-6 team" style="">-->
<#--                <div class="team_services text-center">-->
<#--                    <div class="team_img">-->
<#--                        <img src="img/team/05.png" alt="Business Plan">-->
<#--                    </div>-->
<#--                    <div class="team_content">-->
<#--                        <h4>Sean</h4>-->
<#--                        <h5>核心技术员</h5>-->
<#--                        <p>对JavaEE 技术体系结构、JavaWeb 原理有深刻理解，精通多种主流框架以及 Maven构建工具。</p>-->
<#--                        <div style="position:absolute;bottom:18px;left:50%;transform:translateX(-50%);display: flex;flex-direction: row;align-items: center;justify-content: center">-->
<#--                            <p style="border: 1px solid #9F9F9F;border-radius: 50%;width: 40px;height: 40px;display: flex;flex-direction: row;align-items: center;justify-content: center">-->
<#--                                <a href="javascript:"><i class="fa fa-angle-right iconfont iconyouxiang" style="font-size:20px;"></i></a>-->
<#--                            </p>-->
<#--                        </div>-->

<#--                    </div>-->
<#--                </div>-->
<#--            </div>-->
<#--            <div class="col-lg-4 col-md-6 team" style="">-->
<#--                <div class="team_services text-center">-->
<#--                    <div class="team_img">-->
<#--                        <img src="img/team/06.png" alt="Business Plan">-->
<#--                    </div>-->
<#--                    <div class="team_content">-->
<#--                        <h4>Ashley</h4>-->
<#--                        <h5>核心技术员</h5>-->
<#--                        <p>掌握SpringBoot、Mybatis、Spring等主流框架，熟悉Vue、BootStrap前端框架。</p>-->
<#--                        <div style="position:absolute;bottom:18px;left:50%;transform:translateX(-50%);display: flex;flex-direction: row;align-items: center;justify-content: center">-->
<#--                            <p style="border: 1px solid #9F9F9F;border-radius: 50%;width: 40px;height: 40px;display: flex;flex-direction: row;align-items: center;justify-content: center">-->
<#--                                <a href="javascript:"><i class="fa fa-angle-right iconfont iconyouxiang" style="font-size:20px;"></i></a>-->
<#--                            </p>-->
<#--                        </div>-->

<#--                    </div>-->
<#--                </div>-->
<#--            </div>-->
<#--        </div>-->
    </div>
</div>
<!--====== COWE 联系我们 ======-->
<div  data-scroll-index="7" class="contact pb-50 pt-50">
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <div class="section_title text-center">
                    <h2>COWE</h2>
                    <p>如果您是一个有实力、有品牌梦想的公司
                        请与我们联系！</p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                <div class="contact_form pt-65 text-center">
                    <form id="contact-form">
                        <div class="row">
                            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 ">
                                <input type="text" name="ticket" hidden>
                            </div>
                            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 ">
                                <input type="text" name="randstr" hidden>
                            </div>
                            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 ">
                                <input type="text" name="name" placeholder="姓名">
                            </div>
                            <div class="col-xs-12 col-md-6 col-sm-6 col-lg-6">
                                <select name="clients" placeholder="身份" style="width: 100%;border: 1px solid #ddd;margin-bottom: 16px;padding: 15px;font-size: 14px;">
                                    <option value="1">会员问题</option>
                                    <option value="2">物流问题</option>
                                    <option value="3">企业问题</option>
                                </select>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 ">
                                <input type="email" name="email" placeholder="邮箱">
                            </div>
                            <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6  ">
                                <input type="text" name="phone" placeholder="电话号码">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 ">
                                <textarea name="feedbackMessage" cols="30" rows="10" placeholder="遇到的问题"></textarea>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 ">
                                <button id="TencentCaptcha"
                                        data-appid="2026446668"
                                        data-cbfn="callbackMessage"
                                        type="button" class="button button-bg mt-10">立即提交
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<!--====== CONTACT PART ENDS ======-->

<!-- 企业介绍Modal -->
<div  class="modal fade bs-mosidian-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <!--            <div class="modal-header">-->
            <!--                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>-->
            <!--                </button>-->
            <!--            </div>-->
            <div class="modal-body">
                <div class="ms-content">
                    <h3>企业概况</h3>
                    <div class="ms-who">
                        <!--                        <img src="img/about/about_who_img.gif"/>-->
                        <div style="margin-left: 20px;width: 400px">
                            <span style="color: rgb(204, 204, 204);font-size: 26px;margin-bottom: 30px;font-weight: bold">我们是谁？</span>
                            <p style="color: #666;font-size: 10px">
                                上海莫斯蒂恩网络科技有限公司简称"Mosidian"，是一家专业的企业服务公司，
                                以领先的设计水平和技术实力，打造行业品牌、树立形象，为客户提供网站策划、网页设计、网站制作、主机域名、网络营销、VI设计、网站改版、漏洞修补等服务。网络始终以务实、诚信为根本，不断创新和提高建站品质，通过对领先技术的掌握、对创意设计的研究、对客户形象的视觉传递、对应用系统的完美结合，为客户提供更好的一站式互联网解决方案，以客户的口碑塑造品牌，携手广大客户，共同发展进步。

                            </p>
                            <p style="padding-top: 15px;color: rgb(153, 153, 153);font-size: 14px;">
                                以方正树立诚信人格，用思维创造崭新明天。</p>
                        </div>
                    </div>
                    <div class="ms-what">
                        <div style="width: 400px">
                            <div class="what">我们能做什么？</div>
                            <div class="what_int">
                                我们提供的产品解决方案 >
                            </div>
                            <div class="what_con">
                                <div class="what_A">
                                    <div class="what_img">
                                        <img src="img/about/what_A.gif"/>
                                    </div>
                                    <div class="what_name">
                                        <div class="what_name_ch">
                                            搭建有生命力的电子商务网站
                                        </div>
                                        <div class="what_name_en">
                                            Building a viable e-commerce site
                                        </div>
                                    </div>
                                    <div class="clear"></div>
                                </div>
                                <div class="what_A">
                                    <div class="what_img fl">
                                        <img src="img/about/what_B.gif"/>
                                    </div>
                                    <div class="what_name fr">
                                        <div class="what_name_ch">
                                            城市互联网营销
                                        </div>
                                        <div class="what_name_en">
                                            City Internet Marketing
                                        </div>
                                    </div>
                                </div>
                                <div class="what_A">
                                    <div class="what_img fl">
                                        <img src="img/about/what_C.gif"/>
                                    </div>
                                    <div class="what_name fr">
                                        <div class="what_name_ch">
                                            互联网品牌网站建设
                                        </div>
                                        <div class="what_name_en">
                                            Internet Brand Website
                                        </div>
                                    </div>
                                </div>
                                <div class="what_A">
                                    <div class="what_img fl">
                                        <img src="img/about/what_D.gif"/>
                                    </div>
                                    <div class="what_name fr">
                                        <div class="what_name_ch">
                                            如何让您的电子商务赚钱
                                        </div>
                                        <div class="what_name_en">
                                            Making money for your e-commerce
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--                        <img src="img/about/about_who_img2.gif" alt=""/>-->
                    </div>
                    <!--                    <div class="ms-culture">文化</div>-->
                </div>
            </div>
        </div>
    </div>
</div>

<!-- 保障系统模态窗 -->
<div  class="modal fade" id="modalA" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title ">《上海莫斯蒂恩网络科技有限公司·APS·ICAS》</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                敬请期待
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
<div  class="modal fade" id="modalB" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">《上海莫斯蒂恩网络科技有限公司·BPS·ICAS》</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                敬请期待
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
<div  class="modal fade" id="modalC" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">《上海莫斯蒂恩网络科技有限公司·CPS·ICAS》</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                敬请期待
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
<div  class="modal fade" id="modaldataA" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">《上海莫斯蒂恩网络科技有限公司·ICSE·SEID》</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                敬请期待
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>
<div  class="modal fade" id="modaldataB" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">《上海莫斯蒂恩网络科技有限公司·ICID·SEID》</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                敬请期待
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
            </div>
        </div>
    </div>
</div>

<!--====== BACK TO TOP PART START ======-->
<a href="#" class="back-to-top"><i class="fa fa-angle-up"></i></a>
<a href="#" class="back-to-bottom"><i class="fa fa-angle-down"></i></a>
<!--====== BACK TO TOP PART ENDS ======-->

<#--公共foot-info引入，尾部-->
<#include "/common/foot_info.ftl">

<!--====== jquery js ======-->
<script src="js/vendor/modernizr-3.6.0.min.js"></script>
<script src="js/vendor/jquery-1.12.4.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/scrollIt.min.js"></script>
<script src="js/slick.min.js"></script>
<script src="js/jquery.magnific-popup.min.js"></script>
<script src="js/isotope.pkgd.min.js"></script>
<script src="js/imagesloaded.pkgd.min.js"></script>

<script src="js/main.js"></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/gsap/2.0.2/TweenMax.min.js'></script>
<script src="js/script.js"></script>
<script src="layui/lay/modules/layer.js" type="text/javascript" charset="utf-8"></script>
<script src="js/dolphin.js"></script>
<script src="https://ssl.captcha.qq.com/TCaptcha.js"></script>
</body>
<script type="text/javascript">

    function getUserEmail(id) {
        dolphin.iframe("/sys/email/email_info/" + id, "邮箱信息", "300px", "200px")
    }
    //为什么选择莫斯蒂恩-敬请期待弹窗
    function serviceModulel(id){
        dolphin.iframe("/sys/enterprise_service/service_module/" + id, "企业服务", "550px", "400px")
    }
    //法律协议
    function legalNotices (){
        dolphin.iframe("/sys/legal_notices/legal_notice", "法律协议", "700px", "650px")
    }
    $(function () {
        $("#outlet").click(function () {
            dolphin.iframe("/sys/mega/outlet", "商家数据分析")
        })

        $("#register").click(function () {
            dolphin.iframe("/sys/register", "会员注册", "750px", "600px")
        })

        $("#registerUser").click(function () {
            dolphin.iframe("/sys/register", "会员注册", "750px", "600px")
        })

        $("#registerKH").click(function () {
            dolphin.iframe("/sys/kh/register", "会员注册", "1050px", "600px")
        })

        $("#userRegister").click(function () {
            dolphin.iframe("/sys/kh/register_qiye", "企业入驻", "1050px", "600px")
        })

        //中文点击
        $("#langZh").on('click',function () {
            $(".language-change-en").hide()
            $(".language-change-zh").show()
            $(".lang-zh").css('color','#1f8fff')
            $(".lang-en").css('color','#fff')
        })
        //英文点击
        $("#langEn").on('click',function () {
            $(".language-change-zh").hide()
            $(".language-change-en").show()
            $(".lang-zh").css('color','#fff')
            $(".lang-en").css('color','#1f8fff')

        })

        window.showCard = function (id) {
            dolphin.iframe("/sys/user/card/" + id, "会员卡", "500px", "600px")
        }

        window.callbackMessage = function (res) {
            console.log(res)
            // res（用户主动关闭验证码）= {ret: 2, ticket: null}
            // res（验证成功） = {ret: 0, ticket: "String", randstr: "String"}
            if (res.ret === 0) {
                // alert(res.ticket)   // 票据
                $("#ticket").val(res.ticket)
                $("#randstr").val(res.randstr)
                dolphin.post('/api/contact/us',
                    $('#contact-form').serialize(),
                    function (result) {
                        if (result.code === 0) {
                            layer.msg(result.msg, {icon: 1, time: 2000}, function () {
                                $('#contact-form')[0].reset()
                            })
                        } else {
                            dolphin.alert(result.msg);
                        }
                    })
            }
        }
    })
</script>
</html>
