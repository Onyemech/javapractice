import java.util.*;

public class Task25B {

	public static void main(String... args) {
		
		//int [] numbers = {2, 3, 5, 7, 8};

		for (int count = 1; count <= 10; count++) {
			for (int counter = 1; counter <= count; counter++) {
				System.out.print(" ");	
			}
			
			for (int counter = 1; counter <= count; counter++) {
				System.out.print("*");	
			}

				
			/*for (int counter = 10; counter >= count; counter--) {
				System.out.print("*");	
			}*/

		 	System.out.println();
		} 
	}
}