package co.com.david.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.com.david.coaches.SwimCoach;
import co.com.david.config.SportConfig;

public class JavaManualConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(theCoach.getDailyWorkOut());

		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmail());

		context.close();
	}

}
