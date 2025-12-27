import java.util.Scanner;

public class YoungestAndTallestFriends {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");

            System.out.print("Age: ");
            ages[i] = input.nextInt();

            System.out.print("Height (in cm): ");
            heights[i] = input.nextDouble();

            // Basic validation
            if (ages[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;   // retry the same index
            }
        }

        // Assume first friend as youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find youngest and tallest
        for (int i = 1; i < 3; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest Friend: " + names[youngestIndex] +
                           " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + names[tallestIndex] +
                           " (Height: " + heights[tallestIndex] + " cm)");

        input.close();
    }
}
