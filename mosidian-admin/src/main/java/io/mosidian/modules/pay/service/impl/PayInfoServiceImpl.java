package com.samphanie.pay.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.samphanie.pay.entity.PayInfo;
import com.samphanie.pay.mapper.PayInfoMapper;
import com.samphanie.pay.service.IPayInfoService;
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
