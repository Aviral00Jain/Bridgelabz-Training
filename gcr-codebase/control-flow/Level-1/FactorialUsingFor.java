import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Check for natural number
        if (number > 0) {

            int factorial = 1;

            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            // Print result
            System.out.println("The factorial
