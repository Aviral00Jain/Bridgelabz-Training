import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check for Gregorian calendar year and leap year using single if
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is NOT a Leap Year.");
        } else {
            System.out.println("Please enter a year greater than or equal to 1582.");
        }

        input.close();
    }
}
