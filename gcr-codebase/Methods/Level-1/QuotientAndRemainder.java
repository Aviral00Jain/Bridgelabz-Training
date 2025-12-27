import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor;   // Quotient
        result[1] = number % divisor;   // Remainder
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Validation
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }

        // Call method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Output
        System.out.println(
            "The Quotient is " + result[0] +
            " and Remainder is " + result[1] +
            " of two numbers " + number + " and " + divisor
        );

        input.close();
    }
}
