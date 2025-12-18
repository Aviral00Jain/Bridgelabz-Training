import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number > 0) {

            // Loop from 1 to number
            for (int i = 1; i <= number; i++) { 

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                else {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("The number entered is not a positive integer.");
        }

        input.close();
    }
}
