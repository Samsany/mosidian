package io.mosidian.modules.pay.controller;

import com.lly835.bestpay.enums.BestPayPlatformEnum;
import com.lly835.bestpay.model.OrderQueryRequest;
import com.lly835.bestpay.model.OrderQueryResponse;
import com.lly835.bestpay.service.BestPayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Classname QueryController
 * @Description 查询订单
 * @Date 2020/3/24 16:43
 * @Author ZSY
 */
@Controller
@Slf4j
@RequestMapping("/query")
public class QueryController {

    @Autowired
    private BestPayService bestPayService;

    @GetMapping("/payOrder")
    public OrderQueryResponse payOrder(@RequestParam(required = false) String orderId,
                                       @RequestParam(required = false) String outOrderId,
                                       @RequestParam BestPayPlatformEnum platformEnum) {
        OrderQueryRequest request = new OrderQueryRequest();
        request.setPlatformEnum(platformEnum);
        request.setOrderId(orderId);
        request.setOutOrderId(outOrderId);
        return bestPayService.query(request);
    }


}
