package com.carty.senderReceiverOfBean;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.carty.senderReceiverOfBean.domain.User;

@Component
@RabbitListener(queues = "user")
public class ReceiverBean {

	@RabbitHandler
    public void process(User user) {
        System.out.println("user receive  : " + user.getName()+"/"+user.getPass());
    }
}
