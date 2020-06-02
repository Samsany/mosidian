$(function(){

    "use strict";

    //===== Prealoder

    $(window).on('load', function(event) {
        $('.preloader').delay(500).fadeOut(500);
    });



    //===== Sticky

    $(window).on('scroll',function(event) {
        var scroll = $(window).scrollTop();
        if (scroll < 245) {
        $(".navbar").removeClass("sticky");
        }else{
        $(".navbar").addClass("sticky");
        }
    });



    //===== Mobile Icon active

    $('.navbar-toggler').on('click', function(event) {
        $(this).toggleClass("active");
    });

    // 弹出框
    $('#popup-box').popover({
        placement: "bottom",
        html: true,
        content: "<div id='pop_content' style='display: flex;justify-content: center;flex-direction: column;width: 300px;height: auto'></div>"
    }).click(function () {
        var html =
            // "  <a href=\"#\" class=\"\" style='padding: 0 8px;font-size: 15px;text-align: center'>\n" +
            // "    暂无数据\n" +
            // "  </a>\n" +
            "  <a href=\"#\" class=\"\" style='padding: 8px;font-size: 15px;border-bottom: 1px solid darkgrey;width: 250px;'><i class='iconfont icongouwuche' style='padding-right: 20px'></i>注册</a>\n" +
            "  <a href=\"#\" class=\"\" style='padding: 8px;font-size: 15px;border-bottom: 1px solid darkgrey;width: 250px;'><i class='iconfont iconlike' style='padding-right: 20px'></i>登录</a>\n" +
            "  <a href=\"#\" class=\"\" style='padding: 8px;font-size: 15px;border-bottom: 1px solid darkgrey;width: 250px;'><i class='iconfont iconsort' style='padding-right: 20px'></i>订单</a>\n" +
            "  <a href=\"#\" class=\"\" style='padding: 8px;font-size: 15px;border-bottom: 1px solid darkgrey;width: 250px;'><i class='iconfont iconfriend' style='padding-right: 20px'></i>收藏</a>\n" +
            "  <a href=\"#\" class=\"\" style='padding: 8px;font-size: 15px;border-bottom: 1px solid darkgrey;width: 250px;'><i class='iconfont iconfriendadd' style='padding-right: 20px'></i>售后服务</a>\n";
        $("#pop_content").html(html);
    });

    $('#bagBtn1').click(function () {
        if ($('.navBag1').css('display') == 'none') {
            $('.navBag2').css('display','block');
        } else {
            $('.navBag1').css('display','none');
            $('.navBag2').css('display','block');
        }
    });

    $('#bagBtn2').click(function () {
        if ($('.navBag2').css('display') == 'none') {
            $('.navBag1').css('display','block');
        } else {
            $('.navBag1').css('display','block');
            $('.navBag2').css('display','none');
        }
    });



    //===== Scroll It active

    $.scrollIt({
        upKey: 38,             // key code to navigate to the next section
        downKey: 40,           // key code to navigate to the previous section
        easing: 'linear',      // the easing function for animation
        scrollTime: 1300,      // how long (in ms) the animation takes
        activeClass: 'active', // class given to the active nav element
        onPageChange: null,    // function(pageIndex) that is called when page is changed
        topOffset: -70,        // offste (in px) for fixed top navigation
    });




    //===== SLIDER PART

    $('.slider_part').slick({
        autoplay:true,
        autoplaySpeed:6000,
        dots:true,
        arrows:false,
        fade:true,
        pauseOnHover:false,
    });


    //====== Magnific Popup

    $('.Video-popup').magnificPopup({
        type: 'iframe'
        // other options
    });


    //====== Team Slide Slick

    $('.team_slide').slick({
        autoplay: true,
        autoplaySpeed: 4000,
        speed: 300,
        prevArrow:'<i class="fas fa-angle-left"></i>',
        nextArrow:'<i class="fas fa-angle-right"></i>',
        slidesToShow: 3,
        slidesToScroll: 1,
        responsive: [
        {
          breakpoint: 1200,
          settings: {
            slidesToShow: 3,
            slidesToScroll: 1,
          }
        },
        {
          breakpoint: 992,
          settings: {
            slidesToShow: 2,
            slidesToScroll: 1,
            arrows: false,
          }
        },
        {
          breakpoint: 768,
          settings: {
            slidesToShow: 1,
            slidesToScroll: 1,
            arrows: false,
          }
        }
        // You can unslick at a given breakpoint now by adding:
        // settings: "unslick"
        // instead of a settings object
        ]
    });


    //====== Client Slide Slick

    $('.client-slied').slick({
        autoplay: true,
        autoplaySpeed: 4000,
        speed: 300,
        prevArrow:'<i class="fas fa-angle-left"></i>',
        nextArrow:'<i class="fas fa-angle-right"></i>',
        slidesToShow: 3,
        slidesToScroll: 1,
        responsive: [
        {
          breakpoint: 1200,
          settings: {
            slidesToShow: 3,
            slidesToScroll: 1,
          }
        },
        {
          breakpoint: 992,
          settings: {
            slidesToShow: 2,
            slidesToScroll: 1,
            arrows: false,
          }
        },
        {
          breakpoint: 768,
          settings: {
            slidesToShow: 1,
            slidesToScroll: 1,
            arrows: false,

          }
        }
        // You can unslick at a given breakpoint now by adding:
        // settings: "unslick"
        // instead of a settings object
        ]
    });


    //====== Brand Slied Slick

    $('.brand_slied').slick({
        autoplay: true,
        autoplaySpeed: 2000,
        speed: 300,
        slidesToShow: 6,
        slidesToScroll: 1,
        arrows: false,
        responsive: [
        {
          breakpoint: 1200,
          settings: {
            slidesToShow: 6,
            slidesToScroll: 1,
          }
        },
        {
          breakpoint: 992,
          settings: {
            slidesToShow: 4,
            slidesToScroll: 1,
          }
        },
        {
          breakpoint: 768,
          settings: {
            slidesToShow: 3,
            slidesToScroll: 1,
          }
        },
        {
          breakpoint: 576,
          settings: {
            slidesToShow: 2,
            slidesToScroll: 1,
          }
        }
        // You can unslick at a given breakpoint now by adding:
        // settings: "unslick"
        // instead of a settings object
        ]
    });


    //===== Images Loaded

    $('.container').imagesLoaded( function() {
        //===== Isotope
        var $grid = $('.grid').isotope({
          // options
        });
        // filter items on button click
        $('.project_menu ul').on( 'click', 'li', function(event) {
          var filterValue = $(this).attr('data-filter');
          $grid.isotope({ filter: filterValue });
        });

        //for menu active class
        $('.project_menu ul li').on('click', function (event) {
            $(this).siblings('.active').removeClass('active');
            $(this).addClass('active');
            event.preventDefault();
        });
    });



    //===== Project Popup

    $('.project-popup').magnificPopup({
        type: 'image',
        gallery:{
        enabled:true
        }
    });



    //===== Back to top

    // Show or hide the sticky footer button
    $(window).on('scroll', function(event) {
        if($(this).scrollTop() > 600){
            $('.back-to-bottom').fadeIn(200)
            $('.back-to-top').fadeIn(200)
            $('.footerbar').fadeIn(200)
        } else{
            $('.back-to-top').fadeOut(200)
            $('.back-to-bottom').fadeOut(200)
            $('.footerbar').fadeOut(200)
        }
    });


    //Animate the scroll to yop
    $('.back-to-top').on('click', function(event) {
        event.preventDefault();

        $('html, body').animate({
            scrollTop: 0,
        }, 1500);
    });

    // $('.home').on('click', function(event) {
    //     event.preventDefault();
    //
    //     $('html, body').animate({
    //         scrollTop: 0,
    //     }, 1500);
    // });


    $('.back-to-bottom').on('click', function(event) {
        event.preventDefault();

        $('html, body').animate({
            scrollTop: $('.footer').offset().top
        }, 1500);
    });

    // 业务系统
    $("#slide1").bind("mouseover",function(){
        $("#showh").html("科技为先");
        $("#showp1").html("");
        $("#showp2").html("财富不能创造文化,文化却能创造财富\"");
    })
    $("#slide2").bind("mouseover",function(){
        $("#showh").html("以人为本");
        $("#showp1").html("满足初创需求");
        $("#showp2").html("初创公司的核心不是技术能力，提供满足需求的ERP等心选产品。");
    })
    $("#slide3").bind("mouseover",function(){
        $("#showh").html("随时随地移动办公");
        $("#showp1").html("成为用户体验最佳的互联网金融平台");
        $("#showp2").html("随时随地管理企业需求，打通企业管理的“人财货客”全链条。");
    })
    $("#slide4").bind("mouseover",function(){
        $("#showh").html("即时业务洞察");
        $("#showp1").html("随时掌握业务情况");
        $("#showp2").html("简易搭建专业水准的可视化大屏，进行即时业务洞察。");
    })
    $("#slide5").bind("mouseover",function(){
        $("#showh").html("精准推广");
        $("#showp1").html("推广精准细致");
        $("#showp2").html("汇聚腾讯优质资源，精准定位受众");
    })
    $("#slide6").bind("mouseover",function(){
        $("#showh").html("专业后台");
        $("#showp1").html("");
        $("#showp2").html("后台操作简单方便，推广效果随时展现");
    })
    $("#slide7").bind("mouseover",function(){
        $("#showh").html("车载物联—专属客服、车载MiFi、北斗定位导航、后视镜等");
        $("#showp1").html("客户诉求：车内设备多，要求可定制流量资费套餐和价格；信号覆盖要求稳定、 定位精确度高");
        $("#showp2").html("解决方案：移动/电信2-15G超低资费；工业级sim卡");
    })
    $("#slide8").bind("mouseover",function(){
        $("#showh").html("专属客服");
        $("#showp1").html("");
        $("#showp2").html("客服团队专业指导系统使用，为您量身打造推广方");
    });
    // 保障协议
    $("#safeguardButtenA").click(function(){
        $("#safeguardA").removeClass("show-acos");
        $("#safeguardB").addClass("show-acos");
        $("#safeguardC").addClass("show-acos");
        $("#safeguardButtenA").css("color","#1f8ffd");
        $("#safeguardButtenB").css("color","black");
        $("#safeguardButtenC").css("color","black");
    })
    $("#safeguardButtenB").click(function(){
        $("#safeguardB").removeClass("show-acos");
        $("#safeguardA").addClass("show-acos");
        $("#safeguardC").addClass("show-acos");
        $("#safeguardButtenA").css("color","black");
        $("#safeguardButtenB").css("color","#1f8ffd");
        $("#safeguardButtenC").css("color","black");
    })
    $("#safeguardButtenC").click(function(){
        $("#safeguardC").removeClass("show-acos");
        $("#safeguardB").addClass("show-acos");
        $("#safeguardA").addClass("show-acos");
        $("#safeguardButtenA").css("color","black");
        $("#safeguardButtenB").css("color","black");
        $("#safeguardButtenC").css("color","#1f8ffd");
    })
    $("#dataA").click(function(){
        $("#dataShowA").removeClass("show-acos");
        $("#dataShowB").addClass("show-acos");
        $("#dataA").css("color","#1f8ffd");
        $("#dataB").css("color","black");
    })
    $("#dataB").click(function(){
        $("#dataShowB").removeClass("show-acos");
        $("#dataShowA").addClass("show-acos");
        $("#dataA").css("color","black");
        $("#dataB").css("color","#1f8ffd");
    });

});
