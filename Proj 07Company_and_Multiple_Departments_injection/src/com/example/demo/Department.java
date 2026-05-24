package com.example.demo;

public class Department {
	
	String deptName;
	int deptId;
	
	
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}



	public void deptInfo() {
		System.out.println("Dept Name:"+deptName);
		System.out.println("Dept Id:"+deptId);
	}

}
