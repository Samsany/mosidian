package io.mosidian.modules.mall.controller;

import com.github.pagehelper.PageInfo;
import io.mosidian.modules.mall.form.OrderCreateFrom;
import io.mosidian.modules.mall.service.IOrderService;
import io.mosidian.modules.mall.vo.OrderVo;
import io.mosidian.modules.mall.vo.ResponseVo;
import io.mosidian.modules.sys.controller.AbstractController;
import io.mosidian.modules.sys.entity.SysUserEntity;
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
@RequestMapping("/mall")
public class OrderController extends AbstractController {

    @Autowired
    private IOrderService orderService;

    /**
     * 创建订单
     */
    @PostMapping("/orders")
    public ResponseVo<OrderVo> create(@Valid @RequestBody OrderCreateFrom from,
                                      HttpSession session) {

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());

        return orderService.create(userId, from.getShippingId());

    }

    /**
     * 订单列表
     */
    @GetMapping("/orders")
    public ResponseVo<PageInfo> list(@RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                     @RequestParam(required = false, defaultValue = "10") Integer pageSize,
                                     HttpSession session) {

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());

        return orderService.list(userId, pageNum, pageSize);
    }

    /**
     * 订单详情
     */
    @GetMapping("/orders/{orderNo}")
    public ResponseVo<OrderVo> detail(@PathVariable Long orderNo,
                                     HttpSession session) {

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());

        return orderService.detail(userId, orderNo);
    }


    /**
     * 取消订单
     */
    @PutMapping("/orders/{orderNo}")
    public ResponseVo cancel(@PathVariable Long orderNo,
                                      HttpSession session) {

        SysUserEntity userEntity = getUser();
        Integer userId = Math.toIntExact(userEntity.getUserId());

        return orderService.cancel(userId, orderNo);
    }

}
