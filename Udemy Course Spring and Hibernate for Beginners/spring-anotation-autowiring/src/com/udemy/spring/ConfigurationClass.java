package com.udemy.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
	
	@Bean
	public FortuneServices getBetterFortuneService() {
		return new GetBetterFortuneService();
	}
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(getBetterFortuneService());
	}
	
	
}
