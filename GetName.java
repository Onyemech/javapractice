import java.util.Scanner;

public class GetName {

	public static void main(String... args) {

	Scanner collect = new Scanner(System.in);

		int x = 5;
		int y = 1;

		System.out.print(getUserName(x,y));
	
	}

	public static int getUserName (int x , int y) {

		//System.out.printf("x = %d%n", x + 5);

		return x + 5;

 		System.out.printf("Value of %d *%d is %d\n", x, y, (x * y) );
 		//System.out.printf("x is %d and y is %d", x, y);
	//System.out.printf("%d is not equal to %d\n", (x + y), (x * y) );

	}
}