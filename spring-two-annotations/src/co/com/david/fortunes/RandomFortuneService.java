package co.com.david.fortunes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import co.com.david.interfaces.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		List<String> fortunesList = new ArrayList<>();
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource("fortunes.txt").getFile());

			BufferedReader br = new BufferedReader(new FileReader(file));

			String st;
			while ((st = br.readLine()) != null) {
				fortunesList.add(st);
			}
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
		}

		Random random = new Random();
		int position = random.nextInt(fortunesList.size());
		return fortunesList.get(position);
	}

}
