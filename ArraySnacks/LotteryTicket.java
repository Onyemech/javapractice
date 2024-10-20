import java.util.Random;
import java.util.Scanner;

public class LotteryTicket {

	public static void main(String [] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		System.out.print("Hello \nEnter your name : ");	
		String userName = input.nextLine();

			String options = """
			1. Adition
			2. Subtraction
			3. Multiplication
			4. Division
			""";

			System.out.print("Welcome to my program "+userName+" \nSelect any of the operation you wish to perform : \n"+options);	
			int userInput = input.nextInt();

			switch (userInput) {
		
				case 1 : 
					int count = 5;
					int score = 0;

					System.out.println("Welcome to the addition program you have "+count+" tries "); 
					
					do {
						int firstNumber = random.nextInt(50);
						int secondNumber = random.nextInt(30);
						int answer = firstNumber + secondNumber;
				
						System.out.print("What is the sum of "+firstNumber+" and " +secondNumber+" : ");
						int userAnswer = input.nextInt();

						if (userAnswer == answer) {
							count--;
							score++;
						}

					} 
					if(score == 5)System.out.print("You score is "+score+" " +userName+" are indeed a legend");						
					while(count != 0)
					
					break;

				case 2 :
					int count2 = 5;

				
			}
	
	}
		/*public static float addition( ){
		
		}*/
}