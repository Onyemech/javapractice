public class PrintStars {

	public static void main(String[] args) {
	
		for(int count = 5; count >= 1; count--) {

			for(int counter = 5; counter >= count; counter--)
				System.out.print("* ");
				System.out.println(" ");
		}
	}
}