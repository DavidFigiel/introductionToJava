//This program takes starting/ending velocity as well as
//time variables and returns the average acceleration.

package chapter2;
import java.util.Scanner;


public class Exercise2_9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// equation for acceleration: a = (v1 - v0) / t
		
		System.out.println("Enter v0, v1, and t: ");
		
		double v0 = input.nextDouble(); // starting velocity m/s
		double v1 = input.nextDouble(); // ending velocity m/s
		double time = input.nextDouble(); // time in seconds
		double acceleration = (v1 - v0) / time;
		
		System.out.println("The average acceleration is " + acceleration);
		
	}
	
}
