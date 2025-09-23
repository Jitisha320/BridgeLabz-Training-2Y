public class MatrixAdvanced {
    // Transpose of a matrix
    public static int[][] transpose(int[][] M) {
        int rows = M.length, cols = M[0].length;
        int[][] T = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                T[j][i] = M[i][j];
            }
        }
        return T;
    }

    // Determinant of 2x2 matrix
    public static int determinant2x2(int[][] M) {
        return M[0][0] * M[1][1] - M[0][1] * M[1][0];
    }

    // Determinant of 3x3 matrix
    public static int determinant3x3(int[][] M) {
        return M[0][0] * (M[1][1] * M[2][2] - M[1][2] * M[2][1])
             - M[0][1] * (M[1][0] * M[2][2] - M[1][2] * M[2][0])
             + M[0][2] * (M[1][0] * M[2][1] - M[1][1] * M[2][0]);
    }

    // Display matrix
    public static void displayMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] M2 = {{1, 2}, {3, 4}};
        int[][] M3 = {{1, 2, 3}, {0, 1, 4}, {5, 6, 0}};

        System.out.println("Original 2x2 Matrix:");
        displayMatrix(M2);
        System.out.println("Determinant: " + determinant2x2(M2));

        System.out.println("\nOriginal 3x3 Matrix:");
        displayMatrix(M3);
        System.out.println("Determinant: " + determinant3x3(M3));

        System.out.println("\nTranspose of 3x3 Matrix:");
        displayMatrix(transpose(M3));
    }
}