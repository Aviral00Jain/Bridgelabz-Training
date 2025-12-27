import java.util.Scanner;

public class MultiplesBelowHundredWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for valid input
        if (number > 0 && number < 100) {
 
            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 1;

            // Use while loop to find multiples
            while (counter * number < 100) {
                System.out.println(counter * number);
                counter++;
            }

        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        input.close();
    }
}
