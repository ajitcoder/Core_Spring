package com.example.demo;

public class Company {
	
	Department dept1;
	Department dept2;
	Department dept3;
	
	
	
	public void setDept1(Department dept1) {
		this.dept1 = dept1;
	}



	public void setDept2(Department dept2) {
		this.dept2 = dept2;
	}



	public void setDept3(Department dept3) {
		this.dept3 = dept3;
	}



	public void showDepartments() {
		dept1.deptInfo();
		dept2.deptInfo();
		dept3.deptInfo();
	}


}
