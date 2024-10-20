/*
collect array 
declare a variable index 1
declare a variable index 2
declare a variable index 3
loop through the array 
if the number in index 0 is equal to 2 
increament index2
if the number in index 1 is equal to 3  
increament index3
if the number in index 2 is equal to 5 
increament index5
declare a variable mostOccurring and assign it to index2
loop through all index variable print mostOccuring 
Display results
*/

public class Mode {

	public static void main(String... args) {
		
		int [] myNumbers = {2, 2, 3, 5, 2};

		int [] result = array(myNumbers);

		for(int count = 0; count < result.length; count++) 
			System.out.print(" "+ result[count]);

		
	}
	public static int [] array (int []myNumbers) {
		
		int number2 = 0;
		int number3 = 0;
		int number5 = 0;

		
		for (int count = 0; count < myNumbers.length; count++) {
			if (myNumbers[count] == myNumbers[0]) {
				number2++;
			}

			if (myNumbers[count] == myNumbers[1]) {
				number3++;
			}

			if (myNumbers[count] == myNumbers[4]) {
				number5++;
			}
		}

			int []mostOccuring = {number2};

			if (number3 < mostOccuring[0] && number3 > number5);
			mostOccuring[0] = number3;

			if (number5 < mostOccuring[0] && number5 > number3);
			mostOccuring[0] = number5;

		return mostOccuring;

	}
}