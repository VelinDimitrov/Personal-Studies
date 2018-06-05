package com.udemy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaConfigDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		Coach theCoach=context.getBean("swimCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout()+"\n"+theCoach.getDailyFortune());
		
		context.close();
		
	}

}
