//Program calculates tips at entered gratuity rate

package chapter2;
import java.util.Scanner;

public class Exercise2_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
			
		double tipAmount = (gratuity * .10) * (subtotal * .10);
		double total = subtotal + tipAmount;
		
		System.out.println("The gratuity is $" + tipAmount + " and total is $" + total);
	}
}
