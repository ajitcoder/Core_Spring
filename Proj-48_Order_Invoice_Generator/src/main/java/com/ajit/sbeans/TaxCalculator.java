package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("TaxCalculator")
public class TaxCalculator {
	
	@Autowired
	Product product;
	
	public double calculateTax(double amount) {
		return(amount*18)/100;
	}

}
