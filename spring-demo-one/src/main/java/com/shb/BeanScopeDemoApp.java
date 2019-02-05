package com.shb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach coach = context.getBean("myCoach", Coach.class);

		Coach coach2 = context.getBean("myCoach", Coach.class);

		System.out.println(coach == coach2);

		context.close();
	}

}
