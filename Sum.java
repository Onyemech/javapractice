import java.util.Scanner;

public class Sum {

	public static void main(String... args) {
	
		Scanner input = new Scanner(System.in);
		
				System.out.println("Enter a number: ");
				int userNumber = input.nextInt();
				
				int userInput = 0;
				
		while (userInput <= userNumber)  {
				
				System.out.println("Enter another number: ");
				userInput = input.nextInt();

				//userInput += userInput;
			if (userInput >= userNumber) {
				System.out.println(userInput +" is greater than or equal to " + userNumber);
				break;
			}
		}
	}
}