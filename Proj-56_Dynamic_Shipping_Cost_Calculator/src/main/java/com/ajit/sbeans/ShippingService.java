package com.ajit.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("shippingService")
public class ShippingService {
	
	@Autowired
	Map<String, ShippingStrategy> map;

	
	
	public double getShippingCost(String type, double weight) {
		
		System.out.print(type+" cost :");
		ShippingStrategy shippingStrategy = map.get(type);
		return shippingStrategy.calculateCost(weight);
	}


}
