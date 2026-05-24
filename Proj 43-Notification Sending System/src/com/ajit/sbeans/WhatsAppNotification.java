package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class WhatsAppNotification implements NotificationStrategy {

	@Override
	public void send(String message) {
		
		System.out.println("Notification sent successfully via whatsapp:");
		System.out.println(message);

	}

}
