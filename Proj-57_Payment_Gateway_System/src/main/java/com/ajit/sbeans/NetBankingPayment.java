package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component("nbPay")
public class NetBankingPayment implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("Payment done via NetBanking and  amount is : "+amount);
		
		
	}

}
