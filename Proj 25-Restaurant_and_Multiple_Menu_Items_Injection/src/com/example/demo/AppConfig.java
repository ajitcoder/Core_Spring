package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {
	
	@Bean
	MenuItem menuItem1() {
		MenuItem menuItem=new MenuItem();
		menuItem.setItemId(101);
		menuItem.setItemName("Pizza");
		menuItem.setPrice(250);
		return menuItem;
	}
	
	@Bean
	MenuItem menuItem2() {
		MenuItem menuItem=new MenuItem();
		menuItem.setItemId(102);
		menuItem.setItemName("Burger");
		menuItem.setPrice(150);
		return menuItem;
	}
	
	@Bean
	MenuItem menuItem3() {
		MenuItem menuItem=new MenuItem();
		menuItem.setItemId(103);
		menuItem.setItemName("Pasta");
		menuItem.setPrice(200);
		return menuItem;
	}
	
	@Bean
	Restaurant restaurant() {
		Restaurant restaurant=new Restaurant();
		restaurant.setRestaurantName("SpiceHub");
		
		List<MenuItem> list=new ArrayList<>();
		list.add(menuItem1());
		list.add(menuItem2());
		list.add(menuItem3());
		restaurant.setMenuItems(list);
		
		return restaurant;
	}


}
