package co.com.david.coaches;

import co.com.david.interfaces.Coach;
import co.com.david.interfaces.FortuneService;

public class SoccerCoach implements Coach {

	private FortuneService fortuneService;

	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Free Kick every day";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
