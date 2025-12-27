import java.util.Scanner;
public class PalindromeCheck{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = scanner.next();
		
		//applying the logic
		boolean isPalindrome = checkPalindrome(str);
		
		//display the result
		System.out.println(" Given String is a palindrome ? " + isPalindrome);
		scanner.close();
	}
	
	// check Palindrome 
	public static boolean checkPalindrome(String str){
		int start = 0;
		int end = str.length()-1;
		while(start <= end){
			if(str.charAt(start) != str.charAt(end)){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}