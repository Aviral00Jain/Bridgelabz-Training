import java.util.Scanner;

public class MeanHeightFootballTeam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Take input for heights
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate mean height
        double meanHeight = sum / heights.length;

        // Display result
        System.out.println("The mean height of the football team is " + meanHeight);

        input.close();
    }
}
