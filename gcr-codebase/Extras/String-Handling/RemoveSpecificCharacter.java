import java.util.Scanner;
public class RemoveSpecificCharacter{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
        String str = scanner.nextLine();
		System.out.println("Character to Remove: ");
        char remove = scanner.next().charAt(0);
		
		//applying the logic
		String modified = modifiedString(str,remove);
		
		// print the result
		System.out.println("Modified String: " + modified);
		scanner.close();
	}
	
	// method to modified String
	public static String modifiedString(String str, char remove){
		String result = "";
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == remove){
				continue;
			}
			result += str.charAt(i);
		}
		return result;
	}
}	