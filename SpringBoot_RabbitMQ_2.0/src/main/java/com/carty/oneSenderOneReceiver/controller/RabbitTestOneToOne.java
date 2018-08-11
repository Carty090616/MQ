package com.carty.oneSenderOneReceiver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carty.oneSenderOneReceiver.HelloSender1;


@RestController
@RequestMapping("/rabbit")
public class RabbitTestOneToOne {
    
    @Autowired
    private HelloSender1 helloSender1;
    
    @PostMapping("/hello")
    public void hello() {
        helloSender1.send();
    }
}
