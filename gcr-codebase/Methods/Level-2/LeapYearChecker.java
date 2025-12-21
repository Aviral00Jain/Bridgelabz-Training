import java.util.Scanner;

class LeapYearChecker {
    // Create leap year method
    public static boolean isLeapYear(int year) {

        if (year < 1582) {
            return false;
        }

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        // Scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Displaying result
        if (isLeapYear(year)) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
}