import java.util.Scanner;

class PalindromeCheck {

    public static boolean checkUsingIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkRecursive(String text, int start, int end) {

        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;

        return checkRecursive(text, start + 1, end - 1);
    }

    public static char[] reverse(String text) {

        char[] rev = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            rev[index++] = text.charAt(i);
        }
        return rev;
    }

    public static boolean checkUsingArray(String text) {

        char[] original = text.toCharArray();
        char[] reversed = reverse(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner sc = new Scanner(System.in);
		
		// taking user input
        System.out.print("Enter text ");
        String text = sc.nextLine();

        System.out.println("Logic 1: " + checkUsingIndexes(text));
        System.out.println("Logic 2: " +
            checkRecursive(text, 0, text.length() - 1));
        System.out.println("Logic 3: " + checkUsingArray(text));
    }
}
