//Program calculates energy needed to heat water from an 
//initial temperature to a final temperature

package chapter2;
import java.util.Scanner;

public class Exercise2_10 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double weightOfWater = input.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double energyRequired = weightOfWater * (finalTemperature - initialTemperature) * 4184; 
		
		System.out.println("The energy needed is " + energyRequired);
	}
}
