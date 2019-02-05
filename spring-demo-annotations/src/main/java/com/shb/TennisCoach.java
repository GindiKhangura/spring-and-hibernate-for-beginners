package com.shb;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("Constructing Tennis coach.");
	}

	@PreDestroy
	private void doCleanup() {
		System.out.println("Cleaning up Tennis coach...");
	}

	@PostConstruct
	private void doStartup() {
		System.out.println("Starting up Tennis coach...");
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "Smack balls all day.";
	}

}
