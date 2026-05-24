package com.example.demo;

public class TransportationFactory {

public static Transportation getInstance(String trasptMethod) {
		
		if(trasptMethod.equalsIgnoreCase("bus")) {
		   return new BusTransportation();
		}else if(trasptMethod.equalsIgnoreCase("train")) {
		    return new TrainTransportation();
		}else if(trasptMethod.equalsIgnoreCase("flight")) {
		    return new FlightTransportation();
		}else {
			throw new IllegalArgumentException("Invalid Transport Type");
		}
	}
}
