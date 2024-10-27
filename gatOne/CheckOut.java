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
		ArrayList<Double> totalPrice = new ArrayList<>();
		double subTotal = 0;

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
			pricePerUnit.add(itemPrice);

			total += itemPrice * numberOfItems;

			double totalCost = itemPrice * numberOfItems;
			totalPrice.add(totalCost);
			
			input.nextLine();

			System.out.println("Add more Items?");
			cashierChoice = input.nextLine();
		}
			while(cashierChoice.toUpperCase().equals("YES"));
				System.out.println("What is your name?");
				String cashierName = input.nextLine();

				System.out.println("How much discount will he get?");
				int discountPrice = input.nextInt();
			
				double discount = total * discountPrice / 100;
				double vat = total * 17.5 / 100;
				
				for (double price : totalPrice) {
    					subTotal += price;
				}
			
				double billTotal = subTotal - discount + vat;
				
			String displayResult = "SEMICOLON STORES\n" +
                       		"\tMAIN BRANCH\n" +
                       		"\tLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\n" +
                       		"\tTEL: 03293828343\n" +
                      		"\tDate: " + formattedDateTime + "\n" +
                       		"\tCashier: " + cashierName + "\n" +
                       		"\tCustomer Name: " + customerName + "\n" +
                       		"\t=============================================";
			System.out.println("\t" + displayResult);
			System.out.println("\tITEM	QTY	PRICE	TOTAL(NGN)");
			System.out.println("\t---------------------------------------------");

		for (int result = 0; result < nameOfItems.size(); result++) {
    			System.out.println("\t" + nameOfItems.get(result) + "	" + numberOfUnit.get(result)+ "	"+pricePerUnit.get(result)+"	"+totalPrice.get(result));
		}
			System.out.println("\t---------------------------------------------");
		String output2 = "\tSub Total: "+subTotal+"\n"+
			"\tDiscount: "+discount+"\n"+
			"\tVAT @ 17.50%: "+vat+	"\n"+
			"\t=============================================";
		System.out.println(output2);
		System.out.println("\tBill Total:	"+billTotal);

		System.out.println("\t=============================================");
		System.out.println("\tTHIS IS NOT AN RECEIPT KINDLY PAY "+billTotal);
		System.out.println("\t=============================================");
		
		System.out.println("How much did the customer give to you?");
		double customerAmount = input.nextDouble();
		
		if(customerAmount > billTotal) {
			double balance = customerAmount - billTotal;

			String displayResult2 = "SEMICOLON STORES\n" +
                       		"\tMAIN BRANCH\n" +
                       		"\tLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.\n" +
                       		"\tTEL: 03293828343\n" +
                      		"\tDate: " + formattedDateTime + "\n" +
                       		"\tCashier: " + cashierName + "\n" +
                       		"\tCustomer Name: " + customerName + "\n" +
                       		"\t=============================================";
			System.out.println("\t" + displayResult2);
			System.out.println("\tITEM	QTY	PRICE	TOTAL(NGN)");
			System.out.println("\t---------------------------------------------");

		for (int result = 0; result < nameOfItems.size(); result++) {
    			System.out.println("\t" + nameOfItems.get(result) + "	" + numberOfUnit.get(result)+ "	"+pricePerUnit.get(result)+"	"+totalPrice.get(result));
		}
			System.out.println("\t---------------------------------------------");
		String display = "\tSub Total: "+subTotal+"\n"+
			"\tDiscount: "+discount+"\n"+
			"\tVAT @ 17.50%: "+vat+	"\n"+
			"\t=============================================";
		System.out.println(display);
		System.out.println("\tBill Total:	"+billTotal);
		System.out.println("\tAmount Paid:	"+customerAmount);
		System.out.println("\tBalance:	"+balance);

		System.out.println("\t=============================================");
		System.out.println("\tTHANK YOU FOR YOUR PATRONAGE ");
		System.out.println("\t=============================================");
		
		
			
		}

		else if(customerAmount < billTotal) {System.out.print("Invalid payment amount!!!");}
	}

}