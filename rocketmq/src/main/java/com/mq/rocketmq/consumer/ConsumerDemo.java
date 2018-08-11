/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: ConsumerDemo
 * Author:   Lifeifei
 * Date:     2018/8/10 10:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mq.rocketmq.consumer;

import com.mq.rocketmq.config.RocketmqEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author Lifeifei
 * @create 2018/8/10
 * @since 1.0.0
 */
@Component
public class ConsumerDemo {
    @EventListener(condition = "#event.msgs[0].topic=='TopicTest1' && #event.msgs[0].tags=='TagA'")
    public void rocketmqMsgListen(RocketmqEvent event) {
        //      DefaultMQPushConsumer consumer = event.getConsumer();
        try {
            System.out.println("com.guosen.client.controller.consumerDemo监听到一个消息达到：" + event.getMsgs().get(0).getMsgId());
            // TODO 进行业务处理
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}