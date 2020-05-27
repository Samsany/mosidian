/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.mosidian.com
 *
 * 版权所有，侵权必究！
 */

package io.mosidian.modules.app.annotation;

import java.lang.annotation.*;

/**
 * app登录效验
 *
 * @author Mark sunlightcs@gmail.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
}
