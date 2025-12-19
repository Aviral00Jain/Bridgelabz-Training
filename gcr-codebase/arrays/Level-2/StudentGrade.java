import java.util.Scanner;


class StudentGrade {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // take number of students
        System.out.print("Enter number of students ");
        int numberOfStudents = scanner.nextInt();

        // validate number of students
        if (numberOfStudents <= 0) {
            System.err.println("Invalid number of students.");
            System.exit(0);
        }

        // Declare arrays
        double[] physicsMarks = new double[numberOfStudents];
        double[] chemistryMarks = new double[numberOfStudents];
        double[] mathsMarks = new double[numberOfStudents];
        double[] percentage = new double[numberOfStudents];
        char[] grade = new char[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println("\nEnter marks for Student ");

            System.out.print("Physics ");
            physicsMarks[i] = scanner.nextDouble();

            System.out.print("Chemistry ");
            chemistryMarks[i] = scanner.nextDouble();

            System.out.print("Maths ");
            mathsMarks[i] = scanner.nextDouble();

            // Validate marks
            if (physicsMarks[i] < 0 || chemistryMarks[i] < 0 || mathsMarks[i] < 0) {
                System.err.println("Marks cannot be negative. Re-enter details.");
                i--;   // Decrement index to re-enter values
                continue;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {

            percentage[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3;

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
        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics Marks  =  " + physicsMarks[i]);
            System.out.println("Chemistry Marks = " + chemistryMarks[i]);
            System.out.println("Maths Marks     = " + mathsMarks[i]);
            System.out.println("Percentage      = " + percentage[i] + "%");
            System.out.println("Grade           = " + grade[i]);
        }

        // Close Scanner
        scanner.close();
    }
}