import java.util.Scanner;

public class ShortestLongestWordFinder {

    //method to find string length 
    public static int stringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // method to count number of words
    public static int countWords(String text) {
        int count = 1;

        for (int i = 0; i < stringLength(text); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // method to split text into words
    public static String[] splitTextIntoWords(String text) {

        String[] words = new String[countWords(text)];
        String currentWord = "";
        int index = 0;

        for (int i = 0; i < stringLength(text); i++) {

            if (text.charAt(i) != ' ') {
                currentWord += text.charAt(i);
            } else {
                words[index] = currentWord;
                currentWord = "";
                index++;
            }
        }
        words[index] = currentWord;

        return words;
    }

    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(stringLength(words[i]));
        }

        return table;
    }

    // method to find shortest and longest word lengths
    public static int[] findShortestAndLongest(String[][] table) {

        int shortest = Integer.parseInt(table[0][1]);
        int longest = Integer.parseInt(table[0][1]);

        for (int i=0; i<table.length;i++) {
            int length = Integer.parseInt(table[i][1]);

            if (length<shortest) {
                shortest = length;
            }
            if (length >longest) {
                longest =length;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // taking User input
        System.out.println("Enter text");
        String text = scanner.nextLine();

        String[] words= splitTextIntoWords(text);

        String[][] wordLengthTable = createWordLengthTable(words);

        // Display table
        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordLengthTable.length; i++) {
            System.out.println(wordLengthTable[i][0] + "\t"
			+Integer.parseInt(wordLengthTable[i][1]));
            }

        // Find shortest and longest
        int[] result = findShortestAndLongest(wordLengthTable);

        System.out.println("Shortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);
    }
}