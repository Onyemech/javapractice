/*
Collect users name
Ask them twenty questions
store all there responses
Ensure that users only enter the letter A and B
Display results 
*/

import java.util.*;

public class MBTI {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);

			System.out.println("What is your name?");
			String username = input.nextLine();

			String [] options = new String[20];
			options[1] = "A. tough-minded, just ";
			options[2] = "B. tender-hearted, merciful";

			System.out.print(options[1] +"	"+options[2]);
			char userChoice = input.next().charAt(0);
			
			char newUserChoice = Character.toUpperCase(userChoice);

			if (newUserChoice != 'A' || newUserChoice != 'B') {
				System.out.println("Expected A or B as Response\nI know this is an error, Please retry again\na.Focus on here-and-now	B.look to the future, global perspective,  big picture");
			}

	}

}