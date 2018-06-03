package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private Fortune fortune;

	public TrackCoach(Fortune fortune) {
		this.fortune = fortune;
	}

	public TrackCoach() {

	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getFortune() {
		return "TrackCoach :"+fortune.getFortune();
	}

}










