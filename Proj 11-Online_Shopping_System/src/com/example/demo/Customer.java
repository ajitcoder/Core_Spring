package com.example.demo;

public class Customer {
	
	int customerId;
	String customerName;
	String address;
	
	public Customer(int customerId, String customerName, String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
	}
	
	public void showCustomerInfo() {
		System.out.println("Customer id: "+customerId);
		System.out.println("Customer name: "+customerName);
		System.out.println("Customer address: "+address);
	}
	
	

}
