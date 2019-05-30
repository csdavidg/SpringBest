package co.com.david.fortunes;

import co.com.david.interfaces.FortuneService;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Sad Fortune Service";
	}

}
