import java.util.Scanner;

public class LengthOfWords {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.println("Enter the word: ");
	String words = input.nextLine();

	System.out.println(countLett(words));

	}

}

public static int countLett (String words) {

	int result = words.length();

	return result;

}