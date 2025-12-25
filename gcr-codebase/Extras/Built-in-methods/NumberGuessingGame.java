import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // method to generate computer guess
    public static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }

    // method to take user feedback
    public static String getFeedback(Scanner sc) {
        return sc.nextLine();
    }

    public static void main(String[] args) {

        // creating scanner class object
        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean guessed = false;

        System.out.println("think of a number between 1 and 100");

        while (!guessed) {

            int guess = generateGuess(low, high);
            System.out.println("Computer guess " + guess);
            System.out.println("Enter feedback (high,low,correct) ");

            String feedback = getFeedback(sc);

            if (feedback.equals("high")) {
                high = guess - 1;
            } 
            else if (feedback.equals("low")) {
                low = guess + 1;
            } 
            else if (feedback.equals("correct")) {
                System.out.println("guessed correctly");
                guessed = true;
            }
        }
    }
}
