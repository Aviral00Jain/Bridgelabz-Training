import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println(
            "The maximum number of possible handshakes is " + handshakes
        );

        // Close scanner
        input.close();
    }
}
