package com.carty.directSenderReceiver.conreoller;

import com.carty.directSenderReceiver.DirectSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class DirectController {
	@Autowired
	private DirectSender directSender;

	@RequestMapping("/direct")
	public void test(){
		directSender.send();
	}

}
