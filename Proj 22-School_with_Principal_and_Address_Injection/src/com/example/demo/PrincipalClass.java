package com.example.demo;

public class PrincipalClass {
	
	String name;
	int experience;
	public void setName(String name) {
		this.name = name;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void displayPrincipalInfo() {
        System.out.println("Principal: " + name + " (" + experience + " years experience)");

	}
}
