package chapter1;

public class Excercise1_11 {

	public static void main(String[] args) {
		double secondsInYear = 365 * 24 * 60 * 60.0;
		double secondsInFiveYears = secondsInYear * 5.0;
		double births = secondsInFiveYears / 7.0;
		double deaths = secondsInFiveYears / 13.0;
		double newImmigrants = secondsInFiveYears / 45.0; 
		System.out.println("The population in five years based on " +
					"births, deaths, and new immigrants is: " +
					((births + newImmigrants) - deaths));
	}
}
