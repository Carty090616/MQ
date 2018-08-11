/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: RocketmqEvent
 * Author:   Lifeifei
 * Date:     2018/8/10 10:37
 * Description: Event，方便Consumer使用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mq.rocketmq.config;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.common.message.MessageExt;
import org.springframework.context.ApplicationEvent;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * 〈Event，方便Consumer使用〉
 *
 * @author Lifeifei
 * @create 2018/8/10
 * @since 1.0.0
 */
public class RocketmqEvent extends ApplicationEvent {

    private static final long serialVersionUID = -4468405250074063206L;
    private DefaultMQPushConsumer consumer;
    private List<MessageExt> msgs;

    public RocketmqEvent(List<MessageExt> msgs, DefaultMQPushConsumer consumer) throws Exception {
        super(msgs);
        this.consumer = consumer;
        this.setMsgs(msgs);
    }

    public String getMsg(int idx) {
        try {
            return new String(getMsgs().get(idx).getBody(), "utf-8");
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public String getMsg(int idx,String code) {
        try {
            return new String(getMsgs().get(idx).getBody(), code);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public DefaultMQPushConsumer getConsumer() {
        return consumer;
    }

    public void setConsumer(DefaultMQPushConsumer consumer) {
        this.consumer = consumer;
    }

    public MessageExt getMessageExt(int idx) {
        return getMsgs().get(idx);
    }


    public String getTopic(int idx) {
        return getMsgs().get(idx).getTopic();
    }


    public String getTag(int idx) {
        return getMsgs().get(idx).getTags();
    }


    public byte[] getBody(int idx) {
        return getMsgs().get(idx).getBody();
    }


    public String getKeys(int idx) {
        return getMsgs().get(idx).getKeys();
    }

    public List<MessageExt> getMsgs() {
        return msgs;
    }

    public void setMsgs(List<MessageExt> msgs) {
        this.msgs = msgs;
    }
}