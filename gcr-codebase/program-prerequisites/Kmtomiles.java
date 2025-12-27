import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take kilometers input
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        // Convert to miles
        double miles = kilometers * 0.621371;

        // Display result
        System.out.println("Distance in miles: " + miles);

        // Close scanner
        sc.close();
    }
}
