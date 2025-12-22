import java.util.Scanner;

public class TeamBMICalculator {

    public static final int TOTAL_PERSONS = 10;

    // method to calculate BMI 
    public static String[] calculateBMIAndStatus(double weightKg, double heightCm) {

        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmiValue = weightKg / (heightMeter * heightMeter);

        // Determine BMI status
        String status;
        if (bmiValue < 18.5) {
            status = "Underweight";
        } else if (bmiValue < 25) {
            status = "Normal";
        } else if (bmiValue < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
                String.format("%.2f", bmiValue),
                status
        };
    }

    // method to generate BMI report for all persons
    public static String[][] generateBMIReport(double[][] heightWeightData) {

        String[][] bmiReport = new String[TOTAL_PERSONS][4];

        for (int i = 0; i < TOTAL_PERSONS; i++) {

            double weight = heightWeightData[i][0];
            double height = heightWeightData[i][1];

            String[] bmiResult = calculateBMIAndStatus(weight, height);

            bmiReport[i][0] = String.valueOf(height);       
            bmiReport[i][1] = String.valueOf(weight);       
            bmiReport[i][2] = bmiResult[0];                 
            bmiReport[i][3] = bmiResult[1];                 
        }

        return bmiReport;
    }

    // method to display BMI 
    public static void displayBMIReport(String[][] report) {

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < report.length; i++) {
            System.out.println(report[i][0] + "\t\t" +report[i][1] + "\t\t" +
                    report[i][2] + "\t" +report[i][3]
            );
        }
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner scanner = new Scanner(System.in);

        
        double[][] heightWeightData = new double[TOTAL_PERSONS][2];

        // Taking user input
        for (int i = 0; i < TOTAL_PERSONS; i++) {

            System.out.println("\nEnter details for Person ");

            System.out.print("Enter weight  ");
            heightWeightData[i][0] = scanner.nextDouble();

            System.out.print("Enter height ");
            heightWeightData[i][1] = scanner.nextDouble();
        }

        // generate BMI report
        String[][] bmiReport = generateBMIReport(heightWeightData);

        // display result
        displayBMIReport(bmiReport);
    }
}
