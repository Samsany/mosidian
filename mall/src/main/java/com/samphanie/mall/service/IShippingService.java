package com.samphanie.mall.service;

import com.github.pagehelper.PageInfo;
import com.samphanie.mall.entity.Shipping;
import com.baomidou.mybatisplus.extension.service.IService;
import com.samphanie.mall.form.ShippingForm;
import com.samphanie.mall.vo.ResponseVo;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
public interface IShippingService extends IService<Shipping> {

    /**
     * 添加收货地址
     */
    ResponseVo<Map<String, Integer>> add(Integer uid, ShippingForm form);

    /**
     * 删除收货地址
     */
    ResponseVo<Map<String, Integer>> delete(Integer uid, Integer shippingId);

    /**
     * 更新收货地址
     */
    ResponseVo<Map<String, Integer>> update(Integer uid, Integer shippingId, ShippingForm form);

    /**
     * 收货地址列表
     */
    ResponseVo<PageInfo> list(Integer uid,Integer pageNum, Integer pageSize);

}
