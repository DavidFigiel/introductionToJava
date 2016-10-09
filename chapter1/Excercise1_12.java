package chapter1;

public class Excercise1_12 {

	public static void main(String[] args) {
		double runnerTimeInSeconds = 60 * 60 + 40 * 60 + 35.0;
		double runnerTimeInHour = runnerTimeInSeconds / 3600.0;
		double mileToKilometer = 24 * 1.6;
		
		System.out.println("If a runner runs 24 miles in 1 hour, 40 minutes" +
					"and 35 seconds\nthen he will run on average: \n" +
					mileToKilometer / runnerTimeInHour + " kilometers per hour.");
	}
}
