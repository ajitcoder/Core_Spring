package com.example.demo;

public class Order {
	
	int orderId;
	Customer customer;
	Product product;
	int quantity;
	
	public Order(int orderId, Customer customer, Product product, int quantity) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
	}
	
	public void showOrderDetails() {
		System.out.println("Customer id: "+customer.customerId);
		System.out.println("Customer name: "+customer.customerName);
		System.out.println("Address: "+customer.address);
		System.out.println("Product id: "+product.productId);
		System.out.println("Product name: "+product.productName);
		System.out.println("Price: "+product.price);
		System.out.println("Quantity: "+quantity);

		
	}
	
}
