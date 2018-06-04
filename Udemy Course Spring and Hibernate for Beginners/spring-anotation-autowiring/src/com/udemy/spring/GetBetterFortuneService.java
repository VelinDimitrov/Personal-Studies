package com.udemy.spring;

import org.springframework.stereotype.Component;

@Component
public class GetBetterFortuneService implements FortuneServices {

	@Override
	public String getFortune() {
		
		return "You need to get better";
	}

}
