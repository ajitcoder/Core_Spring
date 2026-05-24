package com.example.demo;

import java.util.Map;

public class Company {
	
	String companyName;
	Map<String, Department> departments;
	
	
	public Company(String companyName, Map<String, Department> departments) {
		super();
		this.companyName = companyName;
		this.departments = departments;
	}
	
	public void showCompanyInfo() {
		System.out.println("=== Company Structure ===");
		System.out.println("Company: "+companyName);
		for(Map.Entry<String, Department> entry:departments.entrySet()) {
			String key = entry.getKey();
			Department department = entry.getValue();
			
			department.showDepartmentInfo();
		}
	}


}
