//Program is a financial application that takes a value you save monthly
//as well as an annual interest rate and then returns the compound value
//after six months.

package chapter2;
import java.util.Scanner;

public class Exercise2_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly saving amount and annual interest rate: ");
		double monthlySavingAmount = input.nextDouble();
		double interest = input.nextDouble();
		double annualInterestRate = interest * .01 / 12;
		
		double firstMonth = monthlySavingAmount * (1 + annualInterestRate);
		double secondMonth = (monthlySavingAmount + firstMonth) * (1 + annualInterestRate); 
		double thirdMonth = (monthlySavingAmount + secondMonth) * (1 + annualInterestRate);
		double fourthMonth = (monthlySavingAmount + thirdMonth) * (1 + annualInterestRate);
		double fifthMonth = (monthlySavingAmount + fourthMonth) * (1 + annualInterestRate);
		double sixthMonth = (monthlySavingAmount + fifthMonth) * (1 + annualInterestRate);
	
		System.out.print("After the sixth month, the account value is $" + sixthMonth);
	}
}
