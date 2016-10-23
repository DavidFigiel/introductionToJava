//Program uses Geometry formula to compute the distance
//between two points

package chapter2;
import java.util.Scanner;

public class Exercise2_15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double distanceOfTwoPoints = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), .5); 
		
		System.out.print("The distance between the two points is " + distanceOfTwoPoints);
	}
}
