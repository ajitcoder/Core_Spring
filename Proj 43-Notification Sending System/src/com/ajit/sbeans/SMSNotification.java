package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component("sMSNotification")
public class SMSNotification implements NotificationStrategy {

	@Override
	public void send(String message) {
		
		System.out.println("Notification sent successfully via sms:");
		System.out.println(message);
	}

}
