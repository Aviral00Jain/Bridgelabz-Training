import java.util.Scanner;

class UpperCaseConversion {

    // uppercase conversion
    public static String toUpperCaseCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String builtInUpper = text.toUpperCase();
        String customUpper = toUpperCaseCustom(text);
        boolean result = true;
		
		// comparing both methods
		if(builtInUpper.length() != customUpper.length()){
		   result =false;
		}
        else{
		
		 for (int i = 0; i < customUpper.length(); i++) {
            if (builtInUpper.charAt(i) != customUpper.charAt(i))
                result=false;
        }
		}
		
        System.out.println("Comparison Result: " + result);
    }
}