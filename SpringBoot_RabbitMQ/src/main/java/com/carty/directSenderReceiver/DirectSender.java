package com.carty.directSenderReceiver;

import com.carty.constant.ExchangeConstant;
import com.carty.constant.RoutingKeyConstant;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DirectSender {
	@Autowired
    private AmqpTemplate rabbitTemplate;

	public void send() {
        String msg = "I am direct.mesaages msg########";
        System.out.println("sender2 : " + msg);
        this.rabbitTemplate.convertAndSend(ExchangeConstant.CARTY_EX, RoutingKeyConstant.CARTY_ROUTINGKEY, msg);
    }

}
