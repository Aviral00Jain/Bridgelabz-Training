import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find sum using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("The number is not a natural number.");
            return;
        }

        // Compute sums
        int recursiveSum = sumUsingRecursion(number);
        int formulaSum = sumUsingFormula(number);

        // Display results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results are not equal.");
        }

        input.close();
    }
}
