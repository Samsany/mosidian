package io.mosidian.modules.mall.vo;

import lombok.Data;

import java.util.List;

/**
 * @Classname CategoryVo
 * @Date 2020/3/29 9:35
 * @Author ZSY
 */
@Data
public class CategoryVo {

    private Integer id;

    private Integer parentId;

    private String name;

    private Integer sortOrder;

    private List<CategoryVo> subCategories;

}
