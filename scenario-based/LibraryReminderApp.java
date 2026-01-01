
import java.util.Scanner;

public class LibraryReminderApp {
   /*       15. Rohan’s Library Reminder App 📚
            Rohan wants a fine calculator:
            ● Input return date and due date.
            ● If returned late, calculate fine: ₹5/day.
            ● Repeat for 5 books using for-loop.*/


        public static void main(String[] args) {

            // Creating scanner class object
            Scanner sc = new Scanner(System.in);

            // pre-defined values
            int totalBooks = 5;
            int finePerDay = 5;

            // for-loop to iterate thorugh each book
            for (int i = 1; i <= totalBooks; i++) {

                System.out.println("\n Book " + i);

                System.out.print("Enter due day (1–30): ");
                int dueDay = sc.nextInt();

                System.out.print("Enter return day (1–30): ");
                int returnDay = sc.nextInt();

                int lateDays = returnDay - dueDay;

                // Calculating fine
                if (lateDays > 0) {
                    int fine = lateDays * finePerDay;
                    System.out.println("Returned late by " + lateDays + " days");
                    System.out.println("Fine to be paid: ₹" + fine);
                } else {
                    System.out.println("Returned on time. No fine.");
                }
            }
            // closing scanner
            sc.close();
        }
    }
