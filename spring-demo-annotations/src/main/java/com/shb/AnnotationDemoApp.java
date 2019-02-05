package com.shb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("speechCoach", Coach.class);

		System.out.println(coach.getDailyWorkout());

		context.close();
	}

}
