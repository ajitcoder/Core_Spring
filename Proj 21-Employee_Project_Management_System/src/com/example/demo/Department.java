package com.example.demo;

import java.util.List;

public class Department {
	
	String departmentName;
	List<Employee> employees;
	
	public Department(String departmentName, List<Employee> employees) {
		super();
		this.departmentName = departmentName;
		this.employees = employees;
	}
	
	public void showDepartmentInfo() {
		System.out.println("Department: "+departmentName);
		for(Employee e:employees) {
			e.showEmployeeDetails();
		}
	}

}
