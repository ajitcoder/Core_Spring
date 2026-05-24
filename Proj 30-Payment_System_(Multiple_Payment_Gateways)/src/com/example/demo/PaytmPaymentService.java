package com.example.demo;

public class PaytmPaymentService implements PaymentService{

@Override
public void pay(double amount){
	System.out.println("Paid ₹"+amount+" using Paytm");
  }
}
