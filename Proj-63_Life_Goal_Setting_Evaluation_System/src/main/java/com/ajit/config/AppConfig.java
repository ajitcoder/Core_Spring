package com.ajit.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.ajit.sbeans.FinancialGoalStrategy;
import com.ajit.sbeans.FitnessGoalStrategy;
import com.ajit.sbeans.GoalStrategy;
import com.ajit.sbeans.SkillGoalStrategy;

@Configuration
@ComponentScan(basePackages = "com.ajit")
@PropertySource("com/ajit/commons/development.properties")
public class AppConfig {

	@Value("${goal.type}")
	String goalType;
	
	@Bean(name="goal")
	public GoalStrategy getGoalStrategy() {
		
		if(goalType.equalsIgnoreCase("skill")) {

			return new SkillGoalStrategy();
		}else if(goalType.equalsIgnoreCase("financial")) {
			
			return new FinancialGoalStrategy();
			
		}else if(goalType.equalsIgnoreCase("fitness")) {
			
			return new FitnessGoalStrategy();
		}else {
			
			throw new IllegalArgumentException("Invalid input");
		}
	}
}