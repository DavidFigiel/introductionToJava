//Program converts feet into meters

package chapter2;
import java.util.Scanner;

public class Exercise2_3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		
		double feet = input.nextDouble();
		final double METER = 3.2786;
		double feetToMeter = feet / METER;
		
		System.out.println(feet + " feet is " + feetToMeter + " meters");
	}
}
