package io.mosidian.modules.mall.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Classname ProductDetailVo
 * @Date 2020/3/29 15:37
 * @Author ZSY
 */
@Data
public class ProductDetailVo {

    private Integer id;

    private Integer categoryId;

    private String name;

    private String subtitle;

    private String mainImage;

    private String subImages;

    private String detail;

    private BigDecimal price;

    private Integer stock;

    private Integer status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
