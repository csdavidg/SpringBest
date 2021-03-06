package co.com.david.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import co.com.david.coaches.SwimCoach;
import co.com.david.fortunes.SadFortuneService;
import co.com.david.interfaces.Coach;
import co.com.david.interfaces.FortuneService;

@Configuration
//@ComponentScan("co.com.david")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
