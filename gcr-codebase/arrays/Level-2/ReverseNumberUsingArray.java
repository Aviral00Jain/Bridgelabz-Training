import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Store original number
        int tempNumber = number;

        // Step 1: Count digits
        int digitCount = 0;
        if (tempNumber == 0) {
            digitCount = 1;
        } else {
            while (tempNumber != 0) {
                digitCount++;
                tempNumber = tempNumber / 10;
            }
        }

        // Step 2: Store digits in array
        int[] digits = new int[digitCount];
        tempNumber = number;

        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }

        // Step 3: Create reverse array
        int[] reverseDigits = new int[digitCount];
        int index = 0;

        for (int i = digitCount - 1; i >= 0; i--) {
            reverseDigits[index] = digits[i];
            index++;
        }

        // Step 4: Display reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reverseDigits[i]);
        }

        input.close();
    }
}
