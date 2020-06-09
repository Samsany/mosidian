package com.samphanie.mall.controller;

import com.github.pagehelper.PageInfo;
import com.samphanie.mall.consts.MallConst;
import com.samphanie.mall.entity.User;
import com.samphanie.mall.form.OrderCreateFrom;
import com.samphanie.mall.service.IOrderService;
import com.samphanie.mall.vo.OrderVo;
import com.samphanie.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @Classname OrderController
 * @Date 2020/4/8 15:17
 * @Author ZSY
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private IOrderService orderService;

    /**
     * 创建订单
     */
    @PostMapping("/orders")
    public ResponseVo<OrderVo> create(@Valid @RequestBody OrderCreateFrom from,
                                      HttpSession session) {

        User user = (User) session.getAttribute(MallConst.CURRENT_USER);

        return orderService.create(user.getId(), from.getShippingId());

    }

    /**
     * 订单列表
     */
    @GetMapping("/orders")
    public ResponseVo<PageInfo> list(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                     @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                                     HttpSession session) {

        User user = (User) session.getAttribute(MallConst.CURRENT_USER);

        return orderService.list(user.getId(), pageNum, pageSize);
    }

    /**
     * 订单详情
     */
    @GetMapping("/orders/{orderNo}")
    public ResponseVo<OrderVo> detail(@PathVariable Long orderNo,
                                     HttpSession session) {

        User user = (User) session.getAttribute(MallConst.CURRENT_USER);

        return orderService.detail(user.getId(), orderNo);
    }


    /**
     * 取消订单
     */
    @PutMapping("/orders/{orderNo}")
    public ResponseVo cancel(@PathVariable Long orderNo,
                                      HttpSession session) {

        User user = (User) session.getAttribute(MallConst.CURRENT_USER);

        return orderService.cancel(user.getId(), orderNo);
    }

}
