import java.util.Scanner;

public class QueAndRem {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take two numbers as input
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display output
        System.out.println(
            "The Quotient is " + quotient + 
            " and Remainder is " + remainder + 
            " of two numbers " + number1 + " and " + number2
        );

        // Close scanner
        input.close();
    }
}
