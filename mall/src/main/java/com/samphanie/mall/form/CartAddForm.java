package com.samphanie.mall.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 添加商品
 * @Classname CartForm
 * @Date 2020/3/30 16:20
 * @Author ZSY
 */
@Data
public class CartAddForm {

    @NotNull
    private Integer productId;

    private Boolean selected = true;


}
