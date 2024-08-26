import java.util.Scanner;

public class Calculator4 {

       public static void main(String... args) {

	 Scanner input = new Scanner(System.in);
	
	     System.out.print("Enter an Integer: ");
	     int onlyNumber = input.nextInt();

	    	  if(onlyNumber % 4 == 0) {
		  System.out.println(onlyNumber + " is divisible by 4");


		  } else {
		       System.out.println(onlyNumber + " is not divisible by 4");

	      }
		
        }


}