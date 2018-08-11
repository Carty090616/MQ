package com.carty.moreSenderMoreReceiver;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 多发送者对多接受者--消息发送者1
 * @author Administrator
 *
 */
@Component
public class MoreSender1 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String msg) {
        String sendMsg = msg + new Date();
        System.out.println("Sender1 : " + sendMsg);
        this.rabbitTemplate.convertAndSend("hello", sendMsg);
    }

}
