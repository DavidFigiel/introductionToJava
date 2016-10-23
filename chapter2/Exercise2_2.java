//Program computes the volume of a cylinder

package chapter2;

import java.util.Scanner;

public class Exercise2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius andlength of a cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		final double PI = 3.14159;
		
		double area = radius * radius * PI;
		double volume = area * length;
		
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}
