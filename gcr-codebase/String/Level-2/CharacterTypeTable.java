import java.util.Scanner;

public class CharacterTypeTable {

    //method to check character type
    public static String checkCharacterType(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                return "Vowel";
            }
            return "Consonant";
        }

        return "not a Letter";
    }

    //method to classify characters into 2D array
    public static String[][] classifyCharacters(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharacterType(text.charAt(i));
        }

        return result;
    }

    // Method to display table
    public static void displayTable(String[][] table) {

        System.out.println("Character\tType");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner sc = new Scanner(System.in);
		
		//taking input from user
        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[][] result = classifyCharacters(text);
        displayTable(result);
    }
}