//Program takes the distance to be driven, the miles per gallon
//and the price per gallon and computes the cost to drive that
//distance in miles per gallon.

package chapter2;
import java.util.Scanner;

public class Exercise2_23 {


	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the driving distance: ");
	double drivingDistance = input.nextDouble();
	System.out.print("Enter miles per gallon: ");
	double milesPerGallon = input.nextDouble();
	System.out.print("Enter price per gallon: ");
	double pricePerGallon = input.nextDouble();
	double costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;
	System.out.print("The cost of driving is $" + costOfDriving);

	}
}