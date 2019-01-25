package com.shb;

//@SpringBootApplication
public class Main {

	public static void main(String[] args) {
//		SpringApplication.run(Main.class, args);
		Coach coach = new TrackCoach();

		System.out.println(coach.getDailyWorkout());
	}

}
