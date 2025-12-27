import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check for valid Gregorian year
        if (year >= 1582) {

            // Part 1: Multiple if-else statements
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year .");
                    } else {
                        System.out.println(year + " is NOT a Leap Year .");
                    }
                } else {
                    System.out.println(year + " is a Leap Year .");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year .");
            }

            // Part 2: Single if statement with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year .");
            } else {
                System.out.println(year + " is NOT a Leap Year .");
            }

        } else {
            System.out.println("Please enter a year >= 1582 .");
        }

        input.close();
    }
}
