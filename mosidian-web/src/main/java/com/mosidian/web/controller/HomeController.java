package com.mosidian.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//    @Autowired
//    private RedisService redisService;
//    @Value("${jwt.tokenHeader}")
//    private String tokenHeader;
//    @Value("${jwt.tokenHead}")
//    private String tokenHead;

    @GetMapping("/")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index-test");
        return mv;
    }

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index-test");
        return mv;
    }

    @GetMapping("/sys/mega/outlet")
    public ModelAndView outlet() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sys/mega/outlet");
        return mv;
    }

    @GetMapping("/sys/user/card/{id}")
    public ModelAndView meCard(@PathVariable("id") Integer id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sys/user/card");
        mv.getModel().put("id",id);
        return mv;
    }


    @GetMapping("/sys/register")
    public ModelAndView register() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("register");
        return mv;
    }

    @GetMapping("/sys/kh/register")
    public ModelAndView kh1() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sys/kh/register");
        return mv;
    }

    @GetMapping("/sys/kh/register_qiye")
    public ModelAndView qiye() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sys/kh/register_qiye");
        return mv;
    }

    @GetMapping("/bcLogin")
    public ModelAndView bcLogin() {
        ModelAndView mv = new ModelAndView("redirect:http://www.mosidian.com/mosidian-admin/#/home");
        return mv;
    }

    @GetMapping("/meLogin")
    public ModelAndView meLogin() {
        ModelAndView mv = new ModelAndView("redirect:http://www.mosidian.com/mosidian-admin/#/home");
        return mv;
    }

    @GetMapping("/sys/acos/consult1")
    public ModelAndView consult1() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sys/acos/consult1");
        return mv;
    }

    @GetMapping("/acosUrl")
    public ModelAndView acosUrl() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sys/acos/business1");
        return mv;
    }

    @GetMapping("/acosWebService")
    public ModelAndView acosWebService() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sys/acos/webService");
        return mv;
    }

    @GetMapping("/acosPerson")
    public ModelAndView acosPerson() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sys/acos/person");
        return mv;
    }


    @GetMapping("/acosOffice")
    public ModelAndView acosOffice() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sys/acos/office");
        return mv;
    }

    @GetMapping("/sys/email/email_info/{id}")
    public ModelAndView emailInfo(@PathVariable Integer id) {
        ModelAndView mv = new ModelAndView();
        mv.getModel().put("id", id);
        mv.setViewName("sys/email/email_info");
        return mv;
    }


}
