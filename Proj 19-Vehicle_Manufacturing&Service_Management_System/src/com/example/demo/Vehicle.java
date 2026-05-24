package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
	
	String  vehicleName;
	Engine engine;
	Tyre tyre;
	
	public Vehicle(Engine engine) {
		super();
		this.engine = engine;
	}
	@Autowired
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public void displayVehicleInfo() {
		
	System.out.println("Vehicle: "+vehicleName);	
	
	}
}
