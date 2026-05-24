package com.ajit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.ajit.sbeans")
@PropertySource("com/ajit/commons/library.properties")
public class AppConfig {

}
