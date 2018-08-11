/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: ExchangeEnum
 * Author:   Lifeifei
 * Date:     2018/8/10 14:43
 * Description: 定义exchange
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.constant;

/**
 * 〈定义exchange〉
 *
 * @author Lifeifei
 * @create 2018/8/10
 * @since 1.0.0
 */
public enum ExchangeEnum {
    CARTY_EX("carty.test.ex"),
    ORDER_EX("order.ex");

    private String val;

    ExchangeEnum(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}