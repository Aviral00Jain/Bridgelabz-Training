import java.util.Scanner;

class StringLengthMethod {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
	
	    // creating scanner object
        Scanner scanner = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter text: ");
        String text = scanner.next();

        int customLength = findLength(text);
        int builtInLength = text.length();
          
		// displaying both method result  
        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + builtInLength);
    }
}