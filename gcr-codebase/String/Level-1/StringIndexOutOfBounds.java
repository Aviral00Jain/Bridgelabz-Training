import java.util.*;

public class StringIndexOutOfBounds {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing index beyond string length
        System.out.println("Character at index 10: " + text.charAt(10));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println("Character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: String index is out of range!");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Uncomment this to see the program crash due to exception
        // generateException(text);

        // Handling the exception properly
        handleException(text);

        scanner.close();
    }
}
