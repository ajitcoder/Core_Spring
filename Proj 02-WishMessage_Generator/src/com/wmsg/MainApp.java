package com.wmsg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wmsg/applicatioCotext.xml");
				
		WishMessageGenerator generator = context.getBean(WishMessageGenerator.class);
		
		String message = generator.generateWishMessage();
		System.out.println(message);
		
		((ClassPathXmlApplicationContext) context).close();
		
	}

}
