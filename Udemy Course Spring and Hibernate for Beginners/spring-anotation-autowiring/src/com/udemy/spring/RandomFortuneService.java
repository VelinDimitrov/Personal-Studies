package com.udemy.spring;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneServices {

	private String[] fortunes= {"Beware of the gods",
			"Lucky one",
			"First Blood of the day"};
	private Random rand=new Random();
	@Override
	public String getFortune() {
		int index=rand.nextInt(fortunes.length);
		
		return fortunes[index];
	}

}
