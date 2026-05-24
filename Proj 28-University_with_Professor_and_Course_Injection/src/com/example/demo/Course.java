package com.example.demo;

public class Course {
	
	String courseName;
	int duration;
	
	public Course(String courseName, int duratiopn) {
		super();
		this.courseName = courseName;
		this.duration = duratiopn;
	}
	
	public void showCourse() {
		System.out.println("Course: "+courseName+" (Duration: "+duration+" months)");
	}

}
