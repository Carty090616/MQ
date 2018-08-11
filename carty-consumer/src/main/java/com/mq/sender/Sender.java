/**
 * Copyright (C), 2015-2018, 章鱼云商
 * FileName: sender
 * Author:   Lifeifei
 * Date:     2018/8/9 17:32
 * Description: 发送者
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 〈发送者〉
 *
 * @author Lifeifei
 * @create 2018/8/9
 * @since 1.0.0
 */
@RestController
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RequestMapping("/send")
    public String send() {
        String content="Date:"+new Date();
        rabbitTemplate.convertAndSend("hello",content);
        return content;
    }
}