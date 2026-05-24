package com.example.demo;

import org.springframework.stereotype.Component;

@Component("smsanotifier")
public class SmsNotifier implements Notifier {
	
	@Override
	public void sendNotification(String message) {
		System.out.println("message");
	}
	

}
