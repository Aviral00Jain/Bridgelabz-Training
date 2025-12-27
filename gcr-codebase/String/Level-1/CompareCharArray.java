import java.util.*;

public class CompareCharArray {

    // User-defined method to return characters of a string
    public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Call user-defined method
        char[] userDefinedArray = getCharacters(text);

        // Call built-in method
        char[] builtInArray = text.toCharArray();

        // Compare both arrays
        boolean result = compareCharArrays(userDefinedArray, builtInArray);

        // Display result
        System.out.println("Characters from user-defined method:");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters from toCharArray() method:");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both character arrays equal? " + result);

        sc .close();
    }
}
