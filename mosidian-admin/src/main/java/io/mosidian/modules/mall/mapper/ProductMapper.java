package io.mosidian.modules.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.mosidian.modules.mall.entity.Cart;
import io.mosidian.modules.mall.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

    List<Product> selectByCategoryIdSet(@Param("categoryIdSet") Set<Integer> categoryIdSet);

    List<Product> selectByProductMap(@Param("productMap") Map<Integer, Cart> productMap);

//    Product selectByCategoryId(Integer categoryId);
}
