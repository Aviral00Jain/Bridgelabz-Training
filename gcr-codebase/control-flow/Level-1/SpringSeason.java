import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter day: ");
        int day = input.nextInt();

        // Check Spring Season using control flow
        if (month == 3) {
            if (day >= 20) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        } 
        else if (month == 4) {
            System.out.println("Its a Spring Season");
        } 
        else if (month == 5) {
            System.out.println("Its a Spring Season");
        } 
        else if (month == 6) {
            if (day <= 20) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        } 
        else {
            System.out.println("Not a Spring Season");
        }

        // Close scanner
        input.close();
    }
}
