public class NestedLoops {

	public static void main(String... args) {
	
		for(int count = 0;count < 5; count++) {
		
			for (int counter = 0;counter < 3; counter++) {
			    System.out.printf("%d\n" , counter);
			}
			    System.out.println( );
		}
	}
}