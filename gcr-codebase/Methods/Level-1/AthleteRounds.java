import java.util.Scanner;

public class AthleteRounds {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {

        double perimeter = side1 + side2 + side3; // perimeter in meters
        double totalDistance = 5000; // 5 km = 5000 meters

        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for sides of triangle
        System.out.print("Enter side 1 (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = input.nextDouble();

        // Validation
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Sides must be positive values.");
            return;
        }

        // Call method
        double rounds = calculateRounds(side1, side2, side3);

        // Display result
        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");

        input.close();
    }
}
