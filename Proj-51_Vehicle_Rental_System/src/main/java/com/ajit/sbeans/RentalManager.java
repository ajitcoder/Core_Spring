package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RentalManager {
	
	@Qualifier("carRentalService")
	@Autowired
	VehicleService vehicleservice;
	public void rentBook(String customer) {
		
		vehicleservice.rent(customer);
		
	}
}
