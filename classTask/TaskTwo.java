import java.util.Scanner;

public class TaskTwo {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		int count = 1;
		int counter = 0;
		int average = 0;


		while (count < 11) {

			System.out.println("Enter your score : ");
			int userNumber = input.nextInt();
			count++;

			counter += userNumber;
			average++;
		
				
		}
			int finalResult = counter / average;

			System.out.printf("The average is %d " , finalResult);
	}

}
