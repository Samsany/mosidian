package io.mosidian.modules.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import io.mosidian.modules.mall.entity.Cart;
import io.mosidian.modules.mall.entity.Product;
import io.mosidian.modules.mall.vo.ProductDetailVo;
import io.mosidian.modules.mall.vo.ResponseVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
public interface IProductService extends IService<Product> {

    /**
     * 商品列表
     */
    ResponseVo<PageInfo> list(Integer categoryId, Integer pageNum, Integer pageSize);

    /**
     * 商品详情
     */
    ResponseVo<ProductDetailVo> detail(Integer productId);

    List<Product> selectByProductMap(@Param("productMap") Map<Integer, Cart> productMap);

}
