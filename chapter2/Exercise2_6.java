//Program sums digits in an integer

package chapter2;
import java.util.Scanner;

public class Exercise2_6 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 1000: ");
		int enterInt = input.nextInt();
		int firstDigit = enterInt / 10 / 10 / 10;
		int secondDigit = enterInt / 10 / 10 % 10;
		int thirdDigit = enterInt / 10 % 10;
		int fourthDigit = enterInt % 10;
		int sumOfDigits = firstDigit + secondDigit + thirdDigit + fourthDigit;
		
		System.out.println("The sum of the digits is " + sumOfDigits);
	}
}
