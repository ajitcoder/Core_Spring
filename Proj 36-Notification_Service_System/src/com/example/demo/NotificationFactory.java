package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("notificationFactory")
public class NotificationFactory {
	
	@Autowired
	Map<String, Notifier> map;
	
	public Notifier getNotifier(String type) {
		Notifier notifier = map.get(type);
		return notifier;
	}
	
	

}
