package com.example.demo;

public class WhatsAppService implements MessageService {

	
	public void send(String message) {
		
		System.out.println("WhatsApp sent: "+message);
		
	}
}
