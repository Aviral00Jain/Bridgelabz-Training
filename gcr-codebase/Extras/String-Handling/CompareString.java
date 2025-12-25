import java.util.Scanner;
public class CompareString {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String 1: ");
		String text1 = scanner.next();
		System.out.println("Enter the String 2: ");
		String text2 = scanner.next();
		
		//applying logic 
		compareString(text1,text2);
		scanner.close();
	}
	
	// method to compare the String 
	public static void compareString(String var1, String var2){
		int length1 = var1.length();
		int length2 = var2.length();
		int minLength = Math.min(length1,length2);
		for(int i=0; i<minLength; i++){
			char char1 = var1.charAt(i);
			char char2 = var2.charAt(i);
			
			if(char1 < char2){
				System.out.println("\"" + var1 + "\" comes before \"" + var2 + "\" in lexicographical order");
				return;
			}
			else if(char1 > char2){
				System.out.println("\"" + var2 + "\" comes before \"" + var1 + "\" in lexicographical order");
				return ;
			}
		}
		if (length1 < length2) {
            System.out.println("\"" + var1 + "\" comes before \"" + var2 + "\" in lexicographical order");
        } else if (length1 > length2) {
            System.out.println("\"" + var2 + "\" comes before \"" + var1 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are identical");
        }
	}
}	