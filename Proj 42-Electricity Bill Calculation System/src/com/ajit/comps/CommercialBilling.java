package com.ajit.comps;

import org.springframework.stereotype.Component;

@Component("commercialBilling")
public class CommercialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units) {
		
		return 8*units;
	}

}
