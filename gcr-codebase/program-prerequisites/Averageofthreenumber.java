import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        // Calculate average
        double average = (num1 + num2 + num3) / 3;

        // Display result
        System.out.println("Average = " + average);

        // Close scanner
        sc.close();
    }
}
