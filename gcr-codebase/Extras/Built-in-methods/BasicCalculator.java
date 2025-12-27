import java.util.Scanner;

public class BasicCalculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        // scanner object
        Scanner sc = new Scanner(System.in);

        // taking input from user
		System.out.println("Enter number 1");
        int num1 = sc.nextInt();
		System.out.println("Enter number 2");
        int num2 = sc.nextInt();
		System.out.println("Enter choice , 1 - add , 2 - subtract, 3 - multiply, 4 - divide");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println(add(num1, num2));
        } 
        else if (choice == 2) {
            System.out.println(subtract(num1, num2));
        } 
        else if (choice == 3) {
            System.out.println(multiply(num1, num2));
        } 
        else if (choice == 4) {
            System.out.println(divide(num1, num2));
        }
    }
}
