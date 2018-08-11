/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: BandingEnum
 * Author:   Lifeifei
 * Date:     2018/8/10 14:54
 * Description: 定义binding
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.constant;

/**
 * 〈定义binding〉
 *
 * @author Lifeifei
 * @create 2018/8/10
 * @since 1.0.0
 */
public enum BandingEnum {
    CARTY_BINDING("carty.test.binding"),
    ORDER_BINDING("order.binding");

    private String val;

    BandingEnum(String val) {
        this.val = val;
    }

}