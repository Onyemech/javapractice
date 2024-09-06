import java.util.Scanner;

public class RandomNumber {

	public static void main(String... args) {

	Scanner input = new Scanner(System.in);

		
		int anyNumber = (int)(Math.random() *10);
	
		int minimum = 1;
		int maximum = 8;
		int rand = (int)(Math.random() * range) + min;


		do  {
			System.out.println("Enter any number from range 1 to 10");
			int anyNumber = input.nextInt();
	
				if (anyNumber > number) {
					System.out.println("Too high try again");
					
				}

				if (anyNumber < number) {
					System.out.println("Too low try again");
				
				}

				if (anyNumber == number) {
					System.out.println("Got lucky this time");
					break;
				}
				while (anyNumber != number) 
		}
	}
}