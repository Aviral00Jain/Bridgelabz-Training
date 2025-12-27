import java.util.Scanner;

class FrequencyUsingUnique {

    public static char[] findUnique(String text) {

        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[index++] = ch;
            }
        }

        char[] uniqueChars = new char[index];
        for (int i = 0; i < index; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    public static String[][] frequency(String text) {

        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = findUnique(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner sc = new Scanner(System.in);
		
		// taking input from user
        System.out.print("Enter text ");
        String text = sc.nextLine();

        String[][] table = frequency(text);

        System.out.println("Char\tCount");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
