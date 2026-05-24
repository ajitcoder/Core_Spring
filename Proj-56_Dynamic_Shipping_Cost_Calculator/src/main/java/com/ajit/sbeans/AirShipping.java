package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("airShipping")
public class AirShipping implements ShippingStrategy {

	@Value("${shipping.air.base}")
	private int base;
	
	@Value("${shipping.air.perKg}")
	private int perKg;

	@Override
	public double calculateCost(double weight) {
		
		return base+(perKg*weight);
	}

}
