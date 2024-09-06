import java.util.Scanner;

public class Reverse {

    	public static void main(String... args) {

        	Scanner input = new Scanner(System.in);

        	System.out.println("Please Enter four integers: ");

        	int count = 0;

        while (count < 4) {

            	int userNumber = input.nextInt();

            if (userNumber < 1000 || userNumber > 9999) {

                	System.out.println("Invalid input: ");
                	continue;
            }
            	reverse(userNumber);
            		count++;
        }
   x

    	public static void reverse(int number) {

        	int number1 = number % 10;
        	int secondNumber = number / 10;
       		int number2 = secondNumber % 10;
        	int thirdNumber = secondNumber / 10;
        	int number3 = thirdNumber % 10;
        	int number4 = thirdNumber / 10;

        	int reverse = (number1 * 1000) + (number2 * 100) + (number3 * 10) + number4;

        	System.out.print(reverse + " ");
    	}
}
