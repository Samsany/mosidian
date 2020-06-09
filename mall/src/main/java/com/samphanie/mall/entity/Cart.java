package com.samphanie.mall.entity;

import lombok.Data;

/**
 * @Classname Cart
 * @Date 2020/3/30 17:47
 * @Author ZSY
 */
@Data
public class Cart {

    private Integer productId;

    /**
     * 购买数量
     */
    private Integer quantity;

    /**
     * 商品是否选中
     */
    private Boolean productSelected;

    public Cart(Integer productId, Integer quantity, Boolean productSelected) {
        this.productId = productId;
        this.quantity = quantity;
        this.productSelected = productSelected;
    }
}
