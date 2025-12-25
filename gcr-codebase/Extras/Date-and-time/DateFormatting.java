import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {

        // getting current date
        LocalDate userDate = LocalDate.now();

        // creating formatters
        DateTimeFormatter format1 =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter format2 =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        DateTimeFormatter format3 =
                DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // displaying date in different formats
        System.out.println("dd/MM/yyyy       : " + userDate.format(format1));
        System.out.println("yyyy-MM-dd       : " + userDate.format(format2));
        System.out.println("EEE, MMM dd, yyyy: " + userDate.format(format3));
    }
}
