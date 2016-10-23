//Program asks user for three points of a triangle and 
//uses a formula to compute area of triangle from three points
//also to the absolute value.

package chapter2;
import java.util.Scanner;

public class Exercise2_19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three points for a triangle: ");
		double point1A = input.nextDouble();
		double point1B = input.nextDouble();
		double point2A = input.nextDouble();
		double point2B = input.nextDouble();
		double point3A = input.nextDouble();
		double point3B = input.nextDouble();
		double areaOfTriangle = Math.abs(((point1A * (point2B - point3B) + 
								point2A * (point3B - point1B) +
								point3A * (point1B - point2B)) / 2));
				
		System.out.print("The area of the triangle is " + areaOfTriangle);
	}
	
}
