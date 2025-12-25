import java.util.Scanner;
public class LongestWord{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String text = scanner.nextLine();
		
		//applying the logic
		String longestWord = findLongestWord(text);
		
		// print the result
		System.out.println("The longest word in a sentence is: " + longestWord);
		scanner.close();
	}
	//method to find longest word
	public static String findLongestWord(String text){
		String[] store = text.split(" ");
		String longestWord = "";
		for(int i=0; i<store.length; i++){
			if(store[i].length() > longestWord.length()){
			 longestWord = store[i];
			}
		}
		return longestWord;
	}	
}