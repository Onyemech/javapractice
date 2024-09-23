import java.util.Scanner;

public class RandomNumber {

	public static void main(String... args) {

	Scanner input = new Scanner(System.in);

		
		int randomNumber = (int)(Math.random() *10);
	
		int minimum = 1;
		int maximum = 8;
		//int rand = (int)(Math.random() * range) + min;

		int anyNumber;

		do  {
			System.out.println("Enter any number from range 1 to 10");
			anyNumber = input.nextInt();
	
				if (anyNumber > randomNumber) {
					System.out.println("Too high try again");
					
				}

				if (anyNumber < randomNumber) {
					System.out.println("Too low try again");
				
				}

				if (anyNumber == randomNumber) {
					System.out.println("Got lucky this time");
					break;
				}
				
		}
				while (anyNumber != randomNumber) ;
	}
}