package com.example.demo;

import java.util.List;

public class University {

	String universityName;
	List<Student> students;
	
	public University(String universityName, List<Student> student) {
		super();
		this.universityName = universityName;
		this.students = student;
	}
	
	public void displayUniversityData() {
		System.out.println("---University: "+universityName+"---");
		for(Student s:students) {
			s.showStudentDetails();
			
		}
	}
}
