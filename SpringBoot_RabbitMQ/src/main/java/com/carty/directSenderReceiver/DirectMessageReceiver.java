package com.carty.directSenderReceiver;

import com.carty.directSenderReceiver.model.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * <测试direct类型的exchange>
 *
 * @return
 * @author Lifeifei
 * @date 2018/8/13 17:06
 */
@Component
@RabbitListener(queues = "carty.test.queue")
public class DirectMessageReceiver {
	
    /**
     * <处理String类型的消息>
     *
     * @param msg
     * @return void
     * @author Lifeifei
     * @date 2018/8/13 17:06
     */
	@RabbitHandler
    public void processes(@Payload String msg) {
        System.out.println("DirectMessageReceiver  : " +msg);
    }

    /**
     * <处理User类型的消息>
     *
     * @param user
     * @return void
     * @author Lifeifei
     * @date 2018/8/13 17:06 
     */
    @RabbitHandler
    public void onErrors(@Payload User user) {
        System.out.println("处理User类型的消息: " + user.getName());
    }
}
