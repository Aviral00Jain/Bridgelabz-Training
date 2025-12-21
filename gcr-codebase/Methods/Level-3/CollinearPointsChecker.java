import java.util.Scanner;

class CollinearPointsChecker {

    // method to check collinearity using slope formula
    public static boolean areCollinearUsingSlope(
            int x1, int y1,
            int x2, int y2,
            int x3, int y3) {

        int slopeAB = (y2 - y1) * (x3 - x1);
        int slopeAC = (y3 - y1) * (x2 - x1);

        return slopeAB == slopeAC;
    }

    // method to check collinearity using area of triangle formula
    public static boolean areCollinearUsingArea(
            int x1, int y1,
            int x2, int y2,
            int x3, int y3) {

        int area = x1 * (y2 - y3)
                 + x2 * (y3 - y1)
                 + x3 * (y1 - y2);

        return area == 0;
    }

    public static void main(String[] args) {

        // Create scanner object
        Scanner scanner = new Scanner(System.in);


        //taking input points from user
        System.out.print("Enter x1 y1: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Enter x2 y2: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.print("Enter x3 y3: ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Check using slope method
        boolean slopeResult = areCollinearUsingSlope(
                x1, y1, x2, y2, x3, y3);

        // Check using area method
        boolean areaResult = areCollinearUsingArea(
                x1, y1, x2, y2, x3, y3);

        // Displaying results
        System.out.println("\nUsing Slope Method:");
        if (slopeResult) {
            System.out.println("Points are Collinear");
        } else {
            System.out.println("Points are NOT Collinear");
        }

        System.out.println("\nUsing Area Method:");
        if (areaResult) {
            System.out.println("Points are Collinear");
        } else {
            System.out.println("Points are NOT Collinear");
        }
    }
}