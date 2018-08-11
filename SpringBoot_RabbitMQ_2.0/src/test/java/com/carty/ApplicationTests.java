package com.carty;

import com.carty.fanoutSenderReceiver.FanoutSender;
import com.carty.senderReceiverOfBean.SenderBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private FanoutSender fanoutSender;

	@Test
	public void contextLoads() {
		for (int a = 0 ; a < 100000 ; a++) {
			for (int i = 0 ; i < 100000 ; i++) {
				fanoutSender.send();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int j = 0 ; j < 100000 ; j++) {
				fanoutSender.send();
			}

		}
	}

}
