package com.shb;

import org.springframework.stereotype.Component;

@Component
public class SpeechCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Talk to yourself in front of a mirror.";
	}

}
