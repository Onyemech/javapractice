import java.util.Scanner;

public class CheckOut {

	public static void main(String... args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the customer's Name ");
		String customerName = input.nextLine();

		do {
			System.out.println("What did the user buy?");
			String itemName = input.nextLine

			System.out.println("How many pieces");
			int numberOfItems = input.nextInt();
			
			System.out.println("How much per unit?");
			double itemPrice = input.nextDouble();
	
			System.out.println("Add more Items?");
			String cashierChoice = input.nextLine();
		}
		
	}

}