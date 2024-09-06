import java.util.Scanner;

public class MyPrime {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number you want to check if its prime: ");
		int number = input.nextInt();

		primeNumber(number);
		
	

	}
	
	public static void primeNumber (int userInput) {

		int count = 0;
	
		for(int counter = 1; counter <= userInput; counter++) {
	
			if (userInput % counter == 0) {
				count++; 
			}

		}
	
			if (count == 2)  {
				System.out.print(userInput + " is a prime number"); 
			}

			else {
				System.out.print(userInput + " is not a prime number"); 

			}
			

	}

	
}