import java.util.Scanner;

public class Kata {

	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your Number: ");
		double firstNumber = scanner.nextDouble();
		
		System.out.println(isSquare(firstNumber));
			
		}
		public static int evenOddCalculator (int userNumber) {

			if (userNumber % 2 == 0) {
	            		System.out.println("This is an even number");
			}
	    	  	    else {
	            		System.out.println("This is an odd number");
			    }
				return userNumber;
	    	  	    
		}
		public static boolean primeNumberCheck (int useNumber) {
		
			int counter = 0;
		
			for(int i = 1; i <= useNumber; i++) {
				if (useNumber % i == 0) {
					counter += 1;
				}
			
			}		

				if (counter == 2) {
					return true;
				}  
		
					else  {
					return false;
					}
		}

		public static int subtract(int firstNumber , int secondNumber) {

			int answer = Math.abs(firstNumber - secondNumber);

			return answer;

		
		}

		public static float divideNumbers(float firstNumber , float secondNumber) {
	
			float divide = firstNumber / secondNumber;

			System.out.println("Your answer is "+ divide);
		
			return divide;	

		}

		public static int factor (int userNumber) {

			int count = 0;

			for (int j = 1; j <= userNumber;j++) {
		
				if (userNumber % j == 0) {
				count++;
				}

			}
				System.out.println("The factors of "+ userNumber + " is " +count);
			
			return count;

		}
		
		public static boolean isSquare(double userInput) {

			double finalInput = Math.sqrt(userInput);

			if (finalInput * finalInput == userInput) {
		
				return true;
			}				
		
				else {
			
					return false;
				}
		}

		public static int isPalne(int userNumber) {

		   
				int firstNumber = userNumber / 10;
				int secondNumber = userNumber % 10;

				int thirdNumber = firstNumber % 10;
				int forthNumber = firstNumber / 10;
	
				int allNumber = (secondNumber * 100) + (thirdNumber * 10) + (forthNumber);

				if (userNumber == allNumber) {
		
					System.out.printf("%d is a palindrome" , userNumber);
				}
					else {
						System.out.printf("%d is not a palindrome", userNumber);
					}
					return userNumber;
		}
}