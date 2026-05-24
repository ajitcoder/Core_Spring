package com.ajit.sbeans;

import org.springframework.stereotype.Component;

public class Laptop {

	String brand;
	String processor;
	String ram;
	
	public Laptop(String brand, String processor, String ram) {
		super();
		this.brand = brand;
		this.processor = processor;
		this.ram = ram;
	}
	
}
