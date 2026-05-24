package com.example.demo;

public class GooglePayService implements PaymentService{
	
@Override
public void pay(double amount) {
	System.out.println("Paid ₹"+amount+" using GooglePay");
}
}
