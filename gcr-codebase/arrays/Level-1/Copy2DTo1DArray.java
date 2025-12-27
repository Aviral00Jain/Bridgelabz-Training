import java.util.Scanner;

public class Copy2DTo1DArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for rows and column
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        // Check for valid input
        if (rows <= 0 || columns <= 0) {
            System.out.println("Rows and columns must be positive integers.");
            return;
        }

        // Create 2D array
        int[][] matrix = new int[rows][columns];

        // Take input for 2D array elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Create 1D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy 2D array elements into 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display 1D array
        System.out.println("Elements of the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}
