import java.util.Scanner;
public class SubStringCount{
	public static void main(String []args) {
	
	    // creating scanner input
		Scanner scanner = new Scanner(System.in);
		
		// taking user input
		System.out.println("Enter the text: ");
		String text = scanner.nextLine();
		System.out.println("Enter the substring that you want to check in text: ");
		String subString = scanner.next();
		
		//applying the logic
		int count = countSubstringOccurance(text,subString);;
		
		// display the result
		System.out.println("The occurance of " + subString + " is total " + count + " times. "); 
		scanner.close();
	}
	
	// method to count Substring Occurance
	public static int countSubstringOccurance(String text,String subString){
		int count = 0;
		for (int i = 0; i <= text.length() - subString.length(); i++) {
            if (text.substring(i, i + subString.length()).equals(subString)) {
                count++;
            }
        }
		return count;
	}		
}