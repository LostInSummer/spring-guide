package com.lostinsummer.spring.messaging.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	// , containerFactory = "myFactory"
	@JmsListener(destination = "mailbox")
	public void receiveMessage(Email email) {
		System.out.println("Received <" + email + ">");
	}
	
	@JmsListener(destination = "text-jms")
	public void testMessage(Email email) {
		System.out.println("Received <" + email + ">");
	}

}
