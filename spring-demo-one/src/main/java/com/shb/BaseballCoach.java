package com.shb;

public class BaseballCoach implements Coach {

	public BaseballCoach() {
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice.";
	}

}
