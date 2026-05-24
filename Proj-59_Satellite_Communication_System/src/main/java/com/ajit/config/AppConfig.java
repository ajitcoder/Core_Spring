package com.ajit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"com.ajit.sbeans","com.ajit.commons"})
@ImportResource("com/ajit/cfgs/applicationContext.xml")
public class AppConfig {

}
