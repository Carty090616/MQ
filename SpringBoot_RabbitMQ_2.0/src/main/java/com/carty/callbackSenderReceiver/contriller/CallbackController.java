package com.carty.callbackSenderReceiver.contriller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carty.callbackSenderReceiver.CallBackSender;

@RestController
@RequestMapping("/rabbit")
public class CallbackController {
	@Autowired
	private CallBackSender callBackSender;

	@PostMapping("/callback")
    public void callbak() {
        callBackSender.send();
    }
}
