package com.shb;

public class EsportsCoach implements Coach {

	private FortuneService fortuneService;

	public EsportsCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "Spending 30 minutes playing.";
	}

}
