/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: HelloReceiver
 * Author:   Lifeifei
 * Date:     2018/8/9 17:32
 * Description: 接收人
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 〈接收人〉
 *
 * @author Lifeifei
 * @create 2018/8/9
 * @since 1.0.0
 */
@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver  : " + hello);
    }
}