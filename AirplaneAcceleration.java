/*
prompt user for the first Integer
store as intialVelocity
prompt user for the second Integer
store as final velocity
prompt user for the third integer 
store as time taken
Calculate is the acceleration by subtracting final velocity from the initial velocity and dividing by time
Display results
*/
import java.util.Scanner;

public class AirplaneAcceleration {

	public static void main(String... args){

		Scanner plane = new Scanner(System.in);

			System.out.println("Enter first integer: ");
			int initialVelocity = plane.nextInt();

			System.out.println("Enter second integer: ");
			int finalVelocity = plane.nextInt();

			System.out.println("Enter third integer: ");
			int timeTaken = plane.nextInt();

			int acceleration = (finalVelocity - initialVelocity) / timeTaken;

			System.out.println("The airplane acceleration is " + acceleration);


	}

}