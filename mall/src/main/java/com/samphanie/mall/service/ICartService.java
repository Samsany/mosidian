package com.samphanie.mall.service;

import com.samphanie.mall.entity.Cart;
import com.samphanie.mall.form.CartAddForm;
import com.samphanie.mall.form.CartUpdateForm;
import com.samphanie.mall.vo.CartVo;
import com.samphanie.mall.vo.ResponseVo;

import java.util.List;

/**
 * @Classname ICartService
 * @Date 2020/3/30 17:12
 * @Author ZSY
 */
public interface ICartService {

    /**
     * 购物车添加商品
     */
    ResponseVo<CartVo> add(Integer uid, CartAddForm cartAddForm);

    /**
     * 购物车列表
     */
    ResponseVo<CartVo> list(Integer uid);

    /**
     * 更新购物车
     */
    ResponseVo<CartVo> update(Integer uid, Integer productId, CartUpdateForm form);

    /**
     * 删除商品
     */
    ResponseVo<CartVo> delete(Integer uid, Integer productId);

    /**
     * 全选
     */
    ResponseVo<CartVo> selectAll(Integer uid);
    /**
     * 全不选
     */
    ResponseVo<CartVo> unSelectAll(Integer uid);

    /**
     * 购物车商品总和
     */
    ResponseVo<Integer> sum(Integer uid);

    List<Cart> listForCart(Integer uid);


}
