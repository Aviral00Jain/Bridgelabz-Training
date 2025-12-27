import java.util.Scanner;
public class ReplaceSpecificWord{
	public static void main(String []args) {
	
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
        String str = scanner.nextLine();
		System.out.println("Enter the word that you want to replace: ");
		String word = scanner.next();
		System.out.println("Enter the replace word: ");
        String replace = scanner.next();
		
		//applying the logic
		String modified = modifiedString(str,word,replace);
		
		// print the result
		System.out.println("Modified String: " + modified);
		scanner.close();
	}
	
	// method to modified String
	public static String modifiedString(String str,String word,String replace){
		String result = "";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                result += replace;
            } else {
                result += words[i];
            }

            if (i < words.length - 1) {
                result += " ";
            }
        }
        return result;
	}
}	