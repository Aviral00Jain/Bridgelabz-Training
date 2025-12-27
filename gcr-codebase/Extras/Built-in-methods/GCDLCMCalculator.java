import java.util.Scanner;

public class GCDLCMCalculator {

    // method to calculate GCD
    public static int findGCD(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // method to calculate LCM
    public static int findLCM(int a, int b) {

        int gcd = findGCD(a, b);
        return (a * b) / gcd;
    }

    public static void main(String[] args) {

        // creating scanner class object
        Scanner sc = new Scanner(System.in);

        // taking user input
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = findGCD(num1, num2);
        int lcm = findLCM(num1, num2);

        // displaying result
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
