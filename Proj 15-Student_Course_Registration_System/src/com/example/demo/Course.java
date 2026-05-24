package com.example.demo;

public class Course {
	
	int courseId;
	String courseName;
	String duration;
	
	public Course(int courseId, String courseName, String duration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
	}
	
	public void showCourseInfo() {
		System.out.println(courseName+" "+ duration);
	}
	

}
