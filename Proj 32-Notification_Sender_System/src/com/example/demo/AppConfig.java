package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {
	@Bean(name="emailService")
	public MessageService getEmailServiceObj() {
		
		return new EmailService();
	}
	
	@Bean(name="smsService")
	public MessageService getSmsServiceObj() {
		
		return new SmsService();
	}
	
	@Bean(name="whatsAppService")
	public MessageService getWhatsAppServiceObj() {
		
		return new WhatsAppService();
	}
	
	@Bean(name="notification")
	public NotificationService getNotificationObj() {
		
		return new NotificationService();
	}
}


