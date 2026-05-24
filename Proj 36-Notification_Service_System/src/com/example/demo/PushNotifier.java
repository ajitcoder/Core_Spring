package com.example.demo;

import org.springframework.stereotype.Component;

@Component("pushotifier")
public class PushNotifier implements Notifier {
	
	@Override
	public void sendNotification(String message) {
		System.out.println("message");
	}

}
