

import java.util.Scanner;

public class PrimeNum {

	public static void main(String... args)  {

		Scanner input = new Scanner(System.in);
	
			System.out.print("Enter your number : ");
			int number = input.nextInt();

		
			even(number);
	

	}

	public static int isPrimeNumber (int number) {

		int counter = 0;
		
		for (int count = 1; count <= number; count++) {

			if (number % count == 0) {
				counter++;
				System.out.println(counter);
			}
		} return number;	
	}

	public static void even(int number) {
	
		int counter = 0;

		for (int count = 1; count <= number; count++) 

		
		if (number % count == 0)  {
			counter++;
			System.out.println(count);
		}
			else {
			    System.out.print(number+" is an odd number ");
			}

	}

}