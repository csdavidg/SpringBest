package co.com.david.fortunes;

import co.com.david.interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Have a nice Day";
	}

}
