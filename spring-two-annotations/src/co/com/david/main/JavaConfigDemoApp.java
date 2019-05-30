package co.com.david.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.com.david.coaches.TennisCoach;
import co.com.david.config.SportConfig;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		TennisCoach tennisCoach = context.getBean("tennisCoach", TennisCoach.class);

		System.out.println(tennisCoach.getDailyWorkOut());

		System.out.println(tennisCoach.getDailyFortune());

		context.close();
	}

}
