package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component("emailNotification")
public class EmailNotification implements NotificationStrategy {

	@Override
	public void send(String message) {
		System.out.println("Notification sent successfully via email:");
		System.out.println(message);	
	}

}
