import java.util.Scanner;

public class FactorialUsingWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Check if number is positive
        if (number > 0) {

            int factorial = 1;
            int i = 1;

            // Calculate factorial using while loop
            while (i <= number) {
                factorial = factorial * i;
                i++;
            }

            // Print result
            System.out.println("The factorial of " + number + " is " + factorial);

        } else {
            // If number is not positive
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
