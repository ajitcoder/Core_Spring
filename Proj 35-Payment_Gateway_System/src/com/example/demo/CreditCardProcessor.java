package com.example.demo;

import org.springframework.stereotype.Component;

@Component("creditCardProcessor")
public class CreditCardProcessor implements PaymentProcessor {
	
	@Override
	public void processPayment(double amount) {
		
		System.out.println("Processing payment via Credit Card. Amount: "+amount);
		
	}
	
	
	

}
