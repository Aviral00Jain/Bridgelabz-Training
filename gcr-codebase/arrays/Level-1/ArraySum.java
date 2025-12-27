import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array of size 10
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite while loop
        while (true) {
            System.out.print("Enter a number: ");
            double value = input.nextDouble();

            // Break if value is 0 or negative
            if (value <= 0) {
                break;
            }

            // Break if array is full
            if (index == 10) {
                break;
            }

            // Store value in array
            numbers[index] = value;
            index++;
        }

        // Calculate sum using for loop
        for (int i = 0; i < index; i++) {
            System.out.println("Number at index " + i + " is " + numbers[i]);
            total = total + numbers[i];
        }

        // Display total
        System.out.println("The sum of all numbers is " + total);

        input.close();
    }
}
