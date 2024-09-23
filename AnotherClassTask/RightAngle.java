import java.util.Scanner;

public class RightAngle {

	public static void main(String... args) {

	Scanner pain = new Scanner(System.in);
	
		System.out.println("Enter side 1 : ");
		double side1 = pain.nextDouble();

		System.out.println("Enter side 2 : ");
		double side2 = pain.nextDouble();

		System.out.print(hypothesisCalculator (side1,side2));
		
	}
	public static double hypothesisCalculator (double firstSide , double secondSide) {

		double side3 = Math.sqrt(Math.pow(firstSide, 2)+ Math.pow(secondSide, 2));
		
		return side3;
	}
	
}