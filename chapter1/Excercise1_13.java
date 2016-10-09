//Uses Cramer's rule in algebra to solve a 2 x 2 linear equation

package chapter1;

public class Excercise1_13 {

	public static void main(String[] args) {
		//double x,y;
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = .55;
		double f = 5.9;	
		double e = 44.5;
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		
		
	System.out.println("x = " + x);
	System.out.println("y = " + y);
	
		//finish later
	}
}
