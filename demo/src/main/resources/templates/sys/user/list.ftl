<#import "/common/mepaging.ftl" as mepaging/>
<#include "/common/header.ftl">
<title>用户列表</title>
</head>
<body>
<div class="container-fluid">
    <div class="card">
        <div class="container-fluid ">
            <form action="/user/list" method="get">
                <div class="btn-toolbar justify-content-between me-btn-toolbar" role="toolbar"
                     aria-label="Toolbar with button groups">
                    <div class="btn-group me-button-group " role="group" aria-label="First group">
                     <#--   <div class="me-button-group">
                            <button type="button" class="btn btn-outline-primary add">添加</button>
                        </div>-->
                    </div>
                    <div class="input-group">
                        <input type="text" name="name" value="${pd.username!}" class="form-control" placeholder="企业名称"
                               aria-label="Input group example"
                               aria-describedby="btnGroupAddon2">
                        &nbsp;&nbsp;
                        <div class="input-group-prepend">
                            <button type="submit" class="btn btn-outline-primary">查询</button>
                        </div>
                    </div>
                </div>
            </form>
            <table class="table table-hover me-m-t-20">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">企业名称</th>
                    <th scope="col">账号</th>
                    <th scope="col">联系方式</th>
                    <th scope="col">状态</th>
                    <th scope="col">审核回复</th>
                    <th scope="col">操作</th>
                </tr>
            <#list userList.records as user>
                <tr>
                    <td>${user_index+1!}</td>
                    <td>${user.memo!}</td>
                    <td>${user.username!}</td>
                    <td>${user.phone!}</td>
                    <#if user.status==0>
                         <td>待审核</td>
                    <#elseif user.status==1>
                         <td>审核通过</td>
                    <#elseif user.status==2>
                        <td>审核未通过</td>
                    <#else>
                        <td>已激活</td>
                    </#if>
                    <td>${user.message!}</td>
                    <td>
                        <button type="button" class="btn btn-outline-primary btn-sm edit" data-value="${user.id!}">
                            编辑
                        </button>
                        <button type="button" class="btn btn-outline-primary btn-sm delete" data-value="${user.id!}">
                           删除
                        </button>
                        <#if user.status==0>
                           <button type="button" class="btn btn-outline-primary btn-sm checkUser" data-value="${user.id!}">
                              审核
                           </button>
                        </#if>
                    </td>
                </tr>
            </#list>
            </table>
        <@mepaging.paging pagingList=userList url="./list" parameterMap=pd/>

        </div>
    </div>
<#include "/common/footer.ftl">
    <script type="text/javascript">
        $(function () {

            $(".checkUser").click(function () {
                var userid = $(this).data("value");
                dolphin.iframe('/user/editCheck?id='+userid, '企业审核', '600px', '400px');
            })

            $(".delete").click(function () {
                var userid = $(this).data("value");
                if (dolphin.toInt(userid) <= 0) {
                    dolphin.msg("请选择要删除的用户！");
                    return;
                }

                dolphin.confirm(dolphin.confirmDel, function () {
                    dolphin.post('/user/delete?id=' + userid, {}, function (result) {
                        if (result.status == 1) {
                            dolphin.alertto(result.info, location.href);
                        } else {
                            dolphin.alert(result.info);
                        }
                    })
                })
            })


            $(".edit").click(function () {
                var userid = $(this).data("value");
                dolphin.iframe('/user/edit?id=' + userid, '用户信息', '', '');
            })
        })
    </script>
</body>
</html>
