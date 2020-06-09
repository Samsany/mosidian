package com.samphanie.mall.mapper;

import com.samphanie.mall.entity.OrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@Component
public interface OrderItemMapper extends BaseMapper<OrderItem> {

    List<OrderItem> selectByOrderNo(@Param("orderNoSet") Set<Long> orderNoSet);
}
