package com.samphanie.pay.utils;

import java.util.Random;

/**
 * @Classname KeyUtil
 * @Description 生成唯一的主键
 * @Date 2020/3/23 14:17
 * @Author ZSY
 */
public class KeyUtil {

    /***
     * @Description: genUniqueKey
     * 生成唯一的主键
     * 格式：时间+随机数
     * @param: []
     * @return: java.lang.String
     * @date: 2020/3/23 14:18
     **/
    public static synchronized String genUniqueKey() {

        Random random = new Random();

        Integer num = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(num);

    }

}
