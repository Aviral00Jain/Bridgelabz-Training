import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate sum using loop
    public static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {
            int result = findSum(number);
            System.out.println("The sum of " + number + " natural numbers is " + result);
        }

        input.close();
    }
}
