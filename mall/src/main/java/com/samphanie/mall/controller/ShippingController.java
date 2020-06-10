package com.samphanie.mall.controller;

import com.samphanie.mall.consts.MallConst;
import com.samphanie.mall.entity.User;
import com.samphanie.mall.form.ShippingForm;
import com.samphanie.mall.service.IShippingService;
import com.samphanie.mall.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @Classname ShippingController
 * @Date 2020/4/7 12:47
 * @Author ZSY
 */
@RestController
public class ShippingController {

    @Autowired
    private IShippingService shippingService;

    @PostMapping("/shippings")
    public ResponseVo add(@Valid @RequestBody ShippingForm form,
                          HttpSession session) {

        User user = (User) session.getAttribute(MallConst.CURRENT_USER);
        return shippingService.add(user.getId(), form);

    }

    @DeleteMapping("/shippings/{shippingId}")
    public ResponseVo delete(@PathVariable Integer shippingId,
                          HttpSession session) {

        User user = (User) session.getAttribute(MallConst.CURRENT_USER);
        return shippingService.delete(user.getId(), shippingId);

    }

    @PutMapping("/shippings/{shippingId}")
    public ResponseVo update(@Valid @RequestBody ShippingForm form,
                             @PathVariable Integer shippingId,
                             HttpSession session) {

        User user = (User) session.getAttribute(MallConst.CURRENT_USER);
        return shippingService.update(user.getId(), shippingId,form);

    }

    @GetMapping("/shippings")
    public ResponseVo list(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                           @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                           HttpSession session) {

        User user = (User) session.getAttribute(MallConst.CURRENT_USER);
        return shippingService.list(user.getId(), pageNum, pageSize);

    }

}