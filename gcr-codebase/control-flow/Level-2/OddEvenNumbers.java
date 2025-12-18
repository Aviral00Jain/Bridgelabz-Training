import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for natural number
        if (number > 0) {

            // Iterate from 1 to the number
            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }

        } else {
            // If not a natural number
            System.out.println("The number is not a natural number.");
        }

        input.close();
    }
}
