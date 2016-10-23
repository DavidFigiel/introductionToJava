//finds number of years and days from minutes entered

package chapter2;
import java.util.Scanner;

public class Exercise2_7 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the number of minutes: ");
	int numberOfMinutes = input.nextInt();
	int minutesInYear = 365 * 24 * 60;
	int minutesInDay = 24 * 60;
	int minutesToYears = numberOfMinutes / minutesInYear;  
	int minutesLeftover = numberOfMinutes - minutesInYear * minutesToYears;
	int minutesToDays = minutesLeftover / minutesInDay;
	
	System.out.println(numberOfMinutes + " minutes is approximately " + minutesToYears + 
			" years and " + minutesToDays + " days");

	}
}
