package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	private Fortune fortune;
	public BaseballCoach(Fortune fortune) {
		this.fortune = fortune;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getFortune() {
		return "BaseballCoach :"+fortune.getFortune();
	}

}








