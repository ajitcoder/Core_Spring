package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BookingManager {

	@Autowired
	@Qualifier("busTransportService")
	TransportService service;
	
	public void showBookingDetails(String source, String des ) {
		
		service.book(source, des);
	}
}
