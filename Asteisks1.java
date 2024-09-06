import java.util.Scanner;

public class Asteisks1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the number you want to print :");
			int number = scanner.nextInt();
			
			for(int number1 = 0;number1 <= number;++number1) {

				for(int number2 = 1;number2 <= number1;number2++)
					System.out.print(number2);
					System.out.println(" ");
			}
	}		
}