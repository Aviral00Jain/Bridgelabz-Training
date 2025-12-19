import java.util.Scanner;

public class ZaraEmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalEmployees = 10;

        // Arrays to store data
        double[] salary = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];
        double[] bonus = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Taking input
        System.out.println("Enter salary and years of service for 10 employees:");

        for (int i = 0; i < totalEmployees; i++) {

            System.out.println("Employee " + (i + 1) + ":");

            System.out.print("Salary: ");
            double sal = input.nextDouble();

            System.out.print("Years of Service: ");
            double years = input.nextDouble();

            // Validation
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--; // decrement index to retry
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        // Calculate bonus and new salary
        for (int i = 0; i < totalEmployees; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nTotal Old Salary of all employees: INR " + totalOldSalary);
        System.out.println("Total Bonus Payout by Zara: INR " + totalBonus);
        System.out.println("Total New Salary of all employees: INR " + totalNewSalary);

        input.close();
    }
}
