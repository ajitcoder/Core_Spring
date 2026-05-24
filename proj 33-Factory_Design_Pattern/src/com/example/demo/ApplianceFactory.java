package com.example.demo;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("applianceFactory")
public class ApplianceFactory {
	
	@Autowired
	Map<String,Appliance> map;
	
	public Appliance getAppliance(String type) {
		
		Appliance appliance = map.get(type);
		return appliance;
	}

}
