public class OddCheck {

	public static void main(String... args) {
		System.out.println(oddPosition());
	}

		public static int oddPosition () {
			
			int [] set = {1, 2, 3, 4, 5};

			for(int count = 0; count < set.length; count++) {
				if (set[count] % 2 != 0) System.out.print(" "+set[count]);
			}
			
			return 0;
		}
}
