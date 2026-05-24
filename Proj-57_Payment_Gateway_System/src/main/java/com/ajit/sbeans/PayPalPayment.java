package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component("pPay")
public class PayPalPayment implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("Payment done via PayPal  amount: "+amount);
		
		
	}

}
