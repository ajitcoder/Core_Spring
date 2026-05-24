package com.nit.comps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LearningController {
@Autowired
private JavaCourse jc;
@Autowired
private PythonCourse pc;
@Autowired
private DataScienceCourse dsc;
public 	void enrollJavaCourse() {
System.out.println(jc.getCourseName()+" uses "+jc.deliverymode.deliver(jc.getCourseName()));
	}
	

	public void enrollPythonCourse() {
		System.out.println(pc.getCourseName()+" uses "+pc.deliverymode.deliver(pc.getCourseName()));
	}

public 	void enrollDataScienceCourse() {
	System.out.println(dsc.getCourseName()+" uses "+dsc.deliverymode.deliver(dsc.getCourseName()));
	}
}
