package com.ajit.comps;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("singleton")
@Component("trainService")
public class TrainTransportService implements TransportService {

	@Override
	public void book(String source, String destination) {
		System.out.println("Booking Train from "+source+" to "+destination);
		
	}

}
