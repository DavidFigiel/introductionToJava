//Program takes the speed and acceleration of an airplane and 
//uses a formula to determine the minimum run-way length the plane
//would need to take-off


package chapter2;
import java.util.Scanner;

public class Exercise2_12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter speed and acceleration: ");
		double v = input.nextDouble(); // speed in m/s
		double a = input.nextDouble(); // acceleration in m/s^2
		double length = Math.pow(v, 2) / (2 * a);
		//Equation is length = v^2 / 2a
		
		
		System.out.print("The minimum runway length for this airplane is " + length);
	}
}
