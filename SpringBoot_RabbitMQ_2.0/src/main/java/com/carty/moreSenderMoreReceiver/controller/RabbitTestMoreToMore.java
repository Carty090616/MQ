package com.carty.moreSenderMoreReceiver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carty.moreSenderMoreReceiver.MoreSender1;
import com.carty.moreSenderMoreReceiver.MoreSender2;

@RestController
@RequestMapping("/rabbit")
public class RabbitTestMoreToMore {
    
    @Autowired
    private MoreSender1 sender1;
    
    @Autowired
    private MoreSender2 sender2;
    
    /**
     * 多生产者-多消费者
     */
    @PostMapping("/MoreToMany")
    public void oneToMany() {
        for(int i=0;i<10;i++){
        	sender1.send("hellomsg 1:"+i);
        	sender2.send("hellomsg 2:"+i);
        }
        
    }
}
