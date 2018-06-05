package com.udemy.spring;


public class SwimCoach implements Coach{
	
	private FortuneServices fortune;
	
	
	public SwimCoach(FortuneServices fortune) {		
		this.fortune = fortune;
	}
	@Override
	public String getDailyFortune() {
		
		return fortune.getFortune();
	}
	@Override
	public String getDailyWorkout() {
		return "Swim 10000 meters for the day!!!!";
	}
}
