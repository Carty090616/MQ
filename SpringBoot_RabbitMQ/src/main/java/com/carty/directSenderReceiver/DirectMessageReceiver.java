package com.carty.directSenderReceiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "carty.test.queue")
public class DirectMessageReceiver {
	
	@RabbitHandler
    public void process(String msg) {
        System.out.println("DirectMessageReceiver  : " +msg);
    }
}
