package com.mosidian.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {

    @GetMapping("/")
    public ModelAndView login(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index-test");
        return mv;
    }

    @GetMapping("/sys/megaData/outlet")
    public ModelAndView outlet(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("sys/megaData/outlet");
        return mv;
    }

    @GetMapping("/sys/user/card")
    public ModelAndView meCard(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("sys/user/card");
        return mv;
    }



    @GetMapping("/register")
    public ModelAndView register(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("register");
        return mv;
    }

    @GetMapping("/sys/kh/register")
    public ModelAndView kh(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("sys/kehu/register");
        return mv;
    }

    @GetMapping("/bcLogin")
    public ModelAndView bcLogin(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("sys/login/bcLogin");
        return mv;
    }

    @GetMapping("/meLogin")
    public ModelAndView meLogin(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("sys/login/meLogin");
        return mv;
    }


    @RequestMapping(value = "/index-member",method = RequestMethod.GET)
    public ModelAndView indexMember(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index-member");
        return mv;
    }

    @RequestMapping(value = "/index-admin",method = RequestMethod.GET)
    public ModelAndView indexAdmin(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index-admin");
        return mv;
    }

    @RequestMapping(value = "/index-user",method = RequestMethod.GET)
    public ModelAndView indexUser(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index-user");
        return mv;
    }

    @RequestMapping(value = "/index-express",method = RequestMethod.GET)
    public ModelAndView indexExpress(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index-express");
        return mv;
    }

    @RequestMapping(value = "/index-check",method = RequestMethod.GET)
    public ModelAndView indexCheck(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index-check");
        return mv;
    }

    @RequestMapping("/loginOut")
    public String loginOut() {
        return "/login";
    }

}
