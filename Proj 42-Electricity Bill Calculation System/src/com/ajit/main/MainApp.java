package com.ajit.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ajit.comps.CommercialBilling;
import com.ajit.comps.ElectricityBillingSystem;
import com.ajit.comps.IndustrialBilling;
import com.ajit.comps.ResidentialBilling;
import com.ajit.config.AppConfig;

public class MainApp {

	
		public static void main(String[] args) {
			AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
			ElectricityBillingSystem electricityBillingSystem = ac.getBean(ElectricityBillingSystem.class);
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter customer type (residential/commercial/industrial): ");
			String customerType=sc.nextLine();
			System.out.print("Enter Units consumed :");
			double unitConsumed=sc.nextDouble();
			System.out.print("Rate per unit: ");
			double unit=sc.nextDouble();
			
			if(customerType.equalsIgnoreCase("residential"))
			{
				ResidentialBilling residentialBilling = ac.getBean(ResidentialBilling.class);
				System.out.println("Customer Type: "+customerType);
				System.out.println("Units Consumed: "+unitConsumed);
				System.out.println("Rate per Unit: "+unit);
				electricityBillingSystem.setBillingStrategy(residentialBilling);
				electricityBillingSystem.showBill(unitConsumed);
			}
			
			else if(customerType.equalsIgnoreCase("commercial"))
			{
				CommercialBilling commercialBilling = ac.getBean(CommercialBilling.class);
				System.out.println("Customer Type: "+customerType);
				System.out.println("Units Consumed: "+unitConsumed);
				System.out.println("Rate per Unit: "+unit);
				electricityBillingSystem.setBillingStrategy(commercialBilling);
				electricityBillingSystem.showBill(unitConsumed);
			}
			
			else if(customerType.equalsIgnoreCase("industrial"))
			{
				IndustrialBilling industrialBilling = ac.getBean(IndustrialBilling.class);
				System.out.println("Customer Type: "+customerType);
				System.out.println("Units Consumed: "+unitConsumed);
				System.out.println("Rate per Unit: "+unit);
				electricityBillingSystem.setBillingStrategy(industrialBilling);
				electricityBillingSystem.showBill(unitConsumed);
			}
			else {
				throw new IllegalArgumentException("Invalid argument");
			}	
		}


}
