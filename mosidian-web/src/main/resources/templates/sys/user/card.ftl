<#include "/common/header.ftl">
<title>会员卡信息</title>
</head>
<body>
<div class="container me-p-t-25">
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">会员卡</h5>
            <form id="form">
                <div class="row">
                    <div class="col-md-12">
                        <div class="form-group row">
                            <#if id == 1 >
                                <img src="http://www.mosidian.com/web/img/card/card.png" style="height: 260px;width: 400px"/>
                            <#elseif id == 2>
                                <img src="http://www.mosidian.com/web/img/card/card.png" style="height: 260px;width: 400px"/>
                            <#else>
                                <img src="http://www.mosidian.com/web/img/card/card.png" style="height: 260px;width: 400px"/>
                            </#if>
                        </div>
                    </div>
                </div>
            </form>
        </div>
        <div class="me-btn-toolbar text-center">
            <button type="button" class="btn btn-primary mr-2 cancel">关闭</button>
        </div>

    </div>
</div>
</div>
<#include "/common/footer.ftl">
<script type="text/javascript">
    $(function () {

        $(".cancel").click(function () {
            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            parent.layer.close(index); //再执行关闭
        })

    })
</script>
</body>
</html>