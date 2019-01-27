package com.shb;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach() {
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 mins.";
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setting Cricket coach's fortune service.");
		this.fortuneService = fortuneService;
	}

}
