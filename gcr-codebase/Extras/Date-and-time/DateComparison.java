import java.util.Scanner;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateComparison {
    public static void main(String[] args) {

        // creating scanner class object
        Scanner sc = new Scanner(System.in);

        // date formatter
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // taking first date input
        String firstDate = sc.nextLine();
        LocalDate date1 = LocalDate.parse(firstDate, formatter);

        // taking second date input
        String secondDate = sc.nextLine();
        LocalDate date2 = LocalDate.parse(secondDate, formatter);

        // comparing dates
        if (date1.isBefore(date2)) {
            System.out.println("first date is before second date");
        } else if (date1.isAfter(date2)) {
            System.out.println("first date is after second date");
        } else {
            System.out.println("Both dates are Same");
        }
    }
}
