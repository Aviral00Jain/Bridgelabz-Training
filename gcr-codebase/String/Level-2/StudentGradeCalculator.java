import java.util.Scanner;

public class StudentGradeCalculator {

    // Method to generate random PCM scores
    public static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3]; // 0-Physics, 1-Chemistry, 2-Maths

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10;
            scores[i][1] = (int) (Math.random() * 90) + 10;
            scores[i][2] = (int) (Math.random() * 90) + 10;
        }
        return scores;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // Total, Average, Percentage

        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3;
            double percentage = average;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to calculate grades
    public static char[] calculateGrades(double[][] results) {
        char[] grades = new char[results.length];

        for (int i = 0; i < results.length; i++) {
            double percent = results[i][2];

            if (percent >= 80)
                grades[i] = 'A';
            else if (percent >= 70)
                grades[i] = 'B';
            else if (percent >= 60)
                grades[i] = 'C';
            else if (percent >= 50)
                grades[i] = 'D';
            else if (percent >= 40)
                grades[i] = 'E';
            else
                grades[i] = 'R';
        }
        return grades;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results, char[] grades) {
        System.out.println("\n--------------------------------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t"
                    + scores[i][0] + "\t"
                    + scores[i][1] + "\t\t"
                    + scores[i][2] + "\t"
                    + results[i][0] + "\t"
                    + results[i][1] + "\t"
                    + results[i][2] + "\t\t"
                    + grades[i]);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] pcmScores = generatePCMScores(students);
        double[][] results = calculateResults(pcmScores);
        char[] grades = calculateGrades(results);

        displayScoreCard(pcmScores, results, grades);

        sc.close();
    }
}
