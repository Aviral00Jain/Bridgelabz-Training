import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take fee input
        System.out.print("Enter Student Fee: ");
        double fee = input.nextDouble();

        // Take discount percentage input
        System.out.print("Enter Discount Percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount
        double discount = (fee * discountPercent) / 100;

        // Calculate final fee
        double finalFee = fee - discount;

        // Display output
        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );

        // Close scanner
        input.close();
    }
}
