import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter a positive Integer : ");
	    int positiveNum = scanner.nextInt();
	
	    for (int count = 1; count <= positiveNum; count++) {

	    if (positiveNum % count == 1) {
	    System.out.println(positiveNum + " is not prime number.");


	    } 
	   
	 }

     }
}