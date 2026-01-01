import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candidate1 = 0;
        int candidate2 = 0;
        int candidate3 = 0;

        while (true) {
            System.out.print("Enter age of voter (-1 to stop): ");
            int age = sc.nextInt();

            // Exit condition
            if (age == -1) {
                System.out.println("Voting session ended.");
                break;
            }

            // Eligibility check
            if (age < 18) {
                System.out.println("Not eligible to vote.");
                continue;
            }

            // Voting section
            System.out.println("Choose your candidate:");
            System.out.println("1. Candidate 1");
            System.out.println("2. Candidate 2");
            System.out.println("3. Candidate 3");
            System.out.print("Enter your vote: ");
            int vote = sc.nextInt();

            if (vote == 1)
                candidate1++;
            else if (vote == 2)
                candidate2++;
            else if (vote == 3)
                candidate3++;
            else
                System.out.println("Invalid vote! Not counted.");
        }

        // Display Results
        System.out.println("\n----- Voting Result -----");
        System.out.println("Candidate 1 Votes: " + candidate1);
        System.out.println("Candidate 2 Votes: " + candidate2);
        System.out.println("Candidate 3 Votes: " + candidate3);
    }
}