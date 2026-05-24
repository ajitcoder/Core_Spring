package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceCenter {
	
	@Autowired
	Vehicle vehicle;
	String serviceType;
	
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public void performService() {
		System.out.println("=== Vehicle Manufacturing & Service System ===");
		vehicle.engine.showEngineDetails();
		vehicle.tyre.showTyreDetails();
		vehicle.displayVehicleInfo();
		System.out.println("Service Type: "+serviceType);
		}

}
