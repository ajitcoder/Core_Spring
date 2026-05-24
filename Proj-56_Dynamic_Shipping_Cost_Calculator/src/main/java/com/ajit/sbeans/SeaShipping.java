package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("seaShipping")
public class SeaShipping implements ShippingStrategy {

	@Value("${shipping.sea.base}")
	private int base;
	
	@Value("${shipping.sea.perKg}")
	private int perKg;

	@Override
	public double calculateCost(double weight) {
		
		return base+(perKg*weight);
	}

}
