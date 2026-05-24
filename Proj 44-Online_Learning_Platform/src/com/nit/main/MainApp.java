package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.comps.LearningController;
import com.nit.confg.AppConfig;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        LearningController bean = ctx.getBean(LearningController.class);
        bean.enrollJavaCourse();
        bean.enrollPythonCourse();
        bean.enrollDataScienceCourse();
	}

}
