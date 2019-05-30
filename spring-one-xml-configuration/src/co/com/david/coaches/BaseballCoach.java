package co.com.david.coaches;

import co.com.david.interfaces.Coach;
import co.com.david.interfaces.FortuneService;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getWorkOut() {
		return "BaseBall Coach says RUN";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
