/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: RabbitConfig
 * Author:   Lifeifei
 * Date:     2018/8/9 17:29
 * Description: 配置队列
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈配置队列〉
 *
 * @author Lifeifei
 * @create 2018/8/9
 * @since 1.0.0
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }

}