package io.mosidian.modules.pay.controller;

import com.lly835.bestpay.enums.BestPayPlatformEnum;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;
import io.mosidian.modules.pay.service.IPayService;
import io.mosidian.modules.pay.utils.KeyUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @Classname PayController
 * @Description 支付Controller
 * @Date 2020/3/21 15:12
 * @Author ZSY
 */
@Slf4j
@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private IPayService iPayService;

    @GetMapping("/create")
    public ModelAndView create(@RequestParam("userId") String userId,
                               @RequestParam(value = "orderId",required = false) String orderId,
                               @RequestParam("amount") BigDecimal amount,
                               @RequestParam("payType") BestPayTypeEnum bestPayTypeEnum,
                               Map<String, Object> map) {

        if (orderId == null || "".equals(orderId)) {
            orderId = KeyUtil.genUniqueKey();
        }
        PayResponse response = iPayService.create(userId, orderId, amount, bestPayTypeEnum);

        // 支付方式不同，渲染方式不同
        if (bestPayTypeEnum == BestPayTypeEnum.ALIPAY_PC) {
            map.put("body", response.getBody());
            return new ModelAndView("/pay/alipayPc", map);
        } else if (bestPayTypeEnum == BestPayTypeEnum.WXPAY_NATIVE) {
            map.put("codeUrl", "www.mosidian.com");
            return new ModelAndView("/pay/qrpayV1", map);
        }

        throw new RuntimeException("暂不支持的类型！");
    }

    /**
     * 异步回调
     */
    @PostMapping("/notify")
    public ModelAndView notify(@RequestBody String notifyData) {
        // 修改订单支付状态---支付中

        log.info("【异步通知】支付平台的数据request={}", notifyData);
        PayResponse response = iPayService.notify(notifyData);

        // 提示支付宝或微信支付完成
        if (response.getPayPlatformEnum() == BestPayPlatformEnum.WX) {
            return new ModelAndView("pay/responeSuccessForWx");
        } else if (response.getPayPlatformEnum() == BestPayPlatformEnum.ALIPAY) {
            return new ModelAndView("pay/responeSuccessForAlipay");
        }

        throw new RuntimeException("错误的支付平台");

    }


}
