import java.util.Scanner;

class LineGeometry {

    //method to calculate Euclidean distance
    public static double calculateDistance(
            double x1, double y1,
            double x2, double y2) {

        return Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2));
    }

    // method to calculate slope 
    public static double[] findLineEquation(
            double x1, double y1,
            double x2, double y2) {

        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - (slope * x1);

        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner scanner = new Scanner(System.in);
 
        // taking user input
        System.out.print("Enter x1 y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        double[] lineData = findLineEquation(x1, y1, x2, y2);

        System.out.println("\nEuclidean Distance: " + distance);
        System.out.println("Equation of Line:");
        System.out.println("y = " + lineData[0] + "x + " + lineData[1]);
    }
}