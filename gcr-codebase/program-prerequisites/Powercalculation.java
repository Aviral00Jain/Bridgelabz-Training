import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take base input
        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        // Take exponent input
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();

        // Calculate power using Math.pow()
        double result = Math.pow(base, exponent);

        // Display result
        System.out.println("Result = " + result);

        // Close scanner
        sc.close();
    }
}
