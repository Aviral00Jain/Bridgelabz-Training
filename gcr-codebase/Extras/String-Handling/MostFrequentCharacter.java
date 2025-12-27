import java.util.Scanner;
public class MostFrequentCharacter {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
        String str = scanner.nextLine();

		//applying the logic
		char result = findMostFrequencyCharacter(str);
		
		//print the result
		System.out.println("Most Frequent Character: '" + result + "'");
		scanner.close();
	}

	// method to find most frequency character	
	public static char findMostFrequencyCharacter(String str){
        int[] freq = new int[256];
        int max = 0;
        char result = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;

            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }
		return result;
    }
}