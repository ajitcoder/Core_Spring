package com.example.demo;

import java.util.List;

public class Company {
	
	List<Department> departments;

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	
	public void showDepartments() {
        System.out.println("---- Company Departments ----");
        for (Department dept : departments) {
            dept.showDepartment();
        }     }
}
