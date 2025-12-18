import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Check for positive integers
        if (number > 0 && power >= 0) {

            int result = 1;
            int counter = 0;

            // Calculate power using while loop
            while (counter < power) {
                result = result * number;
                counter++;
            }

            // Print result
            System.out.println(number + " raised to the power " + power + " is " + result);

        } else {
            System.out.println("Please enter positive integers for number and power.");
        }

        input.close();
    }
}
