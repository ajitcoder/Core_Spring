package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("InvoiceService")
public class InvoiceService {
	
	@Autowired
	Product product;
	@Autowired
	TaxCalculator taxCalculator;
	
	public void printInvoice() {
		double total = product.price * product.quatity;
		double tax = taxCalculator.calculateTax(total);
		double finalAmount = total + tax;
		
		System.out.println("Invoice:");
		System.out.println("Product: "+product.name);
		System.out.println("Quantity: "+product.quatity);
		System.out.println("Total (before tax): "+total);
		System.out.println("Tax: "+tax);
		System.out.println("Final Amount: "+finalAmount);
	}

}
