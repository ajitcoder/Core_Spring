package com.example.demo;

import java.util.Map;

public class Bank {
	
	String bankName;
	Map<String,String> branches;
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public void setBranches(Map<String, String> branches) {
		this.branches = branches;
	}
	
	public void showBranches() {
		System.out.println("Bank Name: "+bankName);
		System.out.println("Branch Details:");
		for(Map.Entry<String, String> entry:branches.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + " " + value);
			
		 
		}
	}


}
