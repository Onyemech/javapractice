import java.util.Scanner;

public class CreditCardValidator {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

			System.out.print("Hello, Kindly Enter Card details to verify  ");
			long number = input.nextLong();
			long realNumber = number;
			
			int checkCardType = getFirstDigit(realNumber);

			int lenght = String.valueOf(number).length();

			if(lenght != 13 && lenght != 14 && lenght != 15 && lenght != 16) {System.out.print("Invalid card\nPlease Try Again");
			}
			else {
				int oddElements = 0;
				int evenElements = 0;
				
				int [] arrayNumbers = new int[lenght];

				int []oddPosition = new int[lenght / 2];
				int []evenPosition = new int[lenght / 2];

				int sumOdds = 0;
				int sumEven = 0;

				
				for (int count = lenght - 1; count >= 0; count--) {
                			arrayNumbers[count] = (int)(number % 10); 
                			number = number / 10; 
          			  }
				for(int counter = 0; counter < arrayNumbers.length; counter++) {
					if(counter % 2 == 0) oddPosition[oddElements++] += arrayNumbers[counter];
					if(counter % 2 != 0) evenPosition[evenElements++] += arrayNumbers[counter];
	
					
				}
					for (int cout = 0; cout < oddPosition.length; cout++) {
						oddPosition[cout] = oddPosition[cout] * 2;
						if (oddPosition[cout] > 9) {
                   					oddPosition[cout] = sumOfDigits(oddPosition[cout]); 
                				}

					}

						for (int odd : oddPosition) {
							sumOdds += odd;
						}
						for (int even : evenPosition) {
							sumEven += even;
						}
			
					int total = sumEven + sumOdds;

					if (total  % 10 == 0 && checkCardType == 4) {

						String visaCard = "******************************\n"
                      								+ "**Credit Card Type : VisaCard\n"
                     								+ "**Credit Card Number: " + realNumber + "\n"
                    								+ "**Credit Card Digit Length : " + lenght + "\n"
                      								+ "**Credit Card Validity Status: Valid\n"
                      								+ "******************************";
						System.out.print(visaCard);
					} 
 
						else if(total  % 10 != 0 && checkCardType == 4){
    							String visaCard2 = "******************************\n"
                      								+ "**Credit Card Type :  Invalid card\n"
                     								+ "**Credit Card Number: " + realNumber + "\n"
                    								+ "**Credit Card Digit Length : " + lenght + "\n"
                      								+ "**Credit Card Validity Status: invalid\n"
                      								+ "******************************";
   							System.out.print(visaCard2);
						}



					if (total  % 10 == 0 && checkCardType == 5) {

						String masterCard = "******************************\n"
                      								+ "**Credit Card Type : MasterCard\n"
                     								+ "**Credit Card Number: " + realNumber + "\n"
                    								+ "**Credit Card Digit Length : " + lenght + "\n"
                      								+ "**Credit Card Validity Status: Valid\n"
                      								+ "******************************";
						System.out.print(masterCard);
					} 
 
						else if (total  % 10 != 0 && checkCardType == 5){
    							String masterCard2 = "******************************\n"
                      								+ "**Credit Card Type :  Invalid card\n"
                     								+ "**Credit Card Number: " + realNumber + "\n"
                    								+ "**Credit Card Digit Length : " + lenght + "\n"
                      								+ "**Credit Card Validity Status: invalid\n"
                      								+ "******************************";
   							System.out.print(masterCard2);
						}



					if (total  % 10 == 0 && checkCardType == 37) {

						String expressCard = "******************************\n"
                      								+ "**Credit Card Type : American Express Cards\n"
                     								+ "**Credit Card Number: " + realNumber + "\n"
                    								+ "**Credit Card Digit Length : " + lenght + "\n"
                      								+ "**Credit Card Validity Status: Valid\n"
                      								+ "******************************";
						System.out.print(expressCard);
					} 
 
						else if (total  % 10 != 0 && checkCardType == 37){
    							String expressCard2 = "******************************\n"
                      								+ "**Credit Card Type : American Express Cards\n"
                     								+ "**Credit Card Number: " + realNumber + "\n"
                    								+ "**Credit Card Digit Length : " + lenght + "\n"
                      								+ "**Credit Card Validity Status: invalid\n"
                      								+ "******************************";
							System.out.print(expressCard2);

						}

					if (total  % 10 == 0 && checkCardType == 6) {

						String discoverCard = "******************************\n"
                      								+ "**Credit Card Type : Discover cards\n"
                     								+ "**Credit Card Number: " + realNumber + "\n"
                    								+ "**Credit Card Digit Length : " + lenght + "\n"
                      								+ "**Credit Card Validity Status: Valid\n"
                      								+ "******************************";
						System.out.print(discoverCard);
					} 
 
						else if (total  % 10 != 0 && checkCardType == 6){
    							String discoverCard2 = "******************************\n"
                      								+ "**Credit Card Type : Invalid card\n"
                     								+ "**Credit Card Number: " + realNumber + "\n"
                    								+ "**Credit Card Digit Length : " + lenght + "\n"
                      								+ "**Credit Card Validity Status: invalid\n"
                      								+ "******************************";
							System.out.print(discoverCard2);

						}


			}

	}

		public static int sumOfDigits(int number) {

    			int firstDigit = number / 100;       
   			int secondDigit = (number / 10) % 10; 
    			int thirdDigit = number % 10;   
    
    			int sum = firstDigit + secondDigit + thirdDigit; 

  		  	return sum;
		}

		public static int getFirstDigit (long realNumber) {

			String convertNumToString = Long.toString(realNumber);
			char firstChara = convertNumToString.charAt(0); 
			char secondChar = convertNumToString.charAt(1); 

			int twoDigits = Character.getNumericValue(firstChara) * 10 + Character.getNumericValue(secondChar);

			if(twoDigits == 37) {
				return twoDigits;
			}
				else {
					String convertToString = Long.toString(realNumber);
					char firstChar = convertToString.charAt(0); 
					int firstDigit = Character.getNumericValue(firstChar); 

					return firstDigit;
				}
						
		}

}