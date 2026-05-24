package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPayment implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("Payment done via UPI amount: "+amount);
		
	}

}
