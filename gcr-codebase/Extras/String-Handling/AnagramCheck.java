 import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two String: ");
		String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        //applying logic 
		boolean isAnagram = checkAnagram(s1,s2);
		
		//print the result
		if (isAnagram){
            System.out.println("Anagrams");
        }
		else{
            System.out.println("Not Anagrams");
		}
		scanner.close();
    }
	
	// check for anagram
	public static boolean checkAnagram(String s1, String s2){
		if (s1.length() != s2.length()) {
            return false;
        }
        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        boolean isAnagram = true;
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }
		return isAnagram;
	}
}