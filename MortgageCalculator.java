import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        double principalAmount = input.nextDouble();

        System.out.println("Enter interest rate: ");
        double interestRate = input.nextDouble();

        System.out.println("Enter the duration in years: ");
        double durationInYears = input.nextDouble();

        	double monthlyRate = (interestRate / 100) / 12;
        	int months = (int) (durationInYears * 12);

        	double interestRate1 = (interestRate * 1.0 / 100) / 12;
        	double initialCalculation = interestRate1 * Math.pow((1 + interestRate1), (durationInYears * 12));

        	double finalCalculation = Math.pow((1 + interestRate1), (durationInYears * 12)) - 1;
        	double amountCalculation = initialCalculation / finalCalculation;
        	double monthly_payment = principalAmount * amountCalculation;

        	    System.out.printf("Your monthly payment is $%.2f%n", monthly_payment);
    }
}

