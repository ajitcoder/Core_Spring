package com.example.demo;

public class Account {
	
	String accountNumber;
	double balance;
	Customer customer;
	
	public Account(String accountNumber, double balance, Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customer = customer;
	}
	
	public void displayAccountInfo() {
		
		System.out.println("Account ["+this.accountNumber+"] belongs to ["+customer.customerName+"].");
	}


}
