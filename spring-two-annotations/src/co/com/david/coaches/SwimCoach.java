package co.com.david.coaches;

import org.springframework.beans.factory.annotation.Value;

import co.com.david.interfaces.Coach;
import co.com.david.interfaces.FortuneService;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${email}")
	private String email;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Swim by 3 hours";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	
	
}
