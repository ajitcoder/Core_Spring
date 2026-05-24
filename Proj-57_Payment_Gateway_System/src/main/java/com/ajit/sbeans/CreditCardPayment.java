package com.ajit.sbeans;

public class CreditCardPayment implements IPayment {

	@Override
	public void pay(double amount) {
		
	System.out.println("Payment done via CreditCard and  amount: "+amount);	
	}

}
