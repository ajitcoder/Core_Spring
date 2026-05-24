package com.ajit.confg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.ajit")
@PropertySource("com/ajit/commons/engine.properties")
public class AppConfg {

}
