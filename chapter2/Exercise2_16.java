//Program takes the side from a hexagon and 
//computes the hexagons area using an equation

package chapter2;
import java.util.Scanner;

public class Exercise2_16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		double area = (( 3 * Math.pow(3, .5) / 2) * Math.pow(side, 2));
		System.out.print("The are of the hexagon is " + area);
		
	}
}
