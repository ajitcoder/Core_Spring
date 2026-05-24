package com.example.demo;

public class SmsService implements MessageService{
	
	
	public void send(String message) {
		
		System.out.println("SMS sent: "+message);
	}

}
