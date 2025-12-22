import java.util.*;

public class VotingEligibility {

    // Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10; // generates age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display result in tabular format
    public static void displayResult(String[][] data) {
        System.out.println("\nAge\tVoting Eligibility");
        System.out.println("------------------------");

        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Generate ages
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] votingStatus = checkVotingEligibility(ages);

        // Display result
        displayResult(votingStatus);

        scanner.close();
    }
}
