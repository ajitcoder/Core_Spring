package com.example.demo;

public class Doctor {
	
	String name;
	String specialization;
	
	public Doctor(String name, String specialization) {
		super();
		this.name = name;
		this.specialization = specialization;
	}
	
	
	public void showDoctor() {
		System.out.println("Doctor: "+name +" ("+specialization+")");
	}

}
