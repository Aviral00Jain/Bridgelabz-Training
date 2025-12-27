import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Initialize total
        double total = 0.0;

        // Infinite loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();

            // Break condition
            if (number <= 0) {
                break;
            }

            // Add number to total
            total = total + number;
        }

        // Display result
        System.out.println("The total sum is " + total);

        // Close scanner
        input.close();
    }
}
