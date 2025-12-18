import java.util.Scanner;

public class LaunchCountdown {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take countdown start value
        System.out.print("Enter the countdown starting number: ");
        int counter = input.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Launch message
        System.out.println("Launch!");

        // Close scanner
        input.close();
    }
}
