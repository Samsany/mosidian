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
<body>

<style>
    .container {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        padding-left:25px;
        padding-right:25px;
        background-color: #f2f2f2;
    }
    .designer-img {
        width:80px;
        height:80px;
        border-radius: 50%;
        background-position: center center;
        background-repeat: no-repeat;
        background-size: contain;
        background-color: #0b0b0b;
    }
    .designer-name {
        margin: 8px 0 5px 0;
        font-size: 16px;
        font-weight: 700;
        color:#666;
    }
    .designer-detail {
        font-size: 14px;
        color:#666;
    }
    .designer-code {
        display: flex;
        flex-direction: row;
        align-items: center;
        justify-content: space-evenly;
        width: 100%;
        padding: 30px 0 40px 0;
    }
    .designer-code-qr {
        width:50%;
        height:50%;
    }
    .wx-btn {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
    }
    .wx-btn button {
        padding:5px 6px;
        line-height: 30px;
        text-align: center;
        font-size: 20px;
        border-radius: 10px;
        border:1px solid #5A5B63;
        color:#666;
    }
    .wx-btn-intro {
        margin-top:5px;
        font-size: 16px;
        color:#666;
    }
</style>
<div class="container me-p-t-25">
<#--    <div class="designer-img" style="background-image:url(http://www.mosidian.com/web/img/logo.png)"></div>-->
    <p class="designer-name">莫斯蒂恩</p>
    <p class="designer-detail">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;上海莫斯蒂恩网络科技有限公司其为一家专注于打造全球高端商业生态圈、创造价值、服务价值与信息服务型公司。</p>
    <div class="designer-code">
        <img class="designer-code-qr" src="http://www.mosidian.com/web/img/weixinto.jpg" alt="">
        <div class="wx-btn">
            <button>微信扫一扫</button>
            <span class="wx-btn-intro">与我们直接对话</span>
        </div>
    </div>
</div>
</body>
<#include "/common/footer.ftl">
</html>
