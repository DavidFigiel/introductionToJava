//Program asks user to input a temperature in Fahrenheit between -58*F & 41*F
//as well as a wind speed in mph then gives the windchillindex by using a formula
//implemented by the National Weather Service

package chapter2;
import java.util.Scanner;

public class Exercise2_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between -58*F and 41*F: ");
		double temperature = input.nextDouble();
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		double windChillIndex = 35.74 + .6215 * temperature - 35.75 * Math.pow(windSpeed, .16) + 
								.4275 * temperature * Math.pow(windSpeed, .16); 
		
		System.out.print("The wind chill index is " + windChillIndex);
	}
}
