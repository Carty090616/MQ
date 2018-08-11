package com.carty.fanoutSenderReceiver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carty.fanoutSenderReceiver.FanoutSender;

@RestController
@RequestMapping("rabbit")
public class FanoutController {
	
	@Autowired
	private FanoutSender fanoutSender;
	 /**
     * fanout exchange类型rabbitmq测试
     */
    @PostMapping("/fanoutTest")
    public void fanoutTest() {
    	fanoutSender.send();
    }
}
