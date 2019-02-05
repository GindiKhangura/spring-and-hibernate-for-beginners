package com.shb;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void doCleanupStuff() {
		System.out.println("Do cleanup stuff.");
	}

	public void doStartupStuff() {
		System.out.println("Do startup stuff.");
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes running.";
	}

}
