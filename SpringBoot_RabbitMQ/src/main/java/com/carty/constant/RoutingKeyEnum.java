/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: RoutingKeyEnum
 * Author:   Lifeifei
 * Date:     2018/8/10 14:52
 * Description: 定义routingKey
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.constant;

/**
 * 〈定义routingKey〉
 *
 * @author Lifeifei
 * @create 2018/8/10
 * @since 1.0.0
 */
public enum RoutingKeyEnum {
    CARTY_ROUTINGKEY("carty.test.routingkey"),
    ORDER_ROUTINGKEY("order.routingkey");

    private String val;

    RoutingKeyEnum(String val) {
        this.val = val;
    }

    public String val(){return this.val;}
}