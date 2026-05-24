package com.example.demo;

public class Course {
	
	int courseId;
	String courseName;
	
	public Course(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	public void showCourse() {
		System.out.println("course id :"+courseId);
		System.out.println("course name :"+courseName);
	}

}
