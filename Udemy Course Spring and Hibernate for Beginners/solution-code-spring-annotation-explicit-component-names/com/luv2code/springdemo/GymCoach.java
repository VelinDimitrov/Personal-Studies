package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Rock the hell out of the steel boy!!!!";
	}

}
