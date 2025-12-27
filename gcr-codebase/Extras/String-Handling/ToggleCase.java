import java.util.Scanner;
public class ToggleCase {
	public static void main(String []args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String text = scanner.nextLine();
		
		//applying logic 
		String newString = toggleCase(text);
		
		//print the result
		System.out.println("The toggle case String is : " + newString);
		scanner.close();
	}
	
	// Convert the upperCase to lowerCase and vice-versa
	public static String toggleCase(String text){
		String result = "";
		for(int i=0; i<text.length(); i++){
			if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z'){
				int var = text.charAt(i) - 32;
				result += (char)var;
			}
			if(text.charAt(i) >= 'A' && text.charAt(i) <= 'Z'){
				int var = text.charAt(i) + 32;
				result += (char)var;
			}
			if(text.charAt(i)==' '){
				result += text.charAt(i);
			}	
		}
		return result;
	}
}	