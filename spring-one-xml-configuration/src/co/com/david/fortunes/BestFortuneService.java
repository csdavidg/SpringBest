package co.com.david.fortunes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import co.com.david.interfaces.FortuneService;

public class BestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		List<String> fortunesList = new ArrayList<>();
		fortunesList.add("Best Day");
		fortunesList.add("Incredible Day");
		fortunesList.add("Congratulations");
		
		Random random = new Random();
		Integer randomInteger = random.nextInt(fortunesList.size());
		
		if (randomInteger != null) {
			return fortunesList.get(randomInteger);
		}
		return "You dont going to have fortune today";

	}

}
