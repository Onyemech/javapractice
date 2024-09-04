import java.util.Scanner;

public class Decryption {

	public static void main(String... args) {
	
		Scanner input = new Scanner(System.in);

			System.out.println("Enter the four digit number: ");
			int fourDigits = input.nextInt();

			int firstDigit = fourDigits / 10;
			int secondDigit = fourDigits % 10;
			int thirdDigit = firstDigit % 10;
			int fourthDigit = firstDigit / 10;
			int fifthDigit = fourthDigit % 10;
			int sixthDigit = fourthDigit / 10;

			
			int firstEncrypt = (secondDigit - 7) % 10;
			int secondEncrypt = (thirdDigit - 7) % 10;
			int thirdEncrypt = (fifthDigit - 7) % 10;
			int fourthEncrypt = (sixthDigit - 7) % 10;

			int finalEncryption = (firstEncrypt * 1000) + (secondEncrypt * 100) + (thirdEncrypt * 10) + fourthEncrypt;

			int finalDecryption = (secondDigit * 1000) + (thirdDigit * 100) + (fifthDigit * 10) + sixthDigit;
			
			System.out.printf("Encrypted new for digit are  %d%n" ,finalEncryption);
			System.out.printf("Your digit before Encryption %d" ,fourDigits);

			
	}
}