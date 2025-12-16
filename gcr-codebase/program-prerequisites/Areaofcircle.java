import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take radius input
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculate area
        double area = Math.PI * radius * radius;

        // Display result
        System.out.println("Area of the circle: " + area);

        // Close scanner
        sc.close();
    }
}
