package com.udemy.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:sport.properties")
public class ConfigurationClass {
	
   /* @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceHolderConfigurer() {        
        return new PropertySourcesPlaceholderConfigurer();
    }*/
	@Bean
	public FortuneServices getBetterFortuneService() {
		return new GetBetterFortuneService();
	}
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(getBetterFortuneService());
	}
	
	
}
