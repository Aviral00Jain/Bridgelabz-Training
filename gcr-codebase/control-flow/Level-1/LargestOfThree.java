import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        // Initialize flags
        boolean isFirstLargest = false;
        boolean isSecondLargest = false;
        boolean isThirdLargest = false;

        // Check largest using if-else
        if (number1 > number2 && number1 > number3) {
            isFirstLargest = true;
        } else if (number2 > number1 && number2 > number3) {
            isSecondLargest = true;
        } else if (number3 > number1 && number3 > number2) {
            isThirdLargest = true;
        }

        // Display output
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        // Close scanner
        input.close();
    }
}
