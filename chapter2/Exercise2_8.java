//Program displays current time offset GMT showing different time-zones

package chapter2;
import java.util.Scanner;

public class Exercise2_8 {

	public static void main(String[] args) {
		
		
			// Obtain the total milliseconds since midnight, Jan 1, 1970
			long totalMilliseconds = System.currentTimeMillis();
			
			// Obtain the total seconds since midnight, Jan 1, 1970
			long totalSeconds = totalMilliseconds / 1000;
			
			// Compute the current second in the minute in the hour
			long currentSecond = totalSeconds % 60;
			
			// Obtain the total minutes
			long totalMinutes = totalSeconds / 60;
			
			// Compute the current minute in the hour
			long currentMinute = totalMinutes % 60;
			
			// Obtain the total hours
			long totalHours = totalMinutes / 60;
			
			// Compute the current hour
			long currentHour = totalHours % 24;
			
			// Display results
			System.out.println("Current time is " + currentHour + ":"
					+ currentMinute + ":" + currentSecond + " GMT");
			
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT: ");
		long offset = input.nextInt();
		long newTotalHour = offset + totalHours;
		long newCurrentHour = newTotalHour % 24;
		
		//System.out.println(newTotalHour + " " + totalHours);
		
		System.out.println("The current time is " + newCurrentHour + ":"
				+ currentMinute + ":" + currentSecond + " GMT");
		
		
	}
}
