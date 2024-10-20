import java.util.Scanner;

public class CheckEmptyArray {

	public static void main(String[] args) {
		
		Scanner put = new Scanner(System.in);
			System.out.print("How many numbers do you want to collect?  ");
			int userNumber = put.nextInt();
			
			int [] storage = new int[userNumber];
	
			for(int count = 0; count < storage.length; count++) {

				System.out.print("Enter the numbers : ");
				int userInput = put.nextInt();

				storage[count] += userInput;

			System.out.println("Numbers are "+storage[userInput]);
		
			}
			
	}
}