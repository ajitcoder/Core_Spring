package com.example.demo;

import java.util.List;

public class ECommercePlatform {
	
	String platformName;
	List<ShoppingCart> carts;
	
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	
	public void setCarts(List<ShoppingCart> carts) {
		this.carts = carts;
	}
	public void displayPlatformInfo() {
		System.out.println("--- Platform: "+platformName+"---");
		for(ShoppingCart sc:carts) {
			System.out.print("Cart Owner: ");
			sc.showCartDetails();
		}
	}

	
	

}
