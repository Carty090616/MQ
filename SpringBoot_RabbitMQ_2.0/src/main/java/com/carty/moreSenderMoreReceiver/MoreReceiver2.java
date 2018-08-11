package com.carty.moreSenderMoreReceiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 一个发送者对多个接受者--消息接受者2
 * @author Administrator
 *
 */
@Component
@RabbitListener(queues = "hello")
public class MoreReceiver2 {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver2  : " + hello);
    }

}
