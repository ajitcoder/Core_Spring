package com.example.demo;

import java.util.Map;

public class ShoppingCart {
	
	String cartOwner;
	Map<Product, Vendor> productVendorMap;
	public void setCartOwner(String cartOwner) {
		this.cartOwner = cartOwner;
	}
	public void setProductVendorMap(Map<Product, Vendor> productVendorMap) {
		this.productVendorMap = productVendorMap;
	}
	
	public void showCartDetails() {
		System.out.println(cartOwner);
		System.out.println("Cart Details:");
		for(Map.Entry<Product,Vendor> entry:productVendorMap.entrySet()) {
			Product product = entry.getKey();
			Vendor vendor = entry.getValue();
			
			product.showProductDetails();
			vendor.showVendorDetails();
		}
	}


}
