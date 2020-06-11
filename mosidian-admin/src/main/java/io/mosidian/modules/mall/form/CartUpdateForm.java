package io.mosidian.modules.mall.form;

import lombok.Data;

/**
 * 添加商品
 * @Classname CartForm
 * @Date 2020/3/30 16:20
 * @Author ZSY
 */
@Data
public class CartUpdateForm {

    private Integer quantity;

    private Boolean selected;

}
