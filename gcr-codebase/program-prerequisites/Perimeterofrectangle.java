import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take length input
        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        // Take width input
        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        // Calculate perimeter
        double perimeter = 2 * (length + width);

        // Display result
        System.out.println("Perimeter of the rectangle: " + perimeter);

        // Close scanner
        sc.close();
    }
}
