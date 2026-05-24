package com.example.demo;

public class Engine {
	
	String engineType;

	public Engine(String engineType) {
		super();
		this.engineType = engineType;
	}
	
	public void showEngineType() {
		
		System.out.println("Engine typoe = "+engineType);
	}

	public String getEngineType() {
		return engineType;
	}
	
	

}
