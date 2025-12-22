import java.util.Scanner;

public class TrimStringUsingCharAt {

    // Method to find start and end index without spaces
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1}; // end+1 for substring
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = scanner.nextLine();

        // User-defined trim logic
        int[] indexes = findTrimIndexes(input);
        String trimmedByCharAt = createSubstring(input, indexes[0], indexes[1]);

        // Built-in trim
        String trimmedByBuiltIn = input.trim();

        // Compare results
        boolean isSame = compareStrings(trimmedByCharAt, trimmedByBuiltIn);

        // Display output
        System.out.println("\nTrimmed using charAt(): \"" + trimmedByCharAt + "\"");
        System.out.println("Trimmed using trim(): \"" + trimmedByBuiltIn + "\"");
        System.out.println("Are both results same? " + isSame);

        scanner.close();
    }
}
