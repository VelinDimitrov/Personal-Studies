package com.udemy.spring;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneServices {

	private String[] fortunes= {"Beware of the gods",
			"Lucky one",
			"First Blood of the day"};
	private Random rand=new Random();
	
	@PostConstruct
	public void initializedFortune() {
		System.out.println("Fortune init method started");
	}
	
	@PreDestroy
	public void cleanFortune() {
		System.out.println("Fortune destroy method started");
	}
	
	@Override
	public String getFortune() {
		int index=rand.nextInt(fortunes.length);
		
		return fortunes[index];
	}
	

}
