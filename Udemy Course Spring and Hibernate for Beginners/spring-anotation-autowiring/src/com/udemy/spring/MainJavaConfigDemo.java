package com.udemy.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJavaConfigDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkout()+"\n"+theCoach.getDailyFortune());
		
		System.out.println(theCoach.getSkill()+"\n"+theCoach.getTeam());
		context.close();
		
	}

}
