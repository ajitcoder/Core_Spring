package com.example.demo;

public class Department {
	
	int deptId;
	String deptName;
	
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public void getDepartmentDetails() {
		
		System.out.println("Department Details: (DeptId:"+deptId+",DeptName:"+deptName+")");
	}
	

}
