package com.example.demo;

public class BillService {
	
	double taxPercentage;
	double discountPercentage;
	
	public BillService(double taxPercentage, double discountPercentage) {
		super();
		this.taxPercentage = taxPercentage;
		this.discountPercentage = discountPercentage;
	}
	
	public double calculateTotal(Order order) {
		double baseAmount=order.product.price*order.quantity;
		System.out.println("Base Amount: "+baseAmount);
		taxPercentage=baseAmount*(taxPercentage/100);
		System.out.println("Tax: "+taxPercentage);
		discountPercentage=baseAmount*(discountPercentage/100);
		System.out.println("Discount: "+discountPercentage);
		double finalBill=baseAmount+taxPercentage-discountPercentage;
		return finalBill;
		
	}	

}
