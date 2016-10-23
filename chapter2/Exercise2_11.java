//Uses Exercise 1_11 but instead asks for number of years.
//Program then casts the final value into an int value from
//a double value and truncates the values. 

package chapter2;
import java.util.Scanner;


public class Exercise2_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		
		double secondsInYear = 365 * 24 * 60 * 60.0;
		double secondsInYears = secondsInYear * years;
		double currentPopulation = 312032486.0;
		double births = secondsInYears / 7.0;
		double deaths = secondsInYears / 13.0;
		double newImmigrants = secondsInYears / 45.0; 
		System.out.println("The population in " + years + " years is " +
					((int)currentPopulation + (int)(births + newImmigrants) - (int)deaths));
		
		
	}
}
