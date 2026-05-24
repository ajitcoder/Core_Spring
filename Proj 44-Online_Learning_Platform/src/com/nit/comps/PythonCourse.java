package com.nit.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class PythonCourse implements Course {

	@Autowired
	@Qualifier("recordedDelivery")
	DeliveryMode deliverymode;
	@Override
	public String getCourseName() {
		
		return "Python for Beginners";
	}

}
