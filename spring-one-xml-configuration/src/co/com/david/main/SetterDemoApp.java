package co.com.david.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.david.coaches.SoccerCoach;

public class SetterDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SoccerCoach theCoach = context.getBean("mySoccerCoach", SoccerCoach.class);

		System.out.println(theCoach.getWorkOut() + " Fortune: " + theCoach.getDailyFortune() + " Email: " + theCoach.getEmail());

		context.close(); 
	}

}
