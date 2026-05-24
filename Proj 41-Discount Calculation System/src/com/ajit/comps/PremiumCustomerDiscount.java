package com.ajit.comps;

import org.springframework.stereotype.Component;

@Component("premiumCustomerDiscount")
public class PremiumCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		
		return amount*0.1;
	}

}
