package com.ajit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.ajit")
@ImportResource("com/ajit/commons/application.xml")
public class AppConfig {

}
