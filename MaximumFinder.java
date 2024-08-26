import java.util.Scanner;

public class MaximumFinder {

	public static void main(String[] args){

	    Scanner input = new Scanner(System.in);

		System.out.print("Enter three integer's values and separate by spaces: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		int total = maximum(number1, number2, number2);

		System.out.println("Maximum is "+ total);

	
	}
		public static int maximum(int x,int y,int z) {
		int maximumInt = x;

		if (y > maximumInt) {
		maximumInt = y;
		}
		if (z > maximumInt) {
		maximumInt = z;
		}
		return maximumInt;

		}


}	