package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);){
			PaymentFactory paymentFactory = ac.getBean(PaymentFactory.class);
			PaymentProcessor paymentProcessor = paymentFactory.getPaymentProcessor("creditCardProcessor");
			paymentProcessor.processPayment(5000.0);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
