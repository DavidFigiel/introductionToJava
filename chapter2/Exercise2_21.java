//Program asks for an investment amount as well as an annual interest rate
//and number of years and then calculates a monthly rate and returns a total
//sum with interest added to initial investment amount. 

package chapter2;
import java.util.Scanner;

public class Exercise2_21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 12 / 100;
		System.out.print("Enter number of years: ");
		int numberOfYears = input.nextInt();
		
		double futureInvestmentValue = investmentAmount * (Math.pow((1 + monthlyInterestRate), (numberOfYears * 12)));
		
		System.out.print("Accumulated value is $" + futureInvestmentValue);
		
	}
}
