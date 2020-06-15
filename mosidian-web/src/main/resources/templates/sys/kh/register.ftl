<#include "/common/header.ftl">
<title>客户申请流程</title>
</head>
<body>
<div class="container me-p-t-25">
    <div class="card">
        <div class="card-body">
            <h5 class="card-title">客户申请流程</h5>
            <form id="form">
                <div class="row banner-cell">
                    <div class="col-md-12">
                        <input type="text" id="uuid" name="uuid" hidden>
                    </div>

                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-4 col-form-label me-t-r"><span
                                        style="color: red">*</span>申请企业全称:</label>
                            <div class="col-md-8">
                                <input type="text" id="name" name="name" class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label me-t-r">官网：</label>
                            <div class="col-sm-9">
                                <input type="text" name="website"
                                       class="form-control">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-4 col-form-label me-t-r"><span style="color: red">*</span>企业规模：</label>
                            <div class="col-sm-8">
                                <select name="scale" style="height:30px;">
                                    <option value="0~20">0~20</option>
                                    <option value="20~99">20~99</option>
                                    <option value="99~500">99~500</option>
                                    <option value="500~1000">500~1000</option>
                                    <option value="1000~2000">1000~2000</option>
                                    <option value="2000人以上">2000人以上</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label me-t-r"><span style="color: red">*</span>法人：</label>
                            <div class="col-sm-9">
                                <input type="text" name="corporation"
                                       class="form-control">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-4 col-form-label me-t-r"><span style="color: red">*</span>认证理由：</label>
                            <div class="col-sm-8">
                                <input type="text" name="reason"
                                       class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label me-t-r"><span
                                        style="color: red">*</span>提供的服务：</label>
                            <div class="col-sm-9">
                                <input type="text" name="eserver"
                                       class="form-control">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-4 col-form-label me-t-r"><span style="color: red">*</span>企业类型：</label>
                            <div class="col-sm-8">
                                <select name="companies" style="height:30px;">
                                    <option value="4">企业服务公司</option>
                                    <option value="3">物流服务公司</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label me-t-r"><span style="color: red">*</span>负责人：</label>
                            <div class="col-sm-9">
                                <input type="text" name="headName"
                                       class="form-control">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-4 col-form-label me-t-r"><span style="color: red">*</span>部门：</label>
                            <div class="col-sm-8">
                                <input type="text" name="sector"
                                       class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label me-t-r"><span style="color: red">*</span>职位：</label>
                            <div class="col-sm-9">
                                <input type="text" name="eposition"
                                       class="form-control">
                            </div>
                        </div>
                    </div>

                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-4 col-form-label me-t-r"><span
                                        style="color: red">*</span>负责人身份证号：</label>
                            <div class="col-sm-8">
                                <input type="text" name="headCard"
                                       class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label me-t-r"><span
                                        style="color: red">*</span>负责人电话：</label>
                            <div class="col-sm-9">
                                <input type="text" name="emobile"
                                       class="form-control">
                            </div>
                        </div>
                    </div>

                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-4 col-form-label me-t-r"><span
                                        style="color: red">*</span>负责人邮箱：</label>
                            <div class="col-sm-8">
                                <input type="text" name="eemail"
                                       class="form-control">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-3 col-form-label me-t-r"><span style="color: red">*</span>登录名:</label>
                            <div class="col-sm-8">
                                <input type="text" name="username"
                                       class="form-control">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group row">
                            <label class="col-sm-4 col-form-label me-t-r"><span
                                        style="color: red">*</span>统一社会信用代码：</label>
                            <div class="col-sm-8">
                                <input type="text" id="enlicenseId" name="enlicenseId" class="form-control">
                            </div>
                        </div>
                    </div>
                </div>
                <input id="input-3" name="file" type="file" class="file-loading">
                <input type="hidden" id="avatar" name="avatar" value="" >

                <input id="input-2" name="file" type="file" class="file-loading">
                <input type="hidden" id="enlicense" name="enlicense" value="" >

                <div class="me-btn-toolbar text-center">
                    <button type="button" class="btn btn-primary mr-2 save">申请</button>
                    <button type="button" class="btn btn-primary mr-2 cancel">取消</button>
                </div>
            </form>
        </div>
    </div>
</div>
<#include "/common/footer.ftl">
<script type="text/javascript">
    $(function () {

        getCaptcha();

        $(".save").click(function () {
            dolphin.post('/api/wuliu/save',
                $('#form').serialize(),
                function (result) {

                    if (result.code === 0) {
                        layer.msg(result.msg, {icon: 1, time: 2000}, function () {
                            setTimeout(parent.showCard(2), 2000);
                            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                            parent.layer.close(index); //再执行关闭
                        })
                    } else {
                        dolphin.alert(result.info);
                        getCaptcha()
                    }
                })
        })


        $(".cancel").click(function () {
            var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            parent.layer.close(index); //再执行关闭
        })

        function getCaptcha() {
            var uuid = getUUID()
            var imgUrl = '/api/captcha?uuid=' + uuid
            $("#uuid").val(uuid)
            $("#checkCapt").attr("src", imgUrl)
        }

        function getUUID() {
            var len = 32;//32长度
            var radix = 16;//16进制
            var chars = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'.split('');
            var uuid = [], i;
            radix = radix || chars.length;
            if (len) {
                for (i = 0; i < len; i++) uuid[i] = chars[0 | Math.random() * radix];
            } else {
                var r;
                uuid[8] = uuid[13] = uuid[18] = uuid[23] = '-';
                uuid[14] = '4';
                for (i = 0; i < 36; i++) {
                    if (!uuid[i]) {
                        r = 0 | Math.random() * 16;
                        uuid[i] = chars[(i == 19) ? (r & 0x3) | 0x8 : r];
                    }
                }
            }
            return uuid.join('');
        }

        $("#input-2").fileinput({
            uploadUrl: "http://localhost:8080/mosidian/api/upload",
            previewFileType: "image",
            uploadAsync: true,
            showCaption: false,
            allowedFileExtensions: ["png", "jpg", "jpeg", "ico", "bmp", "gif"],
            maxFileCount: 1,
            maxFileSize: 3072,
            showBrowse: true,
            dropZoneTitle: '拖拽营业执照照片到这里...',
            browseLabel: "选择营业执照照片",
            uploadClass: "btn btn-info",
            uploadLabel: "上传",
            removeClass: "btn btn-danger",
            autoReplace: true,
            removeLabel: "移除",
            msgSizeTooLarge: '图片文件太大！',
            msgFilesTooMany: "选择上传的文件数量为({n}) 超过允许的最大数值({m})！",
            msgUploadEnd: '图片上传成功！',
            msgUploadBegin: '初始化中...',
            msgZoomModalHeading: '图片详情预览',
            msgInvalidFileExtension: '非法文件扩展名 "{name}"！ 仅支持 "{extensions}" 的文件扩展名！'
        }).on('fileerror', function (event,msg) {
            alert('图片上传失败！' + msg);
        }).on('fileuploaded', function (event, data) {//异步上传成功结果处理
            $("#enlicense").val(data.response.imgUrl);
        }).on('fileclear', function (event) {
            alert("图片被清除啦！");
        });
        ;

        $("#input-3").fileinput({
            uploadUrl: "http://localhost:8080/mosidian/api/upload",
            previewFileType: "image",
            uploadAsync: true,
            showCaption: false,
            allowedFileExtensions: ["png", "jpg", "jpeg", "ico", "bmp", "gif"],
            maxFileCount: 1,
            maxFileSize: 3072,
            showBrowse: true,
            dropZoneTitle: '拖拽公司logo到这里...',
            browseLabel: "选择公司logo照片",
            uploadClass: "btn btn-info",
            uploadLabel: "上传",
            removeClass: "btn btn-danger",
            autoReplace: true,
            removeLabel: "移除",
            msgSizeTooLarge: '图片文件太大！',
            msgFilesTooMany: "选择上传的文件数量为({n}) 超过允许的最大数值({m})！",
            msgUploadEnd: '图片上传成功！',
            msgUploadBegin: '初始化中...',
            msgZoomModalHeading: '图片详情预览',
            msgInvalidFileExtension: '非法文件扩展名 "{name}"！ 仅支持 "{extensions}" 的文件扩展名！'
        }).on('fileerror', function (event,msg) {
            alert('图片上传失败！' + msg);
        }).on('fileuploaded', function (event, data) {//异步上传成功结果处理
            $("#avatar").val(data.response.imgUrl);
        }).on('fileclear', function (event) {
            alert("图片被清除啦！");
        });
        ;

    })


</script>
</body>
</html>
