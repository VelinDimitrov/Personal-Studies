package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

	public void initializeBean(){
		System.out.println("inside initialize method on adress : "+this.toString());
	}
	public void destroyBean() {
		System.out.println("inside the destroy method on adress :"+this.toString());
	}
}










