import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take base and height in inches
        System.out.print("Enter base of triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle (in inches): ");
        double height = input.nextDouble();

        // Area in square inches
        double areaInInches = 0.5 * base * height;

        // Convert area to square centimeters
        double areaInCm = areaInInches * 6.4516;

    
