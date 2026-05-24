package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);){
			NotificationFactory notificationFactory = ac.getBean(NotificationFactory.class);
			Notifier notifier = notificationFactory.getNotifier("emailNotifier");
			notifier.sendNotification("Sending Email Notification: Your order has been shipped!");
		}catch(Exception e) {
			e.printStackTrace();
		}


	}

}
