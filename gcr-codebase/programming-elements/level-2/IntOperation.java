import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take inputs for a, b, and c
        System.out.print("Enter value for a: ");
        int a = input.nextInt();

        System.out.print("Enter value for b: ");
        int b = input.nextInt();

        System.out.print("Enter value for c: ");
        int c = input.nextInt();

        // Perform integer operations
        int result1 = a + b * c;  // Multiplication first, then addition
        int result2 = a * b + c;  // Multiplication first, then addition
        int result3 = c + a / b;  // Division first, then addition
        int result4 = a % b + c;  // Modulus first, then addition

        // Display results
        System.out.println(
            "The results of Int Operations are " +
            result1 + ", " + result2 + ", " + result3 + ", and " + result4
        );

        // Close scanner
        input.close();
    }
}
