package com.udemy.spring;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneServices {

	@Override
	public String getFortune() {
		
		return "Become sad Fortune";
	}

}
