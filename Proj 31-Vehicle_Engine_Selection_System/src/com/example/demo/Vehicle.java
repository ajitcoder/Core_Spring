package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehicle {
	
	@Autowired
	@Qualifier("electricEngine")
	Engine engine;
	
	public void startvehicle() {
		
		engine.start();
	}
	

}
