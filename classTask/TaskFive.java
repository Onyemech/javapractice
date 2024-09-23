import java.util.Scanner;

public class TaskFive {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
		
		int counter = 0;

		
		for (int count = 1; count < 11; count++) {

			System.out.println("Enter your score : ");
			int userNumber = input.nextInt();
				
			if (userNumber % 2 == 0) {
				counter += userNumber;
			}
			
		System.out.println("The sum of even numbers is "+counter);	

		
	}

}
