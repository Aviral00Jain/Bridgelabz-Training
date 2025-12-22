import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first string: ");
        String str1 = input.next();

        System.out.print("Enter second string: ");
        String str2 = input.next();

        // Compare using custom method
        boolean charAtResult = compareStringsUsingCharAt(str1, str2);

        // Compare using built-in equals method
        boolean equalsResult = str1.equals(str2);

        // Display results
        System.out.println("Result using charAt() method: " + charAtResult);
        System.out.println("Result using equals() method: " + equalsResult);

        if (charAtResult == equalsResult) {
            System.out.println("Both methods give the SAME result.");
        } else {
            System.out.println("Both methods give DIFFERENT results.");
        }

        input.close();
    }

    // Method to compare strings using charAt()
    public static boolean compareStringsUsingCharAt(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
