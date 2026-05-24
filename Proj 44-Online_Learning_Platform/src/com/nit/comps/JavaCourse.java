package com.nit.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class JavaCourse implements Course {
   @Autowired
   @Qualifier("onlineDelivery")
	DeliveryMode deliverymode;
	@Override
	public String getCourseName() {
		
		return "Java Programming";
	}

}
