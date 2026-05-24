package com.ajit.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BookingManager {
	@Autowired
	@Qualifier("busService")
	TransportService transportService;
	
	
	public void bookTicket(String src, String dest) {
		System.out.println("The Hashcode of  BookingManager: "+this.hashCode() );
		System.out.println("The Hashcode of the injected TransportService "+transportService.hashCode());
		transportService.book(src, dest);
	}
}
