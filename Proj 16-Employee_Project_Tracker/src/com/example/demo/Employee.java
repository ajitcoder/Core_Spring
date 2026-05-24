package com.example.demo;

public class Employee {
	
	int empId;
	String empName;
	String designation;
	
	public Employee(int empId, String empName, String designation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
	}
	
	public void getEmployeeInfo() {
		System.out.println("Employee ["+empName+","+designation+"]");
		
	}

}
