//Program takes weight in pounds and height in inches then
//converts these values to Kilograms and Meters and uses an 
//equation Weight(kg) / Height(m)^2 to return a Body Mass Index value


package chapter2;
import java.util.Scanner;

public class Exercise2_14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		double weightPoundsToKilograms = .45359237 * weight; 
		double heightInchesToMeters = .0254 * height;
		double bodyMassIndex = weightPoundsToKilograms / (Math.pow(heightInchesToMeters, 2));
	
		System.out.print("BMI is " + bodyMassIndex);
	}
}
