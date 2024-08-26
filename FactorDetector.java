import java.util.Scanner;

public class FactorDetector {

	public static void main(String... args) {

		Scanner factor = new Scanner(System.in);


			System.out.print("Enter an Integer: ");
			int userNumber = factor.nextInt();

			int counter = 0;
		
			for (int count = 1;count <= userNumber;count++) {

				if(userNumber % count == 0) {
				    counter+=1;
					
				}
					System.out.println(userNumber+  "has" + counter + " factors");

			}

			//System.out.printf(" ");

	}

}


/*
prompt user for the number
store the number as userNumber


*/