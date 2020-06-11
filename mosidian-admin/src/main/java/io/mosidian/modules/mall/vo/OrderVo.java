package io.mosidian.modules.mall.vo;

import io.mosidian.modules.mall.entity.Shipping;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Classname OrderVo
 * @Date 2020/4/7 14:40
 * @Author ZSY
 */
@Data
public class OrderVo {

    private Long orderNo;

    private BigDecimal payment;

    private Integer paymentType;

    private Integer postage;

    private Integer status;

    private LocalDateTime paymentTime;

    private LocalDateTime sendTime;

    private LocalDateTime endTime;

    private LocalDateTime closeTime;

    private LocalDateTime createTime;

    private List<OrderItemVo> orderItemVoList;

    private Integer shippingId;

    private Shipping shippingVo;


}
