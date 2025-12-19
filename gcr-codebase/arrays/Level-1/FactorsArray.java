import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Initial array size
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                // Resize array if full
                if (index == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];

                    // Copy old elements to new array
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        // Display factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}
