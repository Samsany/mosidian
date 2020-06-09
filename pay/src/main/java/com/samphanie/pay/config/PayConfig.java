package com.samphanie.pay.config;

import com.lly835.bestpay.config.AliPayConfig;
import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname PayConfig
 * @Description 支付配置
 * @Date 2020/3/21 15:44
 * @Author ZSY
 */
@Configuration
public class PayConfig {

    @Autowired
    private AliPayAccountConfig aliPayAccountConfig;

    @Autowired
    private WechatPayAccountConfig wechatPayAccountConfig;

    @Bean
    public WxPayConfig wxPayConfig() {
        WxPayConfig wxPayConfig = new WxPayConfig();
        wxPayConfig.setAppId(wechatPayAccountConfig.getMpAppId());
        wxPayConfig.setMiniAppId(wechatPayAccountConfig.getMiniAppId());
        wxPayConfig.setMchId(wechatPayAccountConfig.getMchId());
        wxPayConfig.setMchKey(wechatPayAccountConfig.getMchKey());
        wxPayConfig.setKeyPath(wechatPayAccountConfig.getKeyPath());
        wxPayConfig.setNotifyUrl(wechatPayAccountConfig.getNotifyUrl());
        wxPayConfig.setAppAppId(wechatPayAccountConfig.getAppAppId());
        return wxPayConfig;
    }

    @Bean
    public AliPayConfig aliPayConfig() {
        AliPayConfig aliPayConfig = new AliPayConfig();
        aliPayConfig.setNotifyUrl(aliPayAccountConfig.getNotifyUrl());
        aliPayConfig.setAppId(aliPayAccountConfig.getAppId());
        aliPayConfig.setPrivateKey(aliPayAccountConfig.getPrivateKey());
        aliPayConfig.setAliPayPublicKey(aliPayAccountConfig.getAliPayPublicKey());
        aliPayConfig.setSandbox(aliPayAccountConfig.getSandbox());
        aliPayConfig.setReturnUrl(aliPayAccountConfig.getReturnUrl());
        return aliPayConfig;
    }

    @Bean
    public BestPayServiceImpl bestPayService(AliPayConfig aliPayConfig, WxPayConfig wxPayConfig) {

        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setAliPayConfig(aliPayConfig);
        bestPayService.setWxPayConfig(wxPayConfig);

        return bestPayService;

    }


}
