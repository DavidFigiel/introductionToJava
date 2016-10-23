//Program converts pounds to kilograms

package chapter2;
import java.util.Scanner;

public class Exercise2_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number in pounds: ");
		
		double pounds = input.nextDouble();
		double kilogramsPerPound = .454;
		final double POUNDSTOKILOGRAMS = kilogramsPerPound * pounds;
		
		System.out.println(pounds + " pounds is " + POUNDSTOKILOGRAMS + " kilograms");
	}
}
