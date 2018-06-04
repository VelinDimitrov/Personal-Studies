package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		Coach alpha =context.getBean("myCoach",TrackCoach.class);
		
		System.out.println(theCoach==alpha);
		
		System.out.println("The Coach memory adress : "+theCoach);
		
		System.out.println("The Alpha memory adress :"+alpha);
		
		context.close();
		
	}

}








