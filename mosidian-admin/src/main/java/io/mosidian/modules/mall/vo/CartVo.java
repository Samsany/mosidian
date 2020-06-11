package io.mosidian.modules.mall.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Classname CartVo
 * @Date 2020/3/30 15:52
 * @Author ZSY
 */
@Data
public class CartVo {

    List<CartProductVo> cartProductVoList;

    private Boolean selectedAll;

    private BigDecimal cartTotalPrice;

    private Integer cartTotalQuantity;

}
