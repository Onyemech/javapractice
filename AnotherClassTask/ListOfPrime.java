import java.util.Scanner;

public class ListOfPrime {

	public static void main(String... args) {

	Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your number that you want to check if its prime");
		int userNumber = input.nextInt();

		primeCheck(userNumber);
	}

public static void primeCheck (int userNumber) {

	int counter;

	for (int count = 1; count <= userNumber; count++) {
		counter = 0;

		for (int count2 = 2; count2 <= count / 2; count2++) {

				if (count % count2 == 0) {
					counter++;
					break;
				}
			
		}

		if (counter == 0)  {
			System.out.println(count);
		}
	}
}
public static void oddEven (int userInput)  {

	for (int count = 1; count <= userInput; count++) {
		if (count % 2 == 0) 
			System.out.print(" "+count);
		if (count % 20 == 0) 
			System.out.println();
	}
		

}

}
