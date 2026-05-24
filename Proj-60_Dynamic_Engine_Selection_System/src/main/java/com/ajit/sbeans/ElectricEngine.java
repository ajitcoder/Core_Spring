package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricEngine implements IEngine {

	@Override
	public String start() {
		
return "Starting Electric Engine — silent power!";


	}

}
