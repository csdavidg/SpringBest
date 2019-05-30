package co.com.david.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.david.coaches.TennisCoach;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);

		System.out.println(tennisCoach.getDailyWorkOut());
		System.out.println(tennisCoach.getDailyFortune() );

		context.close();
 
	}

}
