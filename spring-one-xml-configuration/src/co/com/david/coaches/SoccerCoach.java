package co.com.david.coaches;

import co.com.david.interfaces.Coach;
import co.com.david.interfaces.FortuneService;

public class SoccerCoach implements Coach {

	private String email;
	
	private FortuneService fortuneService;
	
	public SoccerCoach() {
		System.out.println("Constructor SoccerCoach");
	}
	
	@Override
	public String getWorkOut() {
		return "Free Kick Practice";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	public void init() {
		System.out.println("Init Method");
	}
	
	public void destroyMethod() {
		System.out.println("Destroy Method");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Setter Method");
		this.fortuneService = fortuneService;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
}
