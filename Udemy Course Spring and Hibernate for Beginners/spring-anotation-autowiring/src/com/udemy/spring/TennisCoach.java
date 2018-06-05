package com.udemy.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneServices fortune;
	
/*	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneServices fortune1;
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneServices fortune2;*/
	
	/*@Autowired
	public TennisCoach(FortuneServices fortune) {		
		this.fortune = fortune;
	}*/
	
	public TennisCoach() {
		System.out.println("no arg constructor entered");
	}

	/*@Autowired
	public void setFortune(FortuneServices fortune) {
		System.out.println("Inside setter");
		this.fortune = fortune;
	}*/
	@PostConstruct
	public void initializingMethod() {
		System.out.println("Init method entered");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Clean up destroy method");
	} 
	
	@Override
	public String getDailyFortune() {
		
		return fortune.getFortune();
	}
	@Override
	public String getDailyWorkout() {		
		return "Hit 100 balls!";
	}

}
