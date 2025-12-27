import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if natural number
        if (number > 0) {
            // Sum of n natural numbers
            int sum = number * (number + 1) / 2;

            // Output
            System.out.println(
                "The sum of " + number + " natural numbers is " + sum
            );
        } else {
            // Not a natural number
            System.out.println(
                "The number " + number + " is not a natural number"
            );
        }

        // Close scanner
        input.close();
    }
}
