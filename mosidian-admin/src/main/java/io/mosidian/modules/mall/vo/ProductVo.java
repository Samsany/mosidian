package io.mosidian.modules.mall.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Classname ProductVo
 * @Date 2020/3/29 13:51
 * @Author ZSY
 */
@Data
public class ProductVo {

    private Integer id;

    private Integer categoryId;

    private String name;

    private String subtitle;

    private String mainImage;

    private BigDecimal price;

    private Integer status;
}
