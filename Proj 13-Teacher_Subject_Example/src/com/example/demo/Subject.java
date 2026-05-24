package com.example.demo;

public class Subject {
	
	Teacher teacher;

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void showSubjectInfo() {
		System.out.println("Subject is handled by [ "+teacher+"].");
	}

}
