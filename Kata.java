import java.util.Scanner;

public class Kata {

	public static void main(String... args) {

	Scanner oddOrEvenNumber = new Scanner(System.in);

		System.out.println("Enter an Integer: ");
		int userNumber = oddOrEvenNumber.nextInt();
		
		primeCheck(userNumber);

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

		public static void primeCheck (int userInput) {

			int counter = 0;
			
			for(int count = 1;count <= userInput;count++) {
		 
				if (userInput % count == 0) {
				System.out.println("This are the factors of "+ userInput +" they are "+ counter );

					counter++;

				}

			}

			//System.out.println("This are the factors of "+ userInput +" they are "+ counter );
			 System.out.println("This does not have factors ");

		}


}