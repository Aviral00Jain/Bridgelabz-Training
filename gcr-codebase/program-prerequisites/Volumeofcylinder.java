import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take radius input
        System.out.print("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();

        // Take height input
        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();

        // Calculate volume
        double volume = Math.PI * radius * radius * height;

        // Display result
        System.out.println("Volume of the cylinder: " + volume);

        // Close scanner
        sc.close();
    }
}
