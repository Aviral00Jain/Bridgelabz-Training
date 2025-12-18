import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number > 1) { 

            int greatestFactor = 1;

            // Find greatest factor using for loop
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }

            // Display result
            System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);

        } else {
            System.out.println("Please enter an integer greater than 1.");
        }

        input.close();
    }
}
