package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("roadShipping")
public class RoadShipping implements ShippingStrategy {

	@Value("${shipping.road.base}")
	private int base;
	
	@Value("${shipping.road.perKg}")
	private int perKg;

	@Override
	public double calculateCost(double weight) {
		
		return base+(perKg*weight);
	}

}
