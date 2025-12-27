import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take unit price input
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        // Take quantity input
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Display output
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice
        );

        // Close scanner
        input.close();
    }
}
