package com.samphanie.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.samphanie.mall.entity.Cart;
import com.samphanie.mall.entity.Product;
import com.samphanie.mall.enums.ProductStatusEnum;
import com.samphanie.mall.enums.ResponseEnum;
import com.samphanie.mall.exception.MallException;
import com.samphanie.mall.mapper.ProductMapper;
import com.samphanie.mall.service.ICategoryService;
import com.samphanie.mall.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.mall.vo.ProductDetailVo;
import com.samphanie.mall.vo.ProductVo;
import com.samphanie.mall.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@Service
@Slf4j
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private ProductMapper productMapper;

    /**
     * 商品列表
     *
     * @param categoryId
     * @param pageNum
     * @param pageSize
     */
    @Override
    public ResponseVo<PageInfo> list(Integer categoryId, Integer pageNum, Integer pageSize) {
        Set<Integer> categoryIdSet = new HashSet<>();

        if (categoryId != null) {
            categoryService.findSubCategoryId(categoryId, categoryIdSet);
            categoryIdSet.add(categoryId);
        }

        PageHelper.startPage(pageNum, pageSize);
        List<Product> products = productMapper.selectByCategoryIdSet(categoryIdSet);
        List<ProductVo> productVos = products.stream()
                .map(e -> {
                    ProductVo productVo = new ProductVo();
                    BeanUtils.copyProperties(e, productVo);
                    return productVo;
                })
                .collect(Collectors.toList());

        PageInfo pageInfo = new PageInfo(products);
        pageInfo.setList(productVos);

        return ResponseVo.successByData(pageInfo);
    }

    /**
     * 商品详情
     * @param productId
     */
    @Override
    public ResponseVo<ProductDetailVo> detail(Integer productId) {
        Product product = productMapper.selectById(productId);

        if (product.getStatus().equals(ProductStatusEnum.OFF_SALE.getCode())
        || product.getStatus().equals(ProductStatusEnum.DELETE.getCode())) {
            throw new MallException(ResponseEnum.PRODUCT_OFF_SALE_OR_DELETE);
        }

        ProductDetailVo productDetailVo = new ProductDetailVo();
        BeanUtils.copyProperties(product, productDetailVo);
        return ResponseVo.successByData(productDetailVo);
    }

    @Override
    public List<Product> selectByProductMap(Map<Integer, Cart> productMap) {
        return productMapper.selectByProductMap(productMap);
    }
}
