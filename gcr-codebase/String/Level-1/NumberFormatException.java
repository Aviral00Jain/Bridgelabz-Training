import java.util.*;

public class NumberFormatException {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("Converted Number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: Input is not a valid number.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String text = scanner.next();

        // Uncomment this line to see the program crash due to exception
        // generateException(text);

        // Refactored code to handle the exception
        handleException(text);

        scanner.close();
    }
}
