package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contextContainer=
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach myCoach=contextContainer.getBean("myCoach",Coach.class);

		Coach trackCoach=contextContainer.getBean("trackCoach",Coach.class);

		Coach theRealCoach = contextContainer.getBean("fitnesCoach",Coach.class);

		System.out.println(myCoach.getFortune());
		System.out.println(myCoach.getDailyWorkout());
		System.out.println();

		System.out.println(trackCoach.getFortune());
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println();

		System.out.println(theRealCoach.getFortune());
		System.out.println(theRealCoach.getDailyWorkout());
		
		System.out.println();
		contextContainer.close();

	}

}







