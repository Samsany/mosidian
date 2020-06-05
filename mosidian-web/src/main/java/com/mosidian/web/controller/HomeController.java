package com.mosidian.web.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mosidian.web.common.redis.RedisService;
import com.mosidian.web.model.sys.User;
import com.mosidian.web.utils.PageData;
import com.mosidian.web.utils.SuperUtils;
import com.mosidian.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Objects;

@Controller
public class HomeController extends BaseController {

//    @Autowired
//    private UserService userService;
    @Autowired
    private RedisService redisService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

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


}
