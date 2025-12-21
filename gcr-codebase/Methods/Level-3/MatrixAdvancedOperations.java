class MatrixAdvancedOperations {

    //constants for random matrix values
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 9;

    //method to create random matrix
    public static int[][] createRandomMatrix(int rows, int columns) {

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] =(int) (Math.random() * (MAX_VALUE - MIN_VALUE + 1))+ MIN_VALUE;
            }
        }  return matrix;
    }

    //method to find transpose of a matrix
    public static int[][] findTranspose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        } return transpose;
    }

    // determin of 2x2 matrix
    public static int findDeterminant2x2(int[][] matrix) {
        
		return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    //determinant of 3x3 matrix
    public static int findDeterminant3x3(int[][] m) {

        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])- m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    //inverse of 2x2 matrix
    public static double[][] findInverse2x2(int[][] matrix) {

        int det = findDeterminant2x2(matrix);
        double[][] inverse = new double[2][2];
        inverse[0][0] =  matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] =  matrix[0][0] / (double) det;

        return inverse;
    }

    //nverse of 3x3 matrix
    public static double[][] findInverse3x3(int[][] m) {

        int det = findDeterminant3x3(m);
        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double) det;
        inv[0][1] = (m[0][1]*m[2][2] - m[0][2]*m[2][1]) / (double) det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double) det;

        inv[1][0] = (m[1][0]*m[2][2] - m[1][2]*m[2][0]) / (double) det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double) det;
        inv[1][2] = (m[0][0]*m[1][2] - m[0][2]*m[1][0]) / (double) det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double) det;
        inv[2][1] = (m[0][0]*m[2][1] - m[0][1]*m[2][0]) / (double) det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double) det;

        return inv;
    }

    // displaying int matrix
    public static void displayMatrix(int[][] matrix, String title) {

        System.out.println( title);
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    //displaying double matrix
    public static void displayDoubleMatrix(double[][] matrix, String title) {

        System.out.println("\n" + title);
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(String.format("%.2f\t", value));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // 2x2 Matrix
        int[][] matrix2x2 = createRandomMatrix(2, 2);
        displayMatrix(matrix2x2, "2x2 Matrix");

        int det2 = findDeterminant2x2(matrix2x2);
        System.out.println("Determinant " + det2);

        if (det2 != 0) {
            displayDoubleMatrix(findInverse2x2(matrix2x2), "Inverse of 2x2");
        } else {
            System.out.println("Inverse not possible");
        }

        // 3x3 Matrix
        int[][] matrix3x3 = createRandomMatrix(3, 3);
        displayMatrix(matrix3x3, "3x3 Matrix");

        displayMatrix(findTranspose(matrix3x3), "Transpose of 3x3");

        int det3 = findDeterminant3x3(matrix3x3);
        System.out.println("Determinant (3x3): " + det3);

        if (det3 != 0) {
            displayDoubleMatrix(findInverse3x3(matrix3x3), "Inverse of 3x3");
        } else {
            System.out.println("Inverse not possible");
        }
    }
}