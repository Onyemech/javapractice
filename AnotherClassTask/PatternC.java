public class PatternC {

	public static void main(String[] args) {

		for(int count = 1;count <= 5;count++) {

			for(int counter = 1; counter <= count; counter++) {
				System.out.print(" ");
			}
			for(int star = 5; star >= count; star--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}