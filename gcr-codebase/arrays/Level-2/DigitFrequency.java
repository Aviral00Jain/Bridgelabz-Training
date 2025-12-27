import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }

        // Special case when number is 0
        if (number == 0) {
            System.out.println("Digit 0 occurs 1 time(s).");
            return;
        }

        // Step 1: Count digits
        long tempNumber = number;
        int digitCount = 0;
        while (tempNumber != 0) {
            digitCount++;
            tempNumber /= 10;
        }

        // Step 2: Store digits in array
        int[] digits = new int[digitCount];
        tempNumber = number;

        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int) (tempNumber % 10);
            tempNumber /= 10;
        }

        // Step 3: Frequency array (0–9)
        int[] frequency = new int[10];

        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }

        // Step 4: Display frequency
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

        input.close();
    }
}
