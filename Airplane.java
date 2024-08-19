import java.util.Scanner;

public class Airplane {

	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter plane Speed : ");
	int speed = input.nextInt();

	System.out.print("Enter plane acceleration : ");
	float acceleration = input.nextInt();

	float minimumRunway = (speed * speed) /
	(2 * acceleration);

	System.out.printf("Minimum Runway length for airplane is : %.3f" , minimumRunWay);






	}



}