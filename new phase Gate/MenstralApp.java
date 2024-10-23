import java.util.*;

public class MenstralApp {

	public static void main(String... args) {
	
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Welcome to my menstration cycle calculator \nPlease Enter your name : ");
			String userName = input.nextLine();

			System.out.print("Dear "+userName+" please enter your age : ");
			int userAge = input.nextInt();

			if (userAge < 8 || userAge > 50) {
				System.out.print("Dear "+userName+" This is not normal\n please consult your doctor\nThank you for using our mobile app");
			}
				
				else {
					System.out.print("Enter the first Day of last period : ");
					int menstrationStart = input.nextInt();

					System.out.print("Enter the length of your menstral Cycle : ");
					int menstrationCycle = input.nextInt();

						if(menstrationCycle < 28 && menstrationCycle > 35) {
							System.out.print("consult your doctor : ");
						}
							else {
								getNextMensDate(menstrationCycle, menstrationStart);
							}
					
				}

		}
			catch(Exception e) {System.out.print("Invalid input\nTry again");}
	}
		public static void getNextMensDate (int menstrationCycle, int menstrationStart) {

			int newMenstrationDate = menstrationCycle - menstrationStart;
			int ovulationDate = menstrationCycle - 14;
			int ovulationDateEnd = ovulationDate + 14;
			int safeperiodStart = menstrationStart + 1;
			int safeperiodEnd = menstrationStart + 7;
			
			System.out.println("Your next flow date is "+newMenstrationDate);
			System.out.print("Your ovulation starting date is "+ovulationDate+" and ends on "+ovulationDateEnd);
			System.out.print("Your safe period start from "+safeperiodStart+" and ends on "+safeperiodEnd);
			
		}
}