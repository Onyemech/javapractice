import java.util.Scanner;

public class LeapCheck {

	public static void main(String[] args) {

	Scanner deCollectAsap = new Scanner(System.in);

	System.out.println("Enter the year you want to check if its a leap year: ");
	int userNumber = deCollectAsap.nextInt();

		/*if (userNumber < 1000 || userNumber > 9999)
			System.out.print("Number cannot be checked "); 
			break;*/
			
		
		
		if (userNumber >= 1000 || userNumber <= 9999) {
			System.out.print(leapChecker(userNumber));
		}
			else {
				System.out.print("Please enter a four digit number");
				break;
			}
			
	}


	public static int leapChecker (int userInput) {

		int numberCheck = 4;

		if (userInput % numberCheck == 0)  {
			System.out.println("Its a leap year ");
		}
			else {
				System.out.println("Its not a leap year ");
			}
		return userInput;
	}

}