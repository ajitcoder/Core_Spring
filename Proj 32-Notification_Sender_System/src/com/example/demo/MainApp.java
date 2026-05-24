package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			NotificationService notification = ctx.getBean("notification",NotificationService.class);
			notification.notifyuser("Meeting at 4 PM");
		}catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
