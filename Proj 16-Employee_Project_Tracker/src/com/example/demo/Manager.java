package com.example.demo;

import java.util.Map;

public class Manager {
	
	String managerName;
	Map<Employee, Project> assignments;
	
	public Manager(String mannagerName, Map<Employee, Project> assignments) {
		super();
		this.managerName = mannagerName;
		this.assignments = assignments;
	}
      
	public void displayAssignments() {
		System.out.println("Manager: "+managerName);
		System.out.println("Assignments: ");
		for(Map.Entry<Employee, Project> entry:assignments.entrySet()) {
			Employee emp=entry.getKey();
			Project proj=entry.getValue();
			
			emp.getEmployeeInfo();
			proj.getProjectInfo();
		}
	}
	
}
