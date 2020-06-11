package io.mosidian.modules.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.mosidian.modules.mall.entity.OrderItem;
import io.mosidian.modules.mall.mapper.OrderItemMapper;
import io.mosidian.modules.mall.service.IOrderItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    @Resource
    private OrderItemMapper orderItemMapper;

    @Override
    public List<OrderItem> selectByOrderNo(Set<Long> orderNoSet) {
        return orderItemMapper.selectByOrderNo(orderNoSet);
    }
}
