package com.samphanie.mall.mapper;

import com.samphanie.mall.entity.Cart;
import com.samphanie.mall.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@Component
public interface ProductMapper extends BaseMapper<Product> {

    List<Product> selectByCategoryIdSet(@Param("categoryIdSet") Set<Integer> categoryIdSet);

    List<Product> selectByProductMap(@Param("productMap") Map<Integer, Cart> productMap);

//    Product selectByCategoryId(Integer categoryId);
}
