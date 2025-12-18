import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take countdown start value
        System.out.print("Enter the countdown starting number: ");
        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;   // decrement counter
        }

        // Launch message
        System.out.println("Rocket Launch!");

        // Close scanner
        input.close();
    }
}
