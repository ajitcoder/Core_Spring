package com.ajit.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.config.AppConfig;
import com.ajit.sbeans.EmailNotification;
import com.ajit.sbeans.NotificationService;
import com.ajit.sbeans.SMSNotification;
import com.ajit.sbeans.WhatsAppNotification;

public class NotificationApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter notification type (email/sms/whatsapp): ");
		String notificationType=sc.nextLine();
		System.out.print("Enter message: ");
		String message=sc.nextLine();
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		NotificationService notificationService = ac.getBean(NotificationService.class);
		if(notificationType.equalsIgnoreCase("email"))
		{
			EmailNotification emailNotification = ac.getBean(EmailNotification.class);
			notificationService.setNotificationStrategy(emailNotification);
			notificationService.notifyUser(message);
		}
		else if(notificationType.equalsIgnoreCase("sms")) {
			SMSNotification smsNotification = ac.getBean(SMSNotification.class);
			notificationService.setNotificationStrategy(smsNotification);
			notificationService.notifyUser(message);
		}
		else if(notificationType.equalsIgnoreCase("whatsapp")) {
			WhatsAppNotification whatsAppNotification = ac.getBean(WhatsAppNotification.class);
			notificationService.setNotificationStrategy(whatsAppNotification);
			notificationService.notifyUser(message);
		}
		else {
			throw new IllegalArgumentException("Invalid input");
		}
		
	}

}
