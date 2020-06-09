package com.samphanie.mall.service;

import com.github.pagehelper.PageInfo;
import com.samphanie.mall.entity.Cart;
import com.samphanie.mall.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.mall.vo.ProductDetailVo;
import com.samphanie.mall.vo.ResponseVo;
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
