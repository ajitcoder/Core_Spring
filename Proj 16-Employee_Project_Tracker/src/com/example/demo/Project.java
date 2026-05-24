package com.example.demo;

public class Project {
	
	int projectId;
	String projectName;
	String duration;
	
	public Project(int projectId, String projectName, String duration) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.duration = duration;
	}
	
	public void getProjectInfo() {
		System.out.println("->Project["+projectName+"]");
	}
	

}
