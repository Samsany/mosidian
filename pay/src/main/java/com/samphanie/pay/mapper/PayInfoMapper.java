package com.samphanie.pay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.samphanie.pay.entity.PayInfo;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@Component
public interface PayInfoMapper extends BaseMapper<PayInfo> {

    PayInfo selectByOrderNo(Long orderId);
}
