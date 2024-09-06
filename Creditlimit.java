import java.util.Scanner;

public class Creditlimit {

	public static void main (String... args) {

	Scanner scanner = new Scanner(System.in);

		System.out.println("Enter account Number : ");
		int account = scanner.nextInt();

		System.out.println("Enter balance at the beginning of the month : ");
		int balance = scanner.nextInt();

		System.out.println("Enter total charges : ");
		int charges = scanner.nextInt();

		System.out.println("Enter total credit : ");
		int credit = scanner.nextInt();

		System.out.println("Enter total credit limit : ");
		int limit = scanner.nextInt();

		int newBalance = balance + charges - credit;

		if (newBalance > limit)  {
			System.out.println("Credit limit exceeded");

		}
			else {
				System.out.println("Your new balance is "+ newBalance);

			}
	}
}
