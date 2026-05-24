package com.ajit.sbeans;

import org.springframework.stereotype.Component;


public class Employee {
	
	int id;
	String name;
	double basicSalary;
	double hra;
	double da;
	double taxPercentage;
	public Employee(int id, String name, double basicSalary, double hra, double da, double taxPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.taxPercentage = taxPercentage;
	}
	
	

}
