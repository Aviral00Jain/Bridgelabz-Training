import java.util.Scanner;

public class RajResultGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int subjects = 5;

        System.out.println("Enter marks of 5 subjects:");

        // For loop to take marks and calculate total
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
        }

        double average = total / 5.0;
        System.out.println("\nAverage Marks = " + average);

        // Convert average to grade using switch
        int gradeKey = (int) average / 10;
        char grade;

        switch (gradeKey) {
            case 10:
            case 9:
                grade = 'A';
                break;

            case 8:
                grade = 'B';
                break;

            case 7:
                grade = 'C';
                break;

            case 6:
                grade = 'D';
                break;

            default:
                grade = 'F';
        }

        System.out.println("Grade = " + grade);
    }
}