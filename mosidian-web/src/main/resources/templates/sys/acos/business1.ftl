<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Mosidian</title>
    <!--====== Style css ======-->
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="layui/css/modules/layer/default/layer.css"/>
    <link rel="stylesheet" type="text/css" href="layui/css/modules/laydate/default/laydate.css"/>
    <link rel="stylesheet" type="text/css" href="layui/css/layui.css"/>
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
        background: #3d3d3d;
    }
    .nav-ul {
        display: flex;
        flex-direction: row;
        width: 1200px;
        height: 100%;
        margin:0 auto;
    }
    .nav-li {
        position: relative;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        width:100px;
        cursor:pointer;
    }
    .show-border .nav-li-border {
        position: absolute;
        bottom:5px;
        left:0;
        right:0;
        width:100%;
        height:2px;
        border-radius: 8px;
        background: #f4ebe6;
        transition: all .5s linear;
    }

    .nav-icon img {
        width: 30px;
        height: 30px;
        margin-bottom:5px;
    }
    .nav-title {
        font-size: 14px;
        color: #fff2ea;
    }
/*    banner*/
    .rank-banner {
        width: 100%;
        height: 215px;
        background-position: center center;
       background-repeat: no-repeat;
        background-size: cover;
    }
    .rank-banner-title {
        text-align: center;
        line-height: 216px;
        font-size: 70px;
        color: #fff;
    }
/*    main-banner*/
    .main {
        width: 100%;
        margin-top:-3px;
        padding-bottom:40px;
        /*background: #f9e3d2;*/
        background: #e5e5e5;

    }
    .main-banner {
        width: 1200px;
        margin:0 auto;
    }
    .main-banner-head {
        display: flex;
        flex-direction: row;
        align-items: flex-end;
        padding: 40px 0 30px 0;
    }
    .main-banner-icon img {
        width: 30px;
        height: 25px;
    }
    .main-banner-title span {
        margin:0 10px;
        color: #745429;
        font-size: 26px;
        font-weight: 700;
    }
    .main-banner-info span {
        color: #745429;
        font-size: 14px;
        opacity: .7;
    }
    .main-banner-item {
        display: flex;
        flex-direction: row;
        align-items: center;
        flex-wrap: wrap;
        justify-content: space-between;
    }
    .main-banner-li {
        position: relative;
        display: flex;
        flex-direction: row;
        width: 29%;
        /*height:206px;*/
        padding:20px;
        margin-bottom:15px;
        background: #fff;
    }
    .main-banner-tag {
        position: absolute;
        top:0;
        left:0;
        width:70px;
        height:23px;
        text-align: center;
        color:#fff;
        background-size: cover;
        background-position: center center;
        background-repeat: no-repeat;
    }
    .main-banner-li-img {
        min-width: 150px;
        height: 150px;
        margin-right:10px;
        background-repeat: no-repeat;
        background-size: cover;
        background-position: center center;
    }
    .main-banner-li-detail {
        position: relative;
    }

    .detail-title {
        color: #333;
        font-size: 14px;
    }
    .detail-span {
        display: inline-block;
        padding: 3px 5px;
        margin:10px 0 8px 0;
        color:orange;
        font-size: 12px;
        border-radius: 5px;
        border:1px solid orange;
    }
    .detail-ul {
        display: flex;
        flex-direction: row;
        align-items: center;
        margin-bottom: 5px;
        font-size: 12px;
        color:#999;
    }
    .detail-star {
        margin: 0 5px;
    }
    .detail-star img {
        width:12px;
        height: 12px;
    }
    .detail-info {
        display: block;
        font-size: 12px;
        color:#999;
    }
    .detail-consulting {
        position: absolute;
        right:0;
        margin-top:5px;
        display: inline-block;
        padding:3px 8px;
        font-size: 14px;
        color:#fff;
        background: orange;
        border-radius: 5px;
        cursor:pointer;
    }
</style>
<body>
    <div class="page">
        <!--导航栏-->
        <div class="nav">
            <ul class="nav-ul">
                <li class="nav-li show-border">
                    <div class="nav-icon">
                        <img src="img/acos/one.png" alt="">
                    </div>
                    <span class="nav-title">品牌设计</span>
                    <div class="nav-li-border"></div>
                </li>
                <li class="nav-li">
                    <div class="nav-icon">
                        <img src="./img/acos/two.png" alt="">
                    </div>
                    <span class="nav-title">网站建设</span>
                    <div class="nav-li-border"></div>
                </li>
                <li class="nav-li">
                    <div class="nav-icon">
                        <img src="./img/acos/three.png" alt="">
                    </div>
                    <span class="nav-title">移动应用开发</span>
                    <div class="nav-li-border"></div>
                </li>
            </ul>
        </div>
        <!--rank-banner-->
        <div class="rank-banner" style="background: #101010">
            <h1 class="rank-banner-title">品牌建设排行榜</h1>
        </div>
        <!--main-banner-->
        <div class="main">
            <div class="main-banner">
                <ul class="main-banner-head">
                    <li class="main-banner-icon">
                        <img src="./img/acos/hot.png" alt="">
                    </li>
                    <li class="main-banner-title">
                        <span>服务热卖榜</span>
                    </li>
                    <li class="main-banner-info">
                        <span>按服务销量计算，每日更新</span>
                    </li>
                </ul>
                <ul class="main-banner-item">
                    <li class="main-banner-li">
                        <div class="main-banner-tag" style="background-image: url(./img/acos/foot.png);opacity: .8">
                            TOP1
                        </div>
                        <div class="main-banner-li-img" style="background-image: url(./img/acos/item_one.png)"></div>
                        <div class="main-banner-li-detail">
                            <p class="detail-title">企业公司LOGO品牌设计图文原创标志商设计</p>
                            <div class="detail-span">3套方案供选</div>
                            <ul class="detail-ul">
                                <li class="detail-li">客户评分</li>
                                <li class="detail-star">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star_side.png" alt="">
                                </li>
                                <li class="detail-score">4.9分</li>
                            </ul>
                            <p class="detail-info">很喜欢的服务，比自己想象中好</p>
                            <a class="detail-consulting" id="consult1">立即咨询</a>
                        </div>
                    </li>
                    <li class="main-banner-li">
                        <div class="main-banner-tag" style="background-image: url(./img/acos/foot_five.png);">
                            TOP2
                        </div>
                        <div class="main-banner-li-img" style="background-image: url(./img/acos/item_two.png)"></div>
                        <div class="main-banner-li-detail">
                            <p class="detail-title">企业公司LOGO品牌设计图文原创标志商设计</p>
                            <div class="detail-span">3套方案供选</div>
                            <ul class="detail-ul">
                                <li class="detail-li">客户评分</li>
                                <li class="detail-star">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                </li>
                                <li class="detail-score">5分</li>
                            </ul>
                            <p class="detail-info">很喜欢的服务，比自己想象中好</p>
                            <a class="detail-consulting" id="consult2">立即咨询</a>
                        </div>
                    </li>
                    <li class="main-banner-li">
                        <div class="main-banner-tag" style="background-image: url(./img/acos/foot_four.png);">
                            TOP3
                        </div>
                        <div class="main-banner-li-img" style="background-image: url(./img/acos/item_three.png)"></div>
                        <div class="main-banner-li-detail">
                            <p class="detail-title">企业公司LOGO品牌设计图文原创标志商设计</p>
                            <div class="detail-span">3套方案供选</div>
                            <ul class="detail-ul">
                                <li class="detail-li">客户评分</li>
                                <li class="detail-star">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star_side.png" alt="">
                                </li>
                                <li class="detail-score">4.9分</li>
                            </ul>
                            <p class="detail-info">很喜欢的服务，比自己想象中好</p>
                            <a class="detail-consulting" id="consult3">立即咨询</a>
                        </div>
                    </li>
                    <li class="main-banner-li">
                        <div class="main-banner-tag" style="background-image: url(./img/acos/foot_one.png);">
                            TOP4
                        </div>
                        <div class="main-banner-li-img" style="background-image: url(./img/acos/item_four.png)"></div>
                        <div class="main-banner-li-detail">
                            <p class="detail-title">企业公司LOGO品牌设计图文原创标志商设计</p>
                            <div class="detail-span">3套方案供选</div>
                            <ul class="detail-ul">
                                <li class="detail-li">客户评分</li>
                                <li class="detail-star">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                </li>
                                <li class="detail-score">5分</li>
                            </ul>
                            <p class="detail-info">很喜欢的服务，比自己想象中好</p>
                            <a class="detail-consulting" id="consult4">立即咨询</a>
                        </div>
                    </li>
                    <li class="main-banner-li">
                        <div class="main-banner-tag" style="background-image: url(./img/acos/foot_two.png);">
                            TOP5
                        </div>
                        <div class="main-banner-li-img" style="background-image: url(./img/acos/item_five.png)"></div>
                        <div class="main-banner-li-detail">
                            <p class="detail-title">企业公司LOGO品牌设计图文原创标志商设计</p>
                            <div class="detail-span">3套方案供选</div>
                            <ul class="detail-ul">
                                <li class="detail-li">客户评分</li>
                                <li class="detail-star">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                </li>
                                <li class="detail-score">5分</li>
                            </ul>
                            <p class="detail-info">很喜欢的服务，比自己想象中好</p>
                            <a class="detail-consulting" id="consult5">立即咨询</a>
                        </div>
                    </li>
                    <li class="main-banner-li">
                        <div class="main-banner-tag" style="background-image: url(./img/acos/foot_three.png);">
                            TOP6
                        </div>
                        <div class="main-banner-li-img" style="background-image: url(./img/acos/item_six.png)"></div>
                        <div class="main-banner-li-detail">
                            <p class="detail-title">企业公司LOGO品牌设计图文原创标志商设计</p>
                            <div class="detail-span">3套方案供选</div>
                            <ul class="detail-ul">
                                <li class="detail-li">客户评分</li>
                                <li class="detail-star">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star.png" alt="">
                                    <img src="./img/acos/star_side.png" alt="">
                                </li>
                                <li class="detail-score">4.9分</li>
                            </ul>
                            <p class="detail-info">很喜欢的服务，比自己想象中好</p>
                            <a class="detail-consulting" id="consult6">立即咨询</a>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</body>
<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/ajax-contact-form.js"></script>
<script src="js/main.js"></script>
<script src="js/script.js"></script>
<script src="layui/lay/modules/layer.js" type="text/javascript" charset="utf-8"></script>
<script src="js/dolphin.js"></script>
<script>
    $(function () {
        $(".nav-li").on('click',function () {
            $('.nav-li').eq($(this).index()).addClass('show-border');
            $('.nav-li').eq($(this).index()).siblings().removeClass('show-border');
            var nav_index = $(this).index();
            if(nav_index==0){
                $(".rank-banner-title").html('品牌建设排行榜');
                return false;
            }
            if(nav_index==1){
                $(".rank-banner-title").html('网站建设排行榜');
                return false;
            }
            if(nav_index==2){
                $(".rank-banner-title").html('移动应用建设排行榜');
                return false;
            }

        })
        $("#consult1").click(function () {
            dolphin.iframe("/sys/acos/consult1", "联系我们", "350px", "400px")
        })
        $("#consult2").click(function () {
            dolphin.iframe("/sys/acos/consult1", "联系我们", "350px", "400px")
        })
        $("#consult3").click(function () {
            dolphin.iframe("/sys/acos/consult1", "联系我们", "350px", "400px")
        })
        $("#consult4").click(function () {
            dolphin.iframe("/sys/acos/consult1", "联系我们", "350px", "400px")
        })
        $("#consult5").click(function () {
            dolphin.iframe("/sys/acos/consult1", "联系我们", "350px", "400px")
        })
        $("#consult6").click(function () {
            dolphin.iframe("/sys/acos/consult1", "联系我们", "350px", "400px")
        })
    })
</script>
</html>
