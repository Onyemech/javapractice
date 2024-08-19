import java.util.Scanner;

public class AdditionOfTwoIntegers {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	String name = "Yes";
	
		do {
		System.out.println("Enter your first number : ");
		int number1 = scanner.nextInt();

		System.out.print("Enter your second number : ");
		int number2 = scanner.nextInt();
		
		int sum = number1 + number2;

		System.out.printf("Your sum is %d , sum");
		System.out.println("Do you wish to perform the calculation again?Yes/nor/nNo ");
		String choice = scanner.nextLine();
	 
      		}while (choice == yes);   
   }
}	