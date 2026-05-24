package com.example.demo;

import org.springframework.stereotype.Component;

@Component("truck")
public class Truck implements Vehicle {
	
	@Override
	public void assemble() {
		System.out.println("Assembling a Car with automatic transmission.");
		
	}
	

}
