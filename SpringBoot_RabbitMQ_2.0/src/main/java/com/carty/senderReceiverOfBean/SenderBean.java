package com.carty.senderReceiverOfBean;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carty.senderReceiverOfBean.domain.User;

@Component
public class SenderBean {
	@Autowired
    private AmqpTemplate rabbitTemplate;
	
	public void send() {
        User user=new User();
        user.setName("hzb");
        user.setPass("123456789");
        System.out.println("user send : " + user.getName()+"/"+user.getPass());
        this.rabbitTemplate.convertAndSend("user", user);
    }
}
