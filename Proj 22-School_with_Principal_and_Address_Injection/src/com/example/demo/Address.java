package com.example.demo;

public class Address {
	
	String city;
	String state;
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void displayAddressInfo() {
        System.out.println("Location: " + city + ", " + state);
    }

}
