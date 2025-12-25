import java.util.Scanner;

public class MaximumOfThree {

    // method to find maximum
    public static int findMaximum(int a, int b, int c) {

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {

        // creating scanner class object
        Scanner sc = new Scanner(System.in);

        // taking user inputs
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // finding maximum
        int maximum = findMaximum(num1, num2, num3);

        // displaying result
        System.out.println("Maximum number is: " + maximum);
    }
}
