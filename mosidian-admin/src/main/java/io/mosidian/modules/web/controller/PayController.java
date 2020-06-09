package io.mosidian.modules.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @Author ZSY
 * @createTime 2020/6/8 17:54
 */
@Controller
@RequestMapping("/pay")
public class PayController {

    @GetMapping("/create")
    public ModelAndView create(@RequestParam("userId") String userId,
                               @RequestParam(value = "orderId",required = false) String orderId,
                               @RequestParam("amount") BigDecimal amount,
                               @RequestParam("payType") String payType,
                               Map<String, Object> map) {



        return null;

    }

}
