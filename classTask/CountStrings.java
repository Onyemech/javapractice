import java.util.Scanner;

public class CountStrings {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter the word: ");
        String words = input.nextLine();

        System.out.println(countLetter(words));
    }

    public static int countLetter(String words) {

        int number = words.length();

        return number;
    }
}
