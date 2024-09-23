import java.util.Scanner;

public class TaskEight {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		int counter = 0;

		for (int count = 1; count < 11; count++) {

			System.out.println("Enter your score : ");
			int userNumber = input.nextInt();
				
			if (userNumber >= 0 && userNumber <= 100 ) {
				counter += userNumber;
			}
		}
					
		System.out.println("The sum of your positive numbers in the scores you gave me is "+counter);	

	
	}

}
