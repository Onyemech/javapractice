public class FourAsterisks {

	public static void main(String... args) {

		/*for (int count = 1; count <= 5; count++) {
			for (int counter = 1; counter <= count; counter++)
			System.out.print("*");
			System.out.println();*/

		for (int count1 = 1; count1 <= 5; count1++) {

			for (int count = 1; count <= count1; count++) 
			{
				System.out.print(" ");
			}

			for (int counter = 5; counter >= count1;  counter--) 
			{
				System.out.print("*");
			}
			
			
			System.out.println();
		}
			
	}

}