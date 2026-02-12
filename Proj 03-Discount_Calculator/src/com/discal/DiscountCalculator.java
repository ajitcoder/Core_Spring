package com.discal;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator {
	
	private LocalDate currentDate;
	private double price;
	
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculateDiscount() {
		
		 int value = currentDate.getDayOfWeek().getValue();
		
		 if(value>=1 && value<=5)
		 {
			 System.out.println("Price = "+this.price);
			 System.out.println("10% Discount applied");
			 System.out.print("Total price = ");
			return price- (price*0.10);
		 }
		 else
		 {
			 return price- (price*0.20);
		 }
		 
		
		
	}
	
	

}
