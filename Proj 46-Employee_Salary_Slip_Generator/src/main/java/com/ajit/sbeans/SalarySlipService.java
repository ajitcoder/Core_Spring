package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class SalarySlipService {
	
	@Autowired
	Employee employee;
	
	public void generateSlip() {
		System.out.println("Salary Slip for "+ employee.name);
		double grossalary=employee.basicSalary+employee.hra+employee.da;
		System.out.println("Gross Salary: "+grossalary);
		double tax=(grossalary*employee.taxPercentage)/100;
		System.out.println("Tax Deducted: "+tax);
		double netsal=grossalary-tax;
		System.out.println("Net Salary: "+netsal);
	}
	

}
