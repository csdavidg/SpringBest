package co.com.david.coaches;

import co.com.david.interfaces.Coach;
import co.com.david.interfaces.FortuneService;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkOut() {
		return "Track Coach says RUN more";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
