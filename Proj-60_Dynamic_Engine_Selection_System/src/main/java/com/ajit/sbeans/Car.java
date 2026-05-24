package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	@Qualifier("mainEngine")
	IEngine iengine;
	
	@Value("${car.name}")
	String name;
	
	@Value("${car.price}")
	double price;
	
	public void showCarDetails() {
	System.out.println("Car Name: "+name);	
	System.out.println("Price : "+price);
	System.out.println("Engine info: "+ iengine.start());
	}
}
