package io.mosidian.modules.mall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.mosidian.modules.mall.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {

    List<OrderItem> selectByOrderNo(@Param("orderNoSet") Set<Long> orderNoSet);
}
