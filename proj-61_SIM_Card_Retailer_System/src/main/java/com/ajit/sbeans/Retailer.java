package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Retailer {
@Autowired
@Qualifier("mainSim")
ISimCard card;

@Value("${retailer.name}")
String name;


@Value("${retailer.location}")
String location;

public void showSimInfo() {
System.out.println("Retailer: "+name);
System.out.println("Location : "+location);	
System.out.println(card.getSimDetails());
}

}
