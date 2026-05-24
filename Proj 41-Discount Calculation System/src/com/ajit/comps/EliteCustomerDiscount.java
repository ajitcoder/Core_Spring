package com.ajit.comps;

import org.springframework.stereotype.Component;

@Component("eliteCustomerDiscount")
public class EliteCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		
		return (amount*15)/100;
	}

}
