package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        GymCoach gymCoach=context.getBean("fitnesCoach",GymCoach.class);

        System.out.println(gymCoach.getFortune());
        System.out.println(gymCoach.getDailyWorkout());
        System.out.println(gymCoach.getTeam());
    }
}
