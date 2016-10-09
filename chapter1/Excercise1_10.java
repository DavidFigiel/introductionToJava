package chapter1;

public class Excercise1_10 {

	public static void main(String[] args) {
		//runner runs 14 kilometers in 45 minutes and 30 seconds.
		//get total seconds 45 * 60 + 30
		double totalSeconds = 45.0 * 60 + 30;
		double secondsInHour = 3600.0;
		double secondsToHour = totalSeconds / secondsInHour;
		int totalKilometers = 14;
		double kilometerToMile = totalKilometers * 1.6;
		//System.out.println("The average speed in miles is: " + kilometerToMile / secondsToHour);
		System.out.println(kilometerToMile / secondsToHour);
	}
}
