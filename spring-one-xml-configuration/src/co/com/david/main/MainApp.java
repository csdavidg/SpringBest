package co.com.david.main;

import co.com.david.coaches.TrackCoach;
import co.com.david.interfaces.Coach;

public class MainApp {

	public static void main(String[] args) {
		
		Coach theCoach = new TrackCoach();
		
		System.out.println(theCoach.getWorkOut());

	}

}
