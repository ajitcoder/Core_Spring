package com.example.demo;

import org.springframework.stereotype.Component;

@Component("emailNotifier")
public class EmailNotifier implements Notifier {
	
	public void sendNotification(String message) {
		System.out.println("message");
	}

}
