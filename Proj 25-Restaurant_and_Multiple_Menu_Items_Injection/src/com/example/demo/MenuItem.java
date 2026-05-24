package com.example.demo;

public class MenuItem {
	
	int itemId;
	String itemName;
	double price;
	
	
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void showItem() {
		System.out.println("Item Id: "+itemId+" , Name: "+itemName+" , Name: "+price);

	}

}
