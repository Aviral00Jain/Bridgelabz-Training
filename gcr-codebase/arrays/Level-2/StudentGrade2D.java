import java.util.Scanner;


class StudentGrade2D {

    public static void main(String[] args) {

        // create Scanner object
        Scanner scanner = new Scanner(System.in);

        // take number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // validate number of students
        if (numberOfStudents <= 0) {
            System.err.println("Invalid number of students.");
        }

        
        double[][] marks = new double[numberOfStudents][3];

        // Declare arrays for percentage and grade
        double[] percentage = new double[numberOfStudents];
        char[] grade = new char[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < marks.length; i++) {

            System.out.println("Enter marks for Student ");

            System.out.println("Physics: ");
            marks[i][0] = scanner.nextDouble();

            System.out.println("Chemistry: ");
            marks[i][1] = scanner.nextDouble();

            System.out.println("Maths: ");
            marks[i][2] = scanner.nextDouble();

            // validate marks
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.err.println("Marks cannot be negative. Re-enter details.");
                i--;    
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < marks.length; i++) {

            double totalMarks = 0;

            // Sum of 3 subjects
            for (int j = 0; j < marks[i].length; j++) {
                totalMarks += marks[i][j];
            }

            // Calculate percentage
            percentage[i] = totalMarks / marks[i].length;

            // calculating grade
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Display results

        for (int i = 0; i < marks.length; i++) {

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics Marks   = " + marks[i][0]);
            System.out.println("Chemistry Marks = " + marks[i][1]);
            System.out.println("Maths Marks     = " + marks[i][2]);
            System.out.println("Percentage      = " + percentage[i] + "%");
            System.out.println("Grade           = " + grade[i]);
        }

        // Close scanner
        scanner.close();
    }
}