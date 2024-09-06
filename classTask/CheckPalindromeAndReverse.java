import java.util.Scanner;

public class CheckPalindromeAndReverse {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
	
			System.out.println("Enter three integer: ");
			int userNumber = input.nextInt();

		    System.out.print(int isPalindrome(int userNumber));

	}

		public static int reverse (int number) {

			int number1 = number % 10;
			int secondNumber = number / 10;
			int number2 = secondNumber % 10;
			int number3 = secondNumber / 10;

			int reverse = (Number1 * 100) + (Number2 * 10) + Number3;
	
			return reverse;

		}
		
		public static boolean isPalindrome (int number) {

			int number1 = number % 10;
			int secondNumber = number / 10;
			int number2 = secondNumber % 10;
			int number3 = secondNumber / 10;

			int reverse = (Number1 * 100) + (Number2 * 10) + Number3;

			if (reverse == number) {
				return true;
			}
			    else {
				return false;
			    }
		}

}