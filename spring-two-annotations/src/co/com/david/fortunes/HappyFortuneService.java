package co.com.david.fortunes;

import org.springframework.stereotype.Component;

import co.com.david.interfaces.FortuneService;

@Component 
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Have a nice Day!!";
	}

}
