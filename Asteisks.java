import java.util.Scanner;

public class Asteisks {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();

		for(int number1 = 0;number1 < number;number1++) {

			System.out.print("*");
			System.out.println( );
			for(int number2 = 0;number2 <= number1;number2++)
				System.out.println("* ");

					}
	}
}