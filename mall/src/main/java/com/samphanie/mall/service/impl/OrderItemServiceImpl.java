package com.samphanie.mall.service.impl;

import com.samphanie.mall.entity.OrderItem;
import com.samphanie.mall.mapper.OrderItemMapper;
import com.samphanie.mall.service.IOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Override
    public List<OrderItem> selectByOrderNo(Set<Long> orderNoSet) {
        return orderItemMapper.selectByOrderNo(orderNoSet);
    }
}
