import java.util.Scanner;

public class SquarRoot {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Your Integer: ");
        int number = input.nextInt();

        squareRoot(number);
    }

    public static void squareRoot(int number) {

        double result = Math.sqrt(number);

        System.out.printf("Square root of %d is: %.2f%n", number, result);
    }
}

