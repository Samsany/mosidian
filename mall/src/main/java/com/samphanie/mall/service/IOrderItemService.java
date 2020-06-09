package com.samphanie.mall.service;

import com.samphanie.mall.entity.OrderItem;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
public interface IOrderItemService extends IService<OrderItem> {

    List<OrderItem> selectByOrderNo(Set<Long> orderNoSet);
}
