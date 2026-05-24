package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainApp {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class)){
			
			PaymentProcessor paymentProcessor = ctx.getBean(PaymentProcessor.class);
			paymentProcessor.processPayment(3000);
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
