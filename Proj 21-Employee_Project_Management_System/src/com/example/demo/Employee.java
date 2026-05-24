package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	int employeeId;
	String employeeName;
	Project project;
	
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	@Autowired
	public void setProject(Project project) {
		this.project = project;
	}
	
	public void showEmployeeDetails() {
		System.out.println("Employee: "+employeeName+" | ");
		project.showProjectDetails();
	}

}
