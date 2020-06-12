package io.mosidian.modules.mall.controller;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;
import io.mosidian.modules.mall.enums.ResponseEnum;
import io.mosidian.modules.mall.exception.MallException;
import io.mosidian.modules.mall.service.IOrderService;
import io.mosidian.modules.mall.vo.OrderVo;
import io.mosidian.modules.mall.vo.ResponseVo;
import io.mosidian.modules.pay.service.IPayService;
import io.mosidian.modules.sys.controller.AbstractController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author ZSY
 * @createTime 2020/6/10 18:07
 */
@Controller
@RequestMapping("/mall")
@Slf4j
public class RechargeController extends AbstractController {

    @Autowired
    private IOrderService orderService;

    @Resource
    private IPayService iPayService;

    /**
     * 账户充值订单
     */
    @GetMapping("/recharge")
    public ModelAndView recharge(@RequestParam("recharge") String recharge,
                                 @RequestParam("userId") Integer userId,
                                 Map<String, Object> map) {

//        SysUserEntity userEntity = getUser();
//        Integer userId = Math.toIntExact(userEntity.getUserId());

        ResponseVo<OrderVo> responseVo = orderService.recharge(userId, recharge);

        if (responseVo.getCode() == 0) {

            OrderVo orderVo = responseVo.getData();
            PayResponse response = iPayService.create(String.valueOf(userId), String.valueOf(orderVo.getOrderNo()), orderVo.getPayment(), BestPayTypeEnum.ALIPAY_PC);
            map.put("body", response.getBody());
            return new ModelAndView("/pay/alipayPc", map);

        } else {
            throw new MallException(ResponseEnum.ERROR);
        }
    }

}
