package io.mosidian.modules.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.mosidian.modules.mall.entity.OrderItem;

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
