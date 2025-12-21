import java.util.Scanner;

class MonthlyCalendar {

    // method to get month name
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // method to check leap year
    public static boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    // method to get number of days in a month
    public static int getNumberOfDays(int month, int year) {

        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // method to get first day of month
    public static int getFirstDay(int day, int month, int year) {

        int y0 = year -(14 - month)/ 12;
        int x = y0 + y0/4 - y0/ 100 + y0/ 400;
        int m0 = month + 12 * ((14 - month)/ 12) - 2;
        int d0 = (day + x + (31 * m0)/ 12)% 7;

        return d0; 
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        String monthName = getMonthName(month);
        int totalDays = getNumberOfDays(month, year);

        int firstDay = getFirstDay(1, month, year);

        // Display header
        System.out.println(monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // First loop 
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Second loop 
        for (int day = 1; day <= totalDays; day++) {

            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
}