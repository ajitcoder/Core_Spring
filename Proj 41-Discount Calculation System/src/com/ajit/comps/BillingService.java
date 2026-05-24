package com.ajit.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("billingService")
public class BillingService {
	
	@Autowired
	@Qualifier("premiumCustomerDiscount")
	DiscountStrategy discountStrategy;
	
	public void  generateBill(double amount) {
		double discount=discountStrategy.calculateDiscount(amount);
		System.out.println("Discount Applied: "+discount);
		System.out.println("Final Payable Amount: "+(amount-discount));
 
	}
}
