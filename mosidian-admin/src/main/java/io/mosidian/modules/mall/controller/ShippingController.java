package io.mosidian.modules.mall.controller;

import io.mosidian.modules.mall.form.ShippingForm;
import io.mosidian.modules.mall.service.IShippingService;
import io.mosidian.modules.mall.vo.ResponseVo;
import io.mosidian.modules.sys.controller.AbstractController;
import io.mosidian.modules.sys.entity.SysUserEntity;
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
@RequestMapping("/mall")
public class ShippingController extends AbstractController {

    @Autowired
    private IShippingService shippingService;

    @PostMapping("/shippings")
    public ResponseVo add(@Valid @RequestBody ShippingForm form,
                          HttpSession session) {

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());
        return shippingService.add(userId, form);

    }

    @DeleteMapping("/shippings/{shippingId}")
    public ResponseVo delete(@PathVariable Integer shippingId,
                          HttpSession session) {

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());
        return shippingService.delete(userId, shippingId);

    }

    @PutMapping("/shippings/{shippingId}")
    public ResponseVo update(@Valid @RequestBody ShippingForm form,
                             @PathVariable Integer shippingId,
                             HttpSession session) {

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());
        return shippingService.update(userId, shippingId,form);

    }

    @GetMapping("/shippings")
    public ResponseVo list(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                           @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                           HttpSession session) {

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());
        return shippingService.list(userId, pageNum, pageSize);

    }

}
