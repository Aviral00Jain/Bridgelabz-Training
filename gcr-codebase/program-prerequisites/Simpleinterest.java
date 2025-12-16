import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display result
        System.out.println("Simple Interest = " + simpleInterest);

        // Close scanner
        sc.close();
    }
}
