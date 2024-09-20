public class TickTack {

	public static void main(String[] args) {

		char [] [] set = {{'x','o','x'},{'o','o','o'},{'x','o','x'}};

		for (int counter = 0; counter < set.length; counter++) {
			
			for (int innerCount = 0; innerCount < set.length; innerCount++)
				System.out.print(set[counter]+" "+[innerCount]);

		System.out.println();
		}
		
	}

}