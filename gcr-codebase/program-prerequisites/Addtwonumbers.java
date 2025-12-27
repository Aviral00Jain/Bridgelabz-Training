import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take first number input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        // Take second number input
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculate sum
        int sum = num1 + num2;

        // Print result
        System.out.println("Sum = " + sum);

        // Close scanner
        sc.close();
    }
}
