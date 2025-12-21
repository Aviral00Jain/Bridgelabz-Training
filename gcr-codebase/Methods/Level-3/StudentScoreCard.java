import java.util.Scanner;

class StudentScoreCard {

    // method to generate random 2-digit PCM marks
    public static int[][] generatePCMMarks(int numberOfStudents) {

        int[][] marks = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            marks[i][0] = (int) (Math.random() * 90) + 10; 
            marks[i][1] = (int) (Math.random() * 90) + 10; 
            marks[i][2] = (int) (Math.random() * 90) + 10; 
        }
        return marks;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] marks) {

        double[][] results = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 digits
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }

    // Method to determine grade based on percentage
    public static char findGrade(double percentage) {

        if (percentage >= 80) return 'A';
        else if (percentage >= 70) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 50) return 'D';
        else if (percentage >= 40) return 'E';
        else return 'R';
    }

    // Method to display scorecard using tabular format
    public static void displayScoreCard(int[][] marks, double[][] results) {

        System.out.println("Stu  Phy   Chem   Math   Total   Avg%   Grade");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < marks.length; i++) {

            char grade = findGrade(results[i][2]);

            System.out.println(
                    (i + 1) + "    " + marks[i][0] + "    " +marks[i][1] + "    " + marks[i][2] + "    " +
					(int) results[i][0] + "    " + results[i][1] + "    " +  results[i][2] + "    " +  grade);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        
        int[][] marks = generatePCMMarks(numberOfStudents);

        double[][] results = calculateResults(marks);

        // Display scorecard
        displayScoreCard(marks, results);
    }
}