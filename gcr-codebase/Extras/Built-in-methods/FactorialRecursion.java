import java.util.Scanner;

public class FactorialRecursion {

    // recursive method to calculate factorial
    public static int factorial(int number) {

        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {

        // creating scanner class object
        Scanner sc = new Scanner(System.in);

        // taking input from user
        int number = sc.nextInt();

        // calculating factorial
        int result = factorial(number);

        // displaying result
        System.out.println("Factorial is " + result);
    }
}
