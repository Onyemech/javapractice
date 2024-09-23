import java.util.Scanner;

public class GuessNumber {

	public static void main (String... args)  {

		Scanner noEvidence = new Scanner(System.in);

		System.out.println("Hello dearie\nGuess the number from the range 1 to 1000\nPress 0 to Quit");
		
		int randomNumber = (int)(Math.random ()* 1000);

		int anyNumber;

		 	do {

			 anyNumber = noEvidence.nextInt();

				if (anyNumber > randomNumber) {
					System.out.print("To high try again : ");
				}
				if (anyNumber == randomNumber) {
						System.out.print("Got lucky this time ");
					break;
				}
				if (anyNumber < randomNumber) {
					System.out.print("To low try again : ");
				}
				if (anyNumber == 0) {
						System.out.print("You give up so easily");
					break;
				}

			}
		while(anyNumber != randomNumber);
		
	}
	
}