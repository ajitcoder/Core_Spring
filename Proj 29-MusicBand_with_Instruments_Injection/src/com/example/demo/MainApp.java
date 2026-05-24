package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		try( AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class)){

			MusicBand musicBand = ctx.getBean(MusicBand.class);
			musicBand.showBandDetails();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
