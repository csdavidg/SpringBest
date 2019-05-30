package co.com.david.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.david.interfaces.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println(theCoach.getWorkOut() + " " + theCoach.getDailyFortune());

		context.close();

	}

}
