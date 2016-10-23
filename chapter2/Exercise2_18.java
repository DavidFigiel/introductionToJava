//Program asks for value a, b and prints table result of a to power of b
//while also casting the values into integers from float types.

package chapter2;
import java.util.Scanner;

public class Exercise2_18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a, b for a^2: ");
		
		float a = input.nextFloat();
		float b = input.nextFloat();
		float aPowerB = (int)Math.pow(a, b);
		
		System.out.print("a     b     aPowerB\n"
						+ (int)a +"     " + (int)b + "     " + aPowerB);
		
	}
	
}
