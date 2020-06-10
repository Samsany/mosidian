package io.mosidian.modules.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.mosidian.modules.pay.entity.PayInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@Mapper
public interface PayInfoMapper extends BaseMapper<PayInfo> {

    PayInfo selectByOrderNo(Long orderId);

}
