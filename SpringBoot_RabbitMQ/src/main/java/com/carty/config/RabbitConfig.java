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

import com.carty.constant.ExchangeConstant;
import com.carty.constant.QueueConstant;
import com.carty.constant.RoutingKeyConstant;
import org.springframework.amqp.core.*;
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
public class RabbitConfig {

    // 声明exchange
    @Bean
    public Exchange cartyExchange() {
        return ExchangeBuilder.directExchange(ExchangeConstant.CARTY_EX).durable(true).build();
    }

    @Bean
    public Exchange orderExchange() {
        return ExchangeBuilder.directExchange(ExchangeConstant.ORDER_EX).durable(true).build();
    }

    // 声明队列
    @Bean
    public Queue cartyQueue() {
        return QueueBuilder.durable(QueueConstant.CARTY_QUEUE).build();
    }

    @Bean
    public Queue orderQueue() {
        return QueueBuilder.durable(QueueConstant.ORDER_QUEUE).build();
    }

    // 声明绑定
    @Bean
    public Binding cartyBinding() {
        return BindingBuilder
                .bind(cartyQueue()).to(cartyExchange())
                // 定义RoutingKey
                .with(RoutingKeyConstant.CARTY_ROUTINGKEY).noargs();
    }

    @Bean
    public Binding orderBinding() {
        return BindingBuilder
                .bind(orderQueue()).to(orderExchange())
                // 定义RoutingKey
                .with(RoutingKeyConstant.ORDER_ROUTINGKEY).noargs();
    }
}