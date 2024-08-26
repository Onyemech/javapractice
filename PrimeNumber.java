import java.util.Scanner;

public class PrimeNumber {

	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int userNumber = input.nextInt;

		int primeChecker = 2;
		
		if (userNumber % primeChecker == 0) {
		System.out.println(userNumber +" is not a prime number");

		} else {
		System.out.println(userNumber +" is a prime number");

		}


	}

}

/*
prompt user for the number
store the number as userNumber
declare a variable named primeChecker
initialize it to the value 2
if the userNumber can be divided by 2 without a remender
Display results
*/