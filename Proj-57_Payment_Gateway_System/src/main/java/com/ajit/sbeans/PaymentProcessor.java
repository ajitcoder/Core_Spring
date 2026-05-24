package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {

	@Autowired
	@Qualifier("selectedPayment")
	IPayment iPayment;

	public void processPayment(String customer, double amount) {
		System.out.println("Customer Name: " + customer);
		iPayment.pay(amount);
	}

}
