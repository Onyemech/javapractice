/*
Declare Your function
create your array and the number of elements
declare the first index to be largest
loop through the array 
check for number that is greater than the largest
return largest 
*/

import java.util.Scanner;

public class LargestCheck {

	public static void main(String[] args) {

			System.out.print(Largest());
	}

    public static int Largest () {

			int[] array = new int[3];			

			 array[0] = 1;
			 array[1] = 9;
			 array[2] = 50;

			int largest = array[0];

		for(int count = 0; count < array.length; count++) {
			if (array[count] > largest) 
				largest = array[count];
			
 			
		}
		System.out.println("Largest number is ");

	return largest;
    }
	

}