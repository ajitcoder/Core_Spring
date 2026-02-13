package com.example.demo;

public class Person {
	
	String name;
	Address address;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println( "Person's name:"+name);
		System.out.println("Person's city:"+address.city);
		System.out.println("Person's country:"+address.country);
	}
	
	

}
