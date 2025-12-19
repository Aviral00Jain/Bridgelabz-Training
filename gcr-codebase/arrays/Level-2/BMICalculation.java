import java.util.Scanner;

public class BMICalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Create arrays
        double[] height = new double[n];   
        double[] weight = new double[n];   
        double[] bmi = new double[n];      
        String[] status = new String[n];   

        //Take input for height and weight
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson ");

            System.out.print("Enter height ");
            height[i] = sc.nextDouble();

            System.out.print("Enter weight  ");
            weight[i] = sc.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display result
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height : " + height[i] + " meters");
            System.out.println("Weight : " + weight[i] + " kg");
            System.out.println("BMI    : " + String.format("%.2f", bmi[i]));
            System.out.println("Status : " + status[i]);
        }
        // closing scxanner
        sc.close();
    }
}