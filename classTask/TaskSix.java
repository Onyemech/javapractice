import java.util.Scanner;

public class TaskSix {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		int counter = 0;
		int average = 0;

		for (int count = 1; count < 11; count++) {

			System.out.println("Enter your score : ");
			int userNumber = input.nextInt();
				
			if (userNumber % 2 == 0) {
				counter += userNumber;
				average++;
			}
		}
		
		int result = counter / average;
			
		System.out.println("The average of even numbers in the scores you gave me is "+result);	

	
	}

}
