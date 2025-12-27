import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();

        // Validation
        if (numberOfChocolates < 0 || numberOfChildren <= 0) {
            System.out.println("Invalid input. Chocolates must be >= 0 and children > 0.");
            return;
        }

        // Call method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Output
        System.out.println("Each child will get " + result[0] + " chocolates");
        System.out.println("Remaining chocolates are " + result[1]);

        input.close();
    }
}
