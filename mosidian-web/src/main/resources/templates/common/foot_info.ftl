<!doctype html>
<html lang="en">
<#include "/common/header.ftl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
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
<!--====== FOOTER PART START ======-->
<div class="footer black-bg pt-30 pb-95">
    <div class="container">
        <div class="row">
            <div class="footer-flex">
                <div>
                    <div class="title pt-70">
                        <a href="#"><img src="img/logo.png" alt="Logo" style="width: 160px;height: 40px"></a>
                    </div>
                    <div class="info pt-30" style="width: 220px;font-size: 14px;color: gainsboro">
                        <span class="foot-font">免费咨询服务热线</span>
                        <div class="foot-numf">
                            187-2181-6682
                        </div>
                        <!--<div class="foot-numf numf">
                            400-008-0586
                        </div>-->
                        <#--                        <span class="foot-font">邮箱：ticzuo@dingtalk.com</span>-->
                        <#--                        <span class="foot-font">地址：上海市嘉定区江桥万达4号写字楼</span>-->
                        <#--                        <span class="foot-font">邮编：000000</span>-->
                        <#--                        <span class="foot-font">邮箱：ticzuo@dingtalk.com</span>-->
                        <#--                        <span class="foot-font">地址：上海市嘉定区江桥万达4号写字楼</span>-->
                        <#--                        <span class="foot-font">邮编：000000</span>-->
                        <div class="foot-font">
                            <span class="foot-title">邮箱：</span>
                            <span class="foot-detail">mosidian.dingtalk.com</span>
                        </div>
                        <div class="foot-font">
                            <span class="foot-title">地址：</span>
                            <span class="foot-detail">上海市嘉定区江桥万达4号写字楼</span>
                        </div>
                        <div class="foot-font">
                            <span class="foot-title">邮编：</span>
                            <span class="foot-detail">201800</span>
                        </div>
                        <ul class="foot-code" style="height: 34px;">
                            <li>
                                <a id="weixinUrl"><i class="iconfont icon-weixin"></i></a>
                            </li>
                            <#-- <li>
                                 <a><i class="fab fa-weibo"></i></ a>
                             </li>-->
                            <li>
                                <a onclick="getUserEmail(1)"> <i class="iconfont icon-youxiang1"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div>
                    <div class="title pt-70">
                        <h4>关于我们</h4>
                    </div>
                    <div class="footer-widget-list pt-30">
                        <ul>
                            <li><a data-toggle="modal" data-target="#valueModal"><i class="fa fa-angle-right"></i>Mosidian价值观</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right"></i>Mosidian与商务</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#recruitmentModal"><i class="fa fa-angle-right"></i>Mosidian招贤纳士</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#aiosModal"><i class="fa fa-angle-right"></i>Mosidian招商计划</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right"></i>Mosidian会员俱乐部</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div>
                    <!-- 业务研究-->
                    <div class="title pt-70">
                        <h4>业务研究</h4>
                    </div>
                    <div class="footer-widget-list pt-30">
                        <ul>
                            <!-- <li><a data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right"></i>行业研究</a>
                             </li>-->
                            <li><a data-toggle="modal" data-target="#report1"><i class="fa fa-angle-right"></i>月/年度检测报告</a>
                            </li>
                            <li><a id="outlet"><i
                                            class="fa fa-angle-right"></i>商家投资报告</a></li>
                            <li><a data-toggle="modal" data-target="#report3"><i
                                            class="fa fa-angle-right"></i>物联网发展报告</a></li>
                            <li><a data-toggle="modal" data-target="#report4"><i class="fa fa-angle-right"></i>区域经济发展报告</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#report5"><i
                                            class="fa fa-angle-right"></i>风险预警报告</a></li>
                            <!--<li><a data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right"></i>咨询平台报告</a></li>-->
                        </ul>
                    </div>
                </div>
                <div class="modal fade" id="report1" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
                     aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">月/年度检测报告</h5>
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
                <div class="modal fade" id="report2" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
                     aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">商家投资报告</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <p>行业现状概况

                                    　　2019成电商直播元年

                                    　　2016年，淘宝直播和蘑菇街直播先后开启；之后两年，电商直播皆处于蓄力阶段，虽然亦有平台增加电商直播功能，均为尝试；

                                    　　2019年，进入大爆发，抖音快手等内容平台和小红书、拼多多等电商平台纷纷大力发展电商直播

                                    　　三个最值得关注的数字

                                    　　CNNIC最新数据显示，观看直播的网民数已经超过4.3亿，涵盖了游戏直播、秀场直播、电商直播等，说明直播已经成为众多网民的上网习惯之一。

                                    　　据淘宝内容电商事业部数据，2019年，超过一半的品牌商家通过直播获得了新增长；而在淘宝直播品台上，商家自播的场次占比为九成，商家自播是淘宝直播的基石。

                                    风暴将至：行业趋势分析

                                    　　淘宝直播崛起， 是新消费时代的标志性事件

                                    　　电商直播生态链上的角色将悉数登场, 极大丰富

                                    直播生态橄榄球型化

                                    　　随着5 G 普及， 直播将成为品牌商家营销的标配</p>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal fade" id="report3" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
                     aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">物联网发展报告</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                2019世界物联网博览会重要活动之一——2019世界物联网博览会新技术新产品新应用成果发布会在无锡举行。会上，中国经济信息社发布《2018-2019中国物联网发展年度报告》(下称《年报》)，系统分析全球物联网发展新态势，为业界、学界和政府提供重要参考。

                                《年报》认为，2018年以来，全球物联网应用场景持续拓展，安全意识不断增强。我国物联网产业保持高速增长，正迈入“跨界融合，集成创新、规模化发展”新阶段。随着技术融合加快，物联网发展呈现一些新的特点与趋势。


                                中国经济信息社副总裁曹文忠发布《2018-2019中国物联网发展年度报告》

                                全球物联网行业渗透率持续提高，联网设备安全性广受关注。2018年以来，全球物联网设备连接数保持强劲增势，设备接入量超70亿，行业渗透率持续提高，智慧城市、工业物联网应用场景快速拓展。美国、欧盟、日本等发达国家和地区更加重视物联网设备的安全性。

                                我国政策聚焦重点应用和产业生态，物联网产业规模已达万亿元。2018-2019年，我国加大IPv6、NB-IOT、5G等基础设施投资，政策聚焦车联网、工业物联网等重点领域应用，生态布局进一步优化。数据显示，2018年我国物联网产业规模已超1.2万亿元，物联网业务收入较上年增长72.9%。

                                物联网应用走向开放、规模化，5G等新技术加速融合开启“万物智联”新时代。2018-2019年，物联网应用从闭环、碎片化走向开放、规模化，智慧城市、工业物联网、车联网等率先突破。5G、人工智能、区块链等新一代信息技术与物联网加速融合，开启了“万物智联”
                                “人机深度”的新时代。
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal fade" id="report4" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
                     aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">区域经济发展报告</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                敬请期待...

                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal fade" id="report5" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
                     aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">风险预警报告</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                敬请期待...
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- 业务研究 end-->
                <div>
                    <div class="title pt-70">
                        <h4>账户管理</h4>
                    </div>
                    <div class="footer-widget-list pt-30">
                        <ul>
                            <li>
                                <a id="register"><i class="fa fa-angle-right"></i>用户开卡</a>
                            </li>
                            <li>
                                <a id="active_member"><i class="fa fa-angle-right"></i>会员激活</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right"></i>账号管理</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right"></i>充值付款</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right"></i>索取发票</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div>
                    <!-- 支持与服务-->
                    <div class="title pt-70">
                        <h4>支持与服务</h4>
                    </div>
                    <div class="footer-widget-list pt-30">
                        <ul>
                            <li><a data-toggle="modal" data-target="#serve1"><i class="fa fa-angle-right"></i>支持计划</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#serve2"><i class="fa fa-angle-right"></i>帮助文档</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#serve3"><i class="fa fa-angle-right"></i>自助工具</a>
                            </li>
                            <!--<li><a data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right"></i>咨询平台服务</a></li>-->
                            <li><a data-toggle="modal" data-target="#serve4"><i class="fa fa-angle-right"></i>服务案例</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#serve5"><i
                                            class="fa fa-angle-right"></i>聆听.建议反馈</a></li>
                            <!--<li><a data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right"></i>客户分享</a></li>-->
                        </ul>
                    </div>
                    <div class="modal fade" id="serve1" tabindex="-1" role="dialog"
                         aria-labelledby="exampleModalLongTitle"
                         aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">支持计划</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    顶级支持计划为客户提供专属技术服务经理，帮助企业在业务、架构上稳定、高效、合理的使用云产品；提供7×24小时的专人专群支持，
                                    保障服务的及时性和有效性
                                    - 专属技术服务经理（TAM）贴身跟进，保障业务平稳运行；基于最佳实践，优化云上架构；定制化方案，助力业务创新
                                    - 云上护航服务，专家团队保障客户业务高峰平稳度过
                                    - 架构咨询、应用水位评估、容灾等增值服务，行业专家助力企业数字化转型
                                    - 专属企业群，提供7x24小时技术支持，高效响应客户诉求
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal fade" id="serve2" tabindex="-1" role="dialog"
                         aria-labelledby="exampleModalLongTitle"
                         aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">帮助文档</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    <p>敬请期待</p>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal fade" id="serve3" tabindex="-1" role="dialog"
                         aria-labelledby="exampleModalLongTitle"
                         aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">自助工具</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">敬请期待</div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal fade" id="serve4" tabindex="-1" role="dialog"
                         aria-labelledby="exampleModalLongTitle"
                         aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">服务案例</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    敬请期待...
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="modal fade" id="serve5" tabindex="-1" role="dialog"
                         aria-labelledby="exampleModalLongTitle"
                         aria-hidden="true">
                        <div class="modal-dialog" role="document">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h5 class="modal-title">聆听.建议反馈</h5>
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button>
                                </div>
                                <div class="modal-body">
                                    <textarea rows="5" style="width: 450px"></textarea></div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">提交</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- 支持与服务end-->
                <div>
                    <div class="title pt-70">
                        <h4>快速入口</h4>
                    </div>
                    <div class="footer-widget-list pt-30">
                        <ul>
                            <li><a href="javascript:" data-toggle="modal"
                                   data-target=".bs-mosidian-modal-lg"><i class="fa fa-angle-right"></i>公司简介</a>
                            </li>
                            <!--<li><a data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right"></i>首页</a></li>-->
                            <li><a href="meLogin"><i class="fa fa-angle-right"></i>会员系统</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#exampleModal" href="#"><i
                                            class="fa fa-angle-right"></i>客户案例</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#exampleModalScrollable" href="#"><i
                                            class="fa fa-angle-right"></i>我的团队</a>
                            </li>
                            <li><a data-toggle="modal" data-target="#exampleMod" href="#"><i
                                            class="fa fa-angle-right"></i>联系我们</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content" align="center">
                    <div class="modal-body">
                        <div class="client_text">
                            <p>敬请期待</p></div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade" id="exampleMod" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">联系我们</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <textarea rows="5" style="width: 450px"></textarea></div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">提交</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="modal fade" id="exampleModalScrollable" tabindex="-1" role="dialog"
         aria-labelledby="exampleModalScrollableTitle" aria-hidden="true">
        <div class="modal-dialog modal-dialog-scrollable" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalScrollableTitle">Mosidian</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="our_team pb-50" data-scroll-index="6">
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-8 offset-lg-2">
                                    <div class="section_title text-center">
                                        <h2>TMIC</h2>
                                        <p>上海莫斯蒂恩网络科技有限公司成立于2020年5月18日，公司总部位于上海市奉贤区，
                                            是经奉贤区市场监管局批准成立的一家创新型企业，
                                            上海莫斯蒂恩网络科技有限公司始终以“为客户提供整体解决方案、
                                            为客户创造价值”为目标，在”和谐、上进、奉献、包容、厚德”企业文化的倡导下，
                                            让上海莫斯蒂恩网络科技有限公司的每一位员工分享公司成长带来的收获和喜悦。</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
<!-- foot modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="myModalLabel">Mosidian</h4>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>

            </div>
            <div class="modal-body" role="document" style="font-size: 24px;text-align: center">
                敬请期待...
            </div>
            <div class="modal-footer">
                <!--<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" data-dismiss="modal">确认</button>-->
            </div>
        </div>
    </div>
</div>
<!--====== FOOTER PART ENDS ======-->
<!--=======公司价值观modal======-->
<div class="modal fade bs-mosidian-modal-lg" id="valueModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <!--<div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
            </div>-->
            <div class="modal-body">
                <div class="ms-content">
                    <h3>Mosidian价值观</h3>
                    <div class="ms-who">
                        <!--                        <img src="img/about/about_who_img.gif"/>-->
                        <div style="margin-left: 20px;width: 400px">
                            <!--<span style="color: rgb(204, 204, 204);font-size: 26px;margin-bottom: 30px;font-weight: bold">我们是谁？</span>-->
                            <p style="color: #666;font-size: 14px">
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;上海莫斯蒂恩网络科技有限公司始终以“为客户提供整体解决方案、为客户创造价值”为目标，在”和谐、上进、奉献、包容、厚德”企业文化的倡导下，让上海莫斯蒂恩网络科技有限公司的每一位员工分享公司成长带来的收获和喜悦。
                            </p>
                            <p style="padding-top: 15px;color: rgb(153, 153, 153);font-size: 14px;">
                                以方正树立诚信人格，用思维创造崭新明天。</p>
                        </div>
                    </div>
                    <div class="ms-what">
                        <div style="width: 400px">
                            <div class="what">Mosidian邀您一起实现价值</div>
                            <div class="what_int">
                                加入我们>
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
                                        <!--<div class="what_name_en">
                                            Building a viable e-commerce site
                                        </div>-->
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
                                        <!--<div class="what_name_en">
                                            City Internet Marketing
                                        </div>-->
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
                                        <!--<div class="what_name_en">
                                            Internet Brand Website
                                        </div>-->
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
                                        <!--<div class="what_name_en">
                                            Making money for your e-commerce
                                        </div>-->
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

<!--=======招贤纳士modal======-->
<div class="modal fade bs-mosidian-modal-lg" id="recruitmentModal" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <!--<div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
            </div>-->
            <div class="modal-body">
                <div class="ms-content">
                    <h3>Mosidian招贤纳士</h3>
                    <div class="ms-who">
                        <!--                        <img src="img/about/about_who_img.gif"/>-->
                        <div style="margin-left: 20px;width: 400px">
                            <!--<span style="color: rgb(204, 204, 204);font-size: 26px;margin-bottom: 30px;font-weight: bold">我们是谁？</span>-->
                            <p style="color: #666;font-size: 14px">
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;上海莫斯蒂恩网络科技有限公司始终以“为客户提供整体解决方案、为客户创造价值”为目标，在”和谐、上进、奉献、包容、厚德”企业文化的倡导下，让上海莫斯蒂恩网络科技有限公司的每一位员工分享公司成长带来的收获和喜悦。
                            </p>
                            <p style="padding-top: 15px;color: rgb(153, 153, 153);font-size: 14px;">
                                以方正树立诚信人格，用思维创造崭新明天。</p>
                        </div>
                    </div>
                    <div class="ms-what">
                        <div style="width: 400px">
                            <div class="what">我们团队欢迎您</div>
                            <div class="what_int">
                                加入我们>
                            </div>
                            <div class="what_con">
                                <div class="what_A">
                                    <div class="what_img">
                                        <img src="img/about/what_A.gif"/>
                                    </div>
                                    <div class="what_name">
                                        <div class="what_name_ch" style="font-size: 16px;">
                                            首席UI设计师
                                            <!-- 搭建有生命力的电子商务网站
                                         </div>
                                         <div class="what_name_en">
                                             Building a viable e-commerce site-->
                                        </div>
                                    </div>
                                    <div class="clear"></div>
                                </div>
                                <div class="what_A">
                                    <div class="what_img fl">
                                        <img src="img/about/what_B.gif"/>
                                    </div>
                                    <div class="what_name fr">
                                        <div class="what_name_ch" style="font-size: 16px;">
                                            首席UI设计师
                                            <!--</div>
                                            <div class="what_name_en">
                                                City Internet Marketing-->
                                        </div>
                                    </div>
                                </div>
                                <div class="what_A">
                                    <div class="what_img fl">
                                        <img src="img/about/what_C.gif"/>
                                    </div>
                                    <div class="what_name fr">
                                        <div class="what_name_ch" style="font-size: 16px;">
                                            首席UI设计师
                                            <!--                                        </div>-->
                                            <!--                                        <div class="what_name_en">-->
                                            <!--                                            Internet Brand Website-->
                                        </div>
                                    </div>
                                </div>
                                <div class="what_A">
                                    <div class="what_img fl">
                                        <img src="img/about/what_D.gif"/>
                                    </div>
                                    <div class="what_name fr">
                                        <div class="what_name_ch" style="font-size: 16px;">
                                            首席UI设计师
                                            <!--  </div>
                                              <div class="what_name_en">
                                                  Making money for your e-commerce-->
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

<!--=======招商计划modal======-->
<div class="modal fade bs-mosidian-modal-lg" id="aiosModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog modal-lg" role="document">
        <div class="modal-content">
            <!--<div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
                </button>
            </div>-->
            <div class="modal-body">
                <div class="ms-content">
                    <h3>Mosidian招商计划</h3>
                    <div class="ms-who">
                        <!--                        <img src="img/about/about_who_img.gif"/>-->
                        <div style="margin-left: 20px;width: 400px">
                            <span style="color: rgb(204, 204, 204);font-size: 26px;margin-bottom: 30px;font-weight: bold;text-align: center">什么是”招商计划“？</span>
                            <p style="color: #666;font-size: 16px">
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;招商规划法通过预招商的方式提前调研企业需求，同时解决了政府工作中普遍存在的两个问题：一是规划太空太虚不落地，没有操作性的问题；二是招商无方向无标准，盲目招商、低效招商的问题。
                                按照“招商规划法”的原理，判断规划优劣的一个重要标准就是目标招商企业是否认可产业的定位。所以，能否有效指导招商，招商结果的好坏，是评判规划是否科学的重要标准之一。
                            </p>
                            <p style="padding-top: 15px;color: rgb(153, 153, 153);font-size: 14px;">
                                以方正树立诚信人格，用思维创造崭新明天。</p>
                        </div>
                    </div>
                    <div class="ms-what">
                        <div style="width: 400px">
                            <div class="what">Mosidian期待您的加入</div>
                            <div class="what_int">
                                加入我们>
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
                                        <!-- <div class="what_name_en">
                                             Building a viable e-commerce site
                                         </div>-->
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
                                        <!--<div class="what_name_en">
                                            City Internet Marketing
                                        </div>-->
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
                                        <!--<div class="what_name_en">
                                            Internet Brand Website
                                        </div>-->
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
                                        <!-- <div class="what_name_en">
                                             Making money for your e-commerce
                                         </div>-->
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

<!--====== COPYRIGHT PART START ======-->
<div class="copyright text-center pt-15 pb-15">
    <p style="color:#9a9a9a;cursor: pointer">
        <a onclick="legalNotices1()">法律声明</a> <a onclick="legalNotices2()">隐私政策</a> 版权所有 &copy; 2020 <span><a
                    href="#"></a>Mosidian</span> All rights reserved. </p>
    </a>
    <p style="font-size: 10px"><a style="color: #9a9a9a" href="http://beian.miit.gov.cn">沪ICP备20015652号-1</a></p>
    <!--    <p style="font-size: 10px">苏ICP备17040376号-32 苏B2-20130048号 苏公网安备 32011402010636号</p>-->
</div>
<!--====== COPYRIGHT PART ENDS ======-->
</body>
<#include "/common/footer.ftl">
<script>
    function getUserEmail(id) {
        dolphin.iframe("/sys/email/email_info/" + id, "邮箱信息", "200px", "200px")
    }

    //法律协议
    function legalNotices1() {
        dolphin.iframe("/sys/legal_notices/legal_notice1", "法律声明", "800px", "600px")
    }

    function legalNotices2() {
        dolphin.iframe("/sys/legal_notices/legal_notice2", "隐私政策", "800px", "600px")
    }

    $(function () {
        $("#active_member").click(function () {
            window.location.href = "http://www.mosidian.com/mosidian-admin/#/home"
        })
        $("#weixinUrl").click(function () {
            dolphin.iframe("/sys/acos/consult2", "微信联系", "375px", "410px")
        })
    })
</script>
</html>
