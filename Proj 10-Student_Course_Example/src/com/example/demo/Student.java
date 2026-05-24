package com.example.demo;

public class Student {
	
	int studentId;
	String studentName;
	Course course;
	
	public Student(int studentId, String studentName, Course course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student ID: "+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Course ID: "+course.courseId);
		System.out.println("Course Name: "+course.courseName);
		
	}

}
