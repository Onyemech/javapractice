import java.util.*;
import java.time.LocalDate;

public class MenstralApp {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Welcome to my menstruation cycle calculator \nPlease Enter your name: ");
            String userName = input.nextLine();

            System.out.print("Dear " + userName + ", please enter your age: ");
            int userAge = input.nextInt();

            if (userAge < 8 || userAge > 50) {
                System.out.print("Dear " + userName + ", this is not normal\n please consult your doctor\nThank you for using our mobile app");
            } else {
                System.out.print("Enter the first day of last period : ");
                int menstrationStart = input.nextInt();

                System.out.print("Enter the length of your menstrual cycle: ");
                int menstrationCycle = input.nextInt();

                if (menstrationCycle < 28 || menstrationCycle > 35) {
                    System.out.print("Consult your doctor: ");
                } else {
                    getNextMensDate(menstrationCycle, menstrationStart);
                }
            }
        } catch (Exception e) {
            System.out.print("Invalid input\nTry again");
        }
    }

    public static void getNextMensDate(int menstrationCycle, int menstrationStart) {
        
        LocalDate lastFlowDate = LocalDate.of(2024, 10, menstrationStart);
        LocalDate nextMenstrationDate = lastFlowDate.plusDays(menstrationCycle);
        LocalDate ovulationDate = lastFlowDate.plusDays(menstrationCycle / 2);

        LocalDate safePeriodStart = nextMenstrationDate.minusDays(18);

        System.out.println("Your next flow date is " + nextMenstrationDate);
        System.out.println("Your ovulation starting date is " + ovulationDate);
        System.out.println("Your safe period starts from " + safePeriodStart + " and ends in the next 5 days");
    }
}

