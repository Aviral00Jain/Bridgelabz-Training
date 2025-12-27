import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Initialize total
        double total = 0.0;

        // Variable to store user input
        double number;

        // Take first input
        System.out.print("Enter a number (0 to stop): ");
        number = input.nextDouble();

        // Loop until user enters 0
        while (number != 0) {
            total = total + number;

            // Ask for next input
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
        }

        // Display result
        System.out.println("The total sum is " + total);

        // Close scanner
        input.close();
    }
}
