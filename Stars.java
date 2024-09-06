import java.util.Scanner;

public class Stars {

	public static void main(String... args) {
	
	Scanner star = new Scanner(System.in);

		System.out.println("Enter the number the base of Triangle: ");
		int userInput = star.nextInt();
		
		for(int number1 = 0;number1 <= userInput;number1++) {

				System.out.println(" ");

			for(int number2 = 1;number2 <= number1;number2++)

					System.out.print("* ");
					System.out.println(" ");
		}
	}
}