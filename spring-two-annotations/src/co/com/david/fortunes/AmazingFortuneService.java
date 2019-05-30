package co.com.david.fortunes;

import co.com.david.interfaces.FortuneService;

public class AmazingFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is the best year that you have had";
	}

}
