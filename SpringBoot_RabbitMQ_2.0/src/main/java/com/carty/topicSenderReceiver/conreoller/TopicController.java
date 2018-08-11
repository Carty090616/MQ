package com.carty.topicSenderReceiver.conreoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carty.topicSenderReceiver.TopicSender;

@RestController
@RequestMapping("/rabbit")
public class TopicController {
	@Autowired
	private TopicSender topicSender;
	
	@RequestMapping("/topic")
	public void test(){
		topicSender.send();
	}

}
