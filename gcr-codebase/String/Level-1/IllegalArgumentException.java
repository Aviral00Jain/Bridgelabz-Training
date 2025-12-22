import java.util.*;

public class IllegalArgumentException {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // This will throw IllegalArgumentException
        String result = text.substring(5, 2);
        System.out.println(result);
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            String result = text.substring(5, 2);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: Start index is greater than end index");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // This will generate exception and stop execution
        // Uncomment to see abnormal termination
        // generateException(text);

        // This will handle the exception safely
        handleException(text);

        sc.close();
    }
}
