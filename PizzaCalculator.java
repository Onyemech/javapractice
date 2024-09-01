import java.util.Scanner;

public class PizzaCalculator {

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        int onePizzaBox = 0;
        int priceOfPizza = 0;

        System.out.println("How many number of people are you ordering for : ");
        int numberOfPeople = input.nextInt();

        System.out.print("Enter the pizza type:\nSapa size\nSmall Money\nBig Boys\n Odogwu: ");
        String pizzaChoice = input.next();

        switch (pizzaChoice) {

            case "Sapa size":
                onePizzaBox = 4;
                priceOfPizza = 2000;
                break;

            case "Small Money":
                onePizzaBox = 6;
                priceOfPizza = 2400;
                break;

            case "Big Boys":
                onePizzaBox = 8;
                priceOfPizza = 3000;
                break;

            case "Odogwu":
                onePizzaBox = 12;
                priceOfPizza = 4200;
                break;

            default:
                System.out.println("Invalid pizza type entered.");
                return;
        }
        	int pizzaboxRequested = (int) Math.ceil((double) numberOfPeople / onePizzaBox);
        	int allSlices = pizzaboxRequested * onePizzaBox;
        	int leftover = allSlices - numberOfPeople;
        	int totalPrice = pizzaboxRequested * priceOfPizza;

        	System.out.println("Number of boxes of pizza to buy: " + pizzaboxRequested);
        	System.out.println("Number of leftover slices: " + leftover);
        	System.out.println("Total cost: NGN " + totalPrice);

	}
}
