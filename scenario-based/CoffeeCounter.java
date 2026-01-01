import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // GST percentage
        final double GST_RATE = 0.05;

        // Loop to serve multiple customers
        while (true) {

            System.out.println("\nEnter coffee type (Espresso / Latte / Cappuccino) or type 'exit' to stop:");
            String coffeeType = input.next();

            // Exit condition
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Cafe closed. Thank you!");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = input.nextInt();

            double pricePerCup = 0.0;

            // Determine price using switch
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue; // Skip current iteration
            }

            // Calculate bill
            double totalAmount = pricePerCup * quantity;
            double gstAmount = totalAmount * GST_RATE;
            double finalBill = totalAmount + gstAmount;

            // Display bill
            System.out.println("\n----- BILL DETAILS -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Base Amount : ₹" + totalAmount);
            System.out.println("GST (5%)    : ₹" + gstAmount);
            System.out.println("Total Bill  : ₹" + finalBill);
        }
    }
}