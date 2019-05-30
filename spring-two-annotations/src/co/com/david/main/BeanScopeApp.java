package co.com.david.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.david.coaches.TennisCoach;

public class BeanScopeApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);

		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);

		boolean sameReference = (coach == theCoach);

		System.out.println("The objects has the same reference: " + sameReference);

		System.out.println("soccerCoach reference : " + coach);

		System.out.println("thSoccerCoach: " + theCoach);

		context.close();
	}

}
