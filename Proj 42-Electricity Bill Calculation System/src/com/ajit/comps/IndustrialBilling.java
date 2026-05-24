package com.ajit.comps;

import org.springframework.stereotype.Component;

@Component("industrialBilling")
public class IndustrialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units) {
		
		return units*10;
	}

}
