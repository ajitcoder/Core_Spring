package com.example.demo;

public class Product {
	
	int productId;
	String productName;
	int price;
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showProductDetails() {
		System.out.println("-Product: "+productName+" ("+price+") | ");
	}

}
