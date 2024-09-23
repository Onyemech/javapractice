import java.util.Scanner;

public class AsteriskDisplay {

	public static void main(String[] args) {

		Scanner phaseGate = new Scanner(System.in);
		
			System.out.print("Enter the number of square you want to print in asterisks form : ");
			int userInput = phaseGate.nextInt();
		
		asteriskSquare(userInput);

		
	}
	public static void asteriskSquare (int userNumber) {
	
		for (int count = 1; count <= userNumber; count++)  {
			for (int counter = 1; counter <= userNumber; counter++) 
				System.out.print("*");
				System.out.println(" ");

		}
	}

}