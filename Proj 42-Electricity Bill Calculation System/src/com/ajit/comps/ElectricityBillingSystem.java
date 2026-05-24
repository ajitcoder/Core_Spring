package com.ajit.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("electricityBillingSystem")
public class ElectricityBillingSystem {
	
BillingStrategy billingStrategy;
	
	
	public void setBillingStrategy(BillingStrategy billingStrategy) {
		this.billingStrategy = billingStrategy;
	}


	public void showBill(double units) {
	
		System.out.println("Total Bill Amount: "+billingStrategy.calculateBill(units));
	}


}
