package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component("notificationService")
public class NotificationService {

NotificationStrategy notificationStrategy;
	
	
	public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
		this.notificationStrategy = notificationStrategy;
	}


	public void notifyUser(String message) {
		notificationStrategy.send(message);
	}

}
