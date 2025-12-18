import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        // Check if natural number
        if (n > 0) {

            // Sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Sum using for loop
            int loopSum = 0;

            for (int i = 1; i <= n; i++) {
                loopSum = loopSum + i;
            }

            // Display results
            System.out.println("Sum using for loop = " + loopSum);
            System.out.println("Sum using formula = " + formulaSum);

            // Compare results
            if (loopSum == formulaSum) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("The computations are NOT equal.");
            }

        } else {
            // Not a natural number
            System.out.println("The number " + n + " is not a natural number.");
        }

        input.close();
    }
}
