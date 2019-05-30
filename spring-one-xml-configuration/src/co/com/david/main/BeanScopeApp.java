package co.com.david.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.david.coaches.SoccerCoach;

public class BeanScopeApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scopeApplicationContext.xml");

		SoccerCoach soccerCoach = context.getBean("myCoach", SoccerCoach.class);

		SoccerCoach thSoccerCoach = context.getBean("myCoach", SoccerCoach.class);

		boolean sameReference = (soccerCoach == thSoccerCoach);

		System.out.println("The objects has the same reference: " + sameReference);

		System.out.println("soccerCoach reference : " + soccerCoach);

		System.out.println("thSoccerCoach: " + thSoccerCoach);

		context.close();
	}

}
