import java.util.Scanner;
public class RemoveDuplicate{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scanner.next();
		
		// applying logic
		String newString = removeDuplicate(str);
		
		// display the output
		System.out.println("The modified string is: "+ newString);
		
		scanner.close();
	}
	
	// Remove Duplicate the String
	public static String removeDuplicate(String str){
		String result = "";
		for(int i=0; i<str.length(); i++){
			if(result.indexOf(str.charAt(i))==-1){
				result += str.charAt(i);
			}
		}
		return result;
	}	
}