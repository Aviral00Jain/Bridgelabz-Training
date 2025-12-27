import java.util.Scanner;

class BMICalculator {

    // Constant values
    public static final int TOTAL_MEMBERS = 10;
   
    // Method to calculate BMI 
    public static void calculateBMI(double[][] personData) {

        for (int i = 0; i < personData.length; i++) {

            double weightInKg = personData[i][0];
            double heightInCm = personData[i][1];

            double heightInMeters = heightInCm / 100;

            double bmi = weightInKg / (heightInMeters * heightInMeters);
            personData[i][2] = bmi;
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] personData) {

        String[] bmiStatus = new String[personData.length];

        for (int i = 0; i < personData.length; i++) {

            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                bmiStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                bmiStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                bmiStatus[i] = "Overweight";
            } else {
                bmiStatus[i] = "Obese";
            }
        }
        return bmiStatus;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 2D array to store weight, height and BMI
        double[][] personData = new double[TOTAL_MEMBERS][3];

        // Taking input
        for (int i = 0; i < TOTAL_MEMBERS; i++) {

            System.out.println("\nEnter details of person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            personData[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI
        calculateBMI(personData);

        // Determine BMI status
        String[] bmiStatus = determineBMIStatus(personData);

        // Display result
        System.out.println("\n----- BMI REPORT -----");
        for (int i = 0; i < TOTAL_MEMBERS; i++) {

            System.out.println("Person " + (i + 1));
            System.out.println("Weight (kg): " + personData[i][0]);
            System.out.println("Height (cm): " + personData[i][1]);
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + bmiStatus[i]);
            System.out.println();
        }
    }
}