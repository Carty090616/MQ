/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: RabbitConfig
 * Author:   Lifeifei
 * Date:     2018/8/10 14:55
 * Description: RabbitMQ配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.carty.config;

import com.carty.constant.ExchangeEnum;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈RabbitMQ配置类〉
 *
 * @author Lifeifei
 * @create 2018/8/10
 * @since 1.0.0
 */
@Configuration
@EnableRabbit
public class RabbitConfig {

    // 声明exchange
    @Bean
    public Exchange cartyExchange(){
        return ExchangeBuilder.directExchange(ExchangeEnum.CARTY_EX.val()).durable(true).build();
    }

    @Bean
    public Exchange orderExchange(){
        return ExchangeBuilder.directExchange(ExchangeEnum.ORDER_EX.name()).durable(true).build();
    }
}