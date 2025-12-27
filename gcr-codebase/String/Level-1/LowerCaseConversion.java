import java.util.Scanner;

class LowerCaseConversion {

    // lowercase conversion
    static String toLowerCaseCustom(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String builtInLower = text.toLowerCase();
        String customLower = toLowerCaseCustom(text);
        boolean result = true;

        // comparing both methods		
		if (builtInLower.length() != customLower.length()){
		result = false;
		}
        else {
		    for (int i = 0; i < builtInLower.length(); i++) {
                 if (builtInLower.charAt(i) != customLower.charAt(i))
                result = false;
            }
		}
        System.out.println("Comparison Result: " + result);
    }
}