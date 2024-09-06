import java.util.Scanner;

	public class MultipicationTable {

		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

			System.out.println("Enter Your Integer : ");
			int userNumber = input.nextInt();
				
			int counter = 1;

			int multiply = 0;

			for(;counter < 11; counter++)
		
				multiply = userNumber * counter;
			
				System.out.println(userNumber+ " x " +count+" = " +multiply);
	
	}
}