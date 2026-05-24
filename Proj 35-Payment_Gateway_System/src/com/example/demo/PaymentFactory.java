package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("paymentFactory")
public class PaymentFactory {
	
	@Autowired
	Map<String, PaymentProcessor> map;
	public PaymentProcessor getPaymentProcessor(String method) {
		
		PaymentProcessor paymentProcessor = map.get(method);
		
		return paymentProcessor;
		
	}
	
	

}
