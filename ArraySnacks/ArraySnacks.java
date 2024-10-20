import java.util.Scanner;

public class ArraySnacks {

	public static void main(String[] args) {
		
		Scanner put = new Scanner(System.in);

		System.out.print("How many list of numbers are you : ");
		int number = put.nextInt();

		int [] array = new int [number];

		for (int count = 0; count < array.length; count++) {

			System.out.print("Enter the number : ");
			int userNumber = put.nextInt();

			System.out.print("Enter the number : ");
			int userInput = put.nextInt();

				if (array[count] == userInput) {
					System.out.print("True");
				}

					else {
						System.out.print("False");
					}
		}
			

			
	}
	
		
	public static int oddPosition () {
			
			int [] set = {1, 2, 3, 4, 5};

			for(int count = 0; count < set.length; count++) {
				if (set[count] % 2 != 0) System.out.print(" "+set[count]);
			}
			
			return 0;
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
	
	/*public static int element (int number ) {
		
		
	}*/

	

}