import java.util.Scanner;

class StudentVoteChecker {
    // creating method
    public boolean canStudentVote(int age) {

        if (age < 0) {
            return false;
        }

        if (age >= 18) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        // Creating scanner object
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];
        
		// calling method through loop
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();

            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student can vote");
            } else {
                System.out.println("Student cannot vote");
            }
        }
    }
}