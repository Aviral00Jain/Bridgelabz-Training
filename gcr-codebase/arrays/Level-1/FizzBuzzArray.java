import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Create String array to store results
        String[] results = new String[number + 1];

        // Loop from 1 to number and save FizzBuzz values
        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Print array results with position
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        input.close();
    }
}
