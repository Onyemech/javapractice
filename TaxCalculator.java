import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
				System.out.print("Enter name of Citizen : ");
				String name = input.nextLine();
		
				System.out.println("Enter your earnings : ");
				int earnings = input.nextInt();
			
					if (earnings < 30000) {
					
						int taxRate = 15;
					
						double totalTax = (taxRate / 100.0) * earnings; 
					
						System.out.println(name +" total tax for the year is "+ totalTax);
	
					}

					if (earnings >= 30000) {
					
						int tax = 20;
					
						double total = (tax / 100.0) * earnings; 

						System.out.println(name +"'s total tax for the year is "+ total);
	
					}

		}
}

/*
prompt for citizen name 
store as name of citizen
prompt for citizen earnings
store as earnings
declare the variable tax and assign the value 15 to it
Calculate the tax by dividing 

*/