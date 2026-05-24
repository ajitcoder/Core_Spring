package com.example.demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
try(Scanner scn = new Scanner(System.in)){
			
			System.out.print("Enter Delivery method name: ");
			String method = scn.nextLine();
			
			FoodDelivery delivery = new FoodDelivery();
			DeliveryMethod deliveryMethod = FoodDeliveryFactory.getInstance(method);
			
			delivery.setDeliveryMethod(deliveryMethod);
			
			System.out.print("Enter Restuarant name: ");
			String name = scn.nextLine();
			
			System.out.print("Enter Dish name: ");
			String dishName = scn.nextLine();
			
			delivery.executeDelivery(name, dishName);
	  }

  }
	
}

