package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class NotificationService {
	
	@Autowired
	@Qualifier("whatsAppService")
	MessageService messageService;
	
	public void notifyuser(String msg) {
		messageService.send(msg);
	}

}
