package com.samphanie.pay.enums;

import com.lly835.bestpay.enums.BestPayPlatformEnum;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import lombok.Getter;

/**
 * @Classname PayPlatform
 * @Description 支付平台
 * @Date 2020/3/23 16:04
 * @Author ZSY
 */
@Getter
public enum PayPlatformEnum {

    // 1-支付宝  2-微信
    ALIPAY(1),
    WX(2),
    ;

    private Integer code;

    PayPlatformEnum(Integer code) {
        this.code = code;
    }

    public static PayPlatformEnum getByBestPayTypeEnum(BestPayTypeEnum bestPayTypeEnum) {

//        if (bestPayTypeEnum.getPlatform().name().equals(PayPlatformEnum.ALIPAY.name())) {
//            return PayPlatformEnum.ALIPAY;
//        } else if (bestPayTypeEnum.getPlatform().name().equals(PayPlatformEnum.WX.name())){
//            return PayPlatformEnum.WX;
//        }
        for (PayPlatformEnum payPlatformEnum : PayPlatformEnum.values()) {
            if ((bestPayTypeEnum.getPlatform().name().equals(PayPlatformEnum.ALIPAY.name()))) {
                return payPlatformEnum;
            }
        }

        throw new RuntimeException("错误的支付平台");
    }

    public static BestPayPlatformEnum getByBestPayPlatformEnum(BestPayTypeEnum bestPayTypeEnum) {
        for (BestPayPlatformEnum platformEnum : BestPayPlatformEnum.values()) {
            if ( platformEnum.equals(bestPayTypeEnum.getPlatform()) ) {
                return platformEnum;
            }
        }

        throw new RuntimeException("错误的支付平台");


    }

}
