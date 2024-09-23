import java.util.Scanner;

public class TaskOne {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

		int count = 1;
		int counter = 0;


		while (count < 11) {

			System.out.println("Enter your score : ");
			double userNumber = input.nextInt();
			count++;
			counter += userNumber;
			
				
		}
			System.out.printf("The sum is %d " , counter);
	}

}

