import java.util.Scanner;

public class VowelConsonantCount {

    public static String checkCharacterType(char ch) {

        // Convert uppercase to lowercase 
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {

            String result = checkCharacterType(text.charAt(i));

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string");
        String inputText = scanner.nextLine();

        // Count vowels and consonants
        int[] result = countVowelsAndConsonants(inputText);

        // Displaying result
        System.out.println("Vowel Count = " + result[0]);
        System.out.println("Consonant Count = " + result[1]);
    }
}