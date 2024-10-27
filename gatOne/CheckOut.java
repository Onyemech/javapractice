import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut {

	public static void main(String... args) {
		
		Scanner input = new Scanner(System.in);
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String formattedDateTime = currentDateTime.format(formatter); 


		System.out.println("What is the customer's Name ");
		String customerName = input.nextLine();

		String cashierChoice;
		int pieces = 0;
		int total = 0;
		
		ArrayList<String> nameOfItems = new ArrayList<>();
		ArrayList<Integer> numberOfUnit = new ArrayList<>();
		ArrayList<Double> pricePerUnit = new ArrayList<>();


		do {
			System.out.println("What did the user buy?");
			String itemName = input.nextLine();
			nameOfItems.add(itemName);
				
			System.out.println("How many pieces");
			int numberOfItems = input.nextInt();
			numberOfUnit.add(numberOfItems);

			pieces += numberOfItems;
			
			System.out.println("How much per unit?");
			double itemPrice = input.nextDouble();
			
			total += itemPrice;

			input.nextLine();

			System.out.println("Add more Items?");
			cashierChoice = input.nextLine();
		}
			while(cashierChoice.toUpperCase().equals("YES"));
				System.out.println("What is your name?");
				String cashierName = input.nextLine();

				System.out.println("How much discount will he get?");
				int discount = input.nextInt();

				System.out.println("Number of pieces : "+pieces);
				System.out.println("Number of unit : "+total);

				
			String displayResult = "SEMICOLON STORES\n" +
                       		"\tMAIN BRANCH\n" +
                       		"\tLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\n" +
                       		"\tTEL: 03293828343\n" +
                      		"\tDate: " + formattedDateTime + "\n" +
                       		"\tCashier: " + cashierName + "\n" +
                       		"\tCustomer Name: " + customerName + "\n" +
                       		"\t=============================================";
			System.out.println("\t" + displayResult);

		for (int result = 0; result < nameOfItems.size(); result++) {
    			System.out.println("\t" + nameOfItems.get(result) + " " + numberOfUnit.get(result));
		}
				
	}

}