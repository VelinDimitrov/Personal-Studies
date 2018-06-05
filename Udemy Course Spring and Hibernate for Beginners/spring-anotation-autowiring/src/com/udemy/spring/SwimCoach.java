package com.udemy.spring;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
	
	private FortuneServices fortune;
	
	@Value("${coach.team}")
	private String team;
	
	@Value("${coach.skill}")
	private String skill;
	
	public SwimCoach(FortuneServices fortune) {		
		this.fortune = fortune;
	}
	
	public String getTeam() {
		return team;
	}

	public String getSkill() {
		return skill;
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
