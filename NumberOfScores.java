import java.util.Scanner;

public class NumberOfScores   {

	public static void main (String... args) {
		
		Scanner input = new Scanner(System.in);

			System.out.print("Enter the number of scores you want to input : ");
			int numOfScores = input.nextInt();

			int [] scores = new int [numOfScores];
			int total = 0;
			int average = 0;
			
		for(int counter = 0; counter < scores.length; counter++) {
			System.out.print("Enter thy scores : ");
			scores[counter] = input.nextInt();
			total += scores[counter];
		average = total  /  scores[counter];
		}

			int largest = scores[0];
			int smallest = scores[0];

		for(int counter = 0; counter <  scores.length; counter++) {
			if (scores[counter] > largest)
				largest = scores[counter];
			if (scores[counter] < smallest)
				smallest = scores[counter];
			//System.out.println(" "+scores[counter]);

		}

			

			System.out.println(largest+" is your largest number");
			System.out.println(smallest+" is your smallest number");
			System.out.println(average+" is your average ");



	}

}