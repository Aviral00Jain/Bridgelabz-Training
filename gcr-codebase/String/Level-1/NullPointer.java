import java.util.Scanner;

public class NullPointer {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // initialized to null
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; // initialized to null
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled!");
        }
    }

    public static void main(String[] args) {

        // Uncomment the below line to see the exception occur
        // generateException();

        // Refactored code to handle the exception
        handleException();
    }
}
