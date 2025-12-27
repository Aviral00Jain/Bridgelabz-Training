import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        // Call method
        double[] result = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("Sine of " + angle + "° = " + result[0]);
        System.out.println("Cosine of " + angle + "° = " + result[1]);
        System.out.println("Tangent of " + angle + "° = " + result[2]);

        input.close();
    }
}
