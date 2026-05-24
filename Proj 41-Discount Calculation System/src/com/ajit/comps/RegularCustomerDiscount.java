package com.ajit.comps;

import org.springframework.stereotype.Component;

@Component("regularCustomerDiscount")
public class RegularCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {

		return amount*0.05;
	}

}
