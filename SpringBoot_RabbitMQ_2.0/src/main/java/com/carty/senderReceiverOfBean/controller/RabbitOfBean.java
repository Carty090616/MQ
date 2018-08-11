package com.carty.senderReceiverOfBean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carty.senderReceiverOfBean.SenderBean;

@RestController
@RequestMapping("/rabbit")
public class RabbitOfBean {

	@Autowired
	private SenderBean senderBean;
	
	@RequestMapping("/sendBean")
	public void test(){
		senderBean.send();
	}

}
