package com.udemy.spring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneServices {
	
	@Override
	public String getFortune() {	
		return "It is your lucky Day!!!!";
	}
	

}
