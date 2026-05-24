package com.example.demo;

public class TrainTransportation implements Transportation {

	@Override
	public void bookTrip(String destination, double price) {
		System.out.println("Booked a trip to "+destination+" by Train for "+ price);
		
	}

}
