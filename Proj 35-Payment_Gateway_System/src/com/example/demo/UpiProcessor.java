package com.example.demo;

import org.springframework.stereotype.Component;

@Component("upiProcessor")
public class UpiProcessor implements PaymentProcessor{
	
	public void processPayment(double amount) {
		System.out.println("Processing payment via UPI. Amount: "+amount);
	}
	
	

}
