package co.com.david.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.david.fortunes.BestFortuneService;

public class RamdomFortuneServiceApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BestFortuneService bestFortuneService = context.getBean("myRandomFortuneService", BestFortuneService.class);

		System.out.println(bestFortuneService.getFortune());
		
		context.close();
	}

}
