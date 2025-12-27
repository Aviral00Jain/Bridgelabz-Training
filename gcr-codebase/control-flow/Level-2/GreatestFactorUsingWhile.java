import java.util.Scanner;

public class GreatestFactorUsingWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for valid input
        if (number > 1) {

            int greatestFactor = 1;
            int counter = number - 1; 

            // Find greatest factor using while loop
            while (counter >= 1) {

                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }

                counter--;
            }

            // Display result
            System.out.println(
                "The greatest factor of " + number + " besides itself is " + greatestFactor
            );

        } else {
            System.out.println("Please enter an integer greater than 1.");
        }

        input.close();
    }
}
