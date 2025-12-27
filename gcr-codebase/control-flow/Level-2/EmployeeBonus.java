import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        // Check eligibility for bonus
        if (yearsOfService > 5) {

            double bonus = salary * 0.05; // 5% bonus
            System.out.println("The bonus amount is " + bonus);

        } else {

            System.out.println("No bonus applicable.");
        }

        input.close();
    }
}

