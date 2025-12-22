import java.util.Scanner;

class AnagramCheck {

    public static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;

        int[] freq = new int[256];

        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner sc = new Scanner(System.in);

        // taking user input
        System.out.print("Enter first text ");
        String t1 = sc.nextLine();

        System.out.print("Enter second text ");
        String t2 = sc.nextLine();

        System.out.println("Are Anagrams: " + isAnagram(t1, t2));
    }
}