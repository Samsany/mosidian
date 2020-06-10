package io.mosidian.modules.pay.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.mosidian.modules.pay.entity.PayInfo;
import io.mosidian.modules.pay.mapper.PayInfoMapper;
import io.mosidian.modules.pay.service.IPayInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zsy
 * @since 2020-03-23
 */
@Service
public class PayInfoServiceImpl extends ServiceImpl<PayInfoMapper, PayInfo> implements IPayInfoService {

}
