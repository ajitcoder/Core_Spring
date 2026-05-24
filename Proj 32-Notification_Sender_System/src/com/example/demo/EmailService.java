package com.example.demo;

public class EmailService implements MessageService {
	
	@Override
	public void send(String message) {
		
		System.out.println("Email sent: "+message);
		
	}

}
