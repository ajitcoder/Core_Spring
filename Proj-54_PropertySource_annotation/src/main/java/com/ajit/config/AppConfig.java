package com.ajit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.ajit")
@PropertySource("classpath:config.properties")
public class AppConfig {

}
