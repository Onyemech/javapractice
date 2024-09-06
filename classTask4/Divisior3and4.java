public class Divisior3and4 {

	public static void main(String... args) {
	
		int count = 0;

		for (int counter = 100 ; counter <= 1000; counter++) {

		if (counter%3==0 && counter%4==0) counter++;
		System.out.print(counter + " ");

		if (counter%10 == 0) System.out.println();

		}
	
	}
}