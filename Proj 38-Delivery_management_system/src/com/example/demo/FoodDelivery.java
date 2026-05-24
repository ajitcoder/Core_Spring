package com.example.demo;

public class FoodDelivery {

	DeliveryMethod deliveryMethod;

	public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	
	public void executeDelivery(String restaurantName, String dishName) {
		
		deliveryMethod.deliverFood(restaurantName, dishName);
	}
}
