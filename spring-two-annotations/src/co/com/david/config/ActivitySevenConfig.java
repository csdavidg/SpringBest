package co.com.david.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.com.david.coaches.SoccerCoach;
import co.com.david.fortunes.AmazingFortuneService;
import co.com.david.interfaces.Coach;
import co.com.david.interfaces.FortuneService;

@Configuration
public class ActivitySevenConfig {

	@Bean
	public FortuneService amazingFortuneService() {
		return new AmazingFortuneService();
	}

	@Bean
	public Coach soccerCoach() {
		return new SoccerCoach(amazingFortuneService());
	}

}
