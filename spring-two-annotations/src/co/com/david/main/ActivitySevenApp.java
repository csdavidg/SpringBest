package co.com.david.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import co.com.david.config.ActivitySevenConfig;
import co.com.david.interfaces.Coach;

public class ActivitySevenApp {

	public static void main(String args[]) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ActivitySevenConfig.class);

		Coach theCoach = context.getBean("soccerCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkOut());

		System.out.println(theCoach.getDailyFortune());

		context.close();

	}

}
