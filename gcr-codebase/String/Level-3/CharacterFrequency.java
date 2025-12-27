import java.util.Scanner;

class CharacterFrequency {

    public static String[][] findFrequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                count++;
                freq[text.charAt(i)] = 0;
            }
        }

        String[][] result = new String[count][2];
        freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner sc = new Scanner(System.in);
		
		// taking input from user
        System.out.print("Enter text ");
        String text = sc.nextLine();

        String[][] table = findFrequency(text);

        System.out.println("Char\tCount");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}