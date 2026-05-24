package com.ajit.sbeans;

import org.springframework.stereotype.Component;

@Component("research")
public class ResearchSatellite implements ISatellite {

	@Override
	public String transmitSignal(String location) {

		return "Transmitting space research data to "+location;
	}

}
