package com.example.demo;

public class Product {
	
	int productId;
	String productName;
	double price;
	
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	public void showProductDetails() {
		System.out.println("Product id: "+productId);
		System.out.println("Product name: "+productName);
		System.out.println("Product price: "+price);
		
	}
	

}
