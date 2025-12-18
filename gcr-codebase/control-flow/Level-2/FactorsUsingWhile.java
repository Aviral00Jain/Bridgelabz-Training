import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number > 0) {
 
            System.out.println("Factors of " + number + " are:");

            int counter = 1;

            // Find factors using while loop
            while (counter <= number) {

                if (number % counter == 0) {
                    System.out.println(counter);
                }

                counter++;
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        input.close();
    }
}
