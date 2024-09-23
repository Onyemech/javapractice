import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

			System.out.print("Enter your census : ");
			double census = scanner.nextDouble();

			double faherhient = (9 / 5) * (census + 32);

			System.out.printf("Your fahrenheit is %.2f ",faherhient);

	}
}