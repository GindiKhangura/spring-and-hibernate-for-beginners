package com.shb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("myCricketCoach", Coach.class);

		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach);

		context.close();
	}

}
