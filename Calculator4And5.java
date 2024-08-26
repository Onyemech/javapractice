import java.util.Scanner;

public class Calculator4And5 {

    public static void main(String... args){

	Scanner calculator = new Scanner(System.in);

	System.out.print("Enter an integer : ");
	int anyInteger = calculator.nextInt();
	
	 if (anyInteger % 4 == 0 && anyInteger % 5 == 0) 
	    System.out.println(anyInteger + " is divisible by 4 and 5");

	if (anyInteger % 4 != 0 && anyInteger % 5 == 0) 
	    System.out.println(anyInteger + " is not divisible by 4 but divisible by 5");

	if (anyInteger % 4 == 0 && anyInteger % 5 != 0) 
	    System.out.println(anyInteger + " is not divisible by 5 but divisible by 4");

	if (anyInteger % 4 != 0 && anyInteger % 5 != 0) 
	    System.out.println(anyInteger + " is not divisible by 5 and 4");


	    
		

    }

}	