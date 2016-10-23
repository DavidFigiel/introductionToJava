//Program asks for balance and interest rate and calucates and
//returns the next months interest rate. 

package chapter2;
import java.util.Scanner;

public class Exercise2_20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double interest = input.nextDouble();
		double interestNextMonth = balance * (interest/1200);
		
		System.out.print("The interest is " + interestNextMonth);
		
	}
}
