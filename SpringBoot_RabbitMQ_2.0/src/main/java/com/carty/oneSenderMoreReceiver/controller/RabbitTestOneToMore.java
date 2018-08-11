package com.carty.oneSenderMoreReceiver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carty.oneSenderMoreReceiver.Sender;

@RestController
@RequestMapping("/rabbit")
public class RabbitTestOneToMore {
    
    @Autowired
    private Sender helloSender;
    
    /**
     * 单生产者-多消费者
     */
    @PostMapping("/oneToMany")
    public void oneToMany() {
        for(int i=0;i<10;i++){
            helloSender.send("hellomsg:"+i);
        }
        
    }
}
