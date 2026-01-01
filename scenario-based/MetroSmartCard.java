import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 200;   // Initial Smart Card Balance
        System.out.println("Initial Smart Card Balance: " + balance);

        while (true) {
            System.out.print("\nEnter distance travelled in km (or -1 to quit): ");
            double distance = sc.nextDouble();

            // Exit condition
            if (distance == -1) {
                System.out.println("Thank you for using Metro Smart Card!");
                break;
            }

            // Fare calculation using Ternary Operator
            double fare = (distance <= 5) ? 20 :
                          (distance <= 10) ? 30 : 40;

            System.out.println("Fare for this trip: " + fare);

            // Check balance
            if (fare > balance) {
                System.out.println("Insufficient Balance! Please recharge.");
                break;
            }

            // Deduct fare
            balance -= fare;
            System.out.println("Remaining Balance: " + balance);

            // Stop if balance exhausted
            if (balance <= 0) {
                System.out.println("Balance exhausted! Travel stopped.");
                break;
            }
        }
    }
}