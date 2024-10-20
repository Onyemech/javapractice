public class TwoDArray {
	
	public static void main(String... args) {
		
		int [] [] arrayNumbers = new int [5] [5];
		
		for(int count = 0; count < arrayNumbers.length; count++) {
			for(int counter = 0; counter < arrayNumbers.length; counter++)
				System.out.print(arrayNumbers[counter] [counter]);
			System.out.println();
		}

	}

}