package com.udemy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tenisCoach=context.getBean("tennisCoach",Coach.class);
		 
		System.out.println(tenisCoach.getDailyWorkout());
		
		System.out.println(tenisCoach.getDailyFortune() +"\n");

		
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		 
		System.out.println(alphaCoach.getDailyWorkout());
		
		System.out.println(alphaCoach.getDailyFortune());
		
		
		System.out.println("Are both Coaches equal : "+(alphaCoach==tenisCoach));
	
		context.close();
	}

}
