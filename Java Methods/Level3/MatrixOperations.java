import java.util.*;

public class MatrixOperations {
    static Scanner sc = new Scanner(System.in);

    // Create random matrix
    public static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random values 0-9
            }
        }
        return matrix;
    }

    // Add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    // Subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

    // Multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, n = A[0].length;
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    // Display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] A = createMatrix(rows, cols);
        int[][] B = createMatrix(rows, cols);

        System.out.println("\nMatrix A:");
        displayMatrix(A);
        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nAddition:");
        displayMatrix(addMatrices(A, B));

        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrices(A, B));

        if (cols == rows) {
            System.out.println("\nMultiplication:");
            displayMatrix(multiplyMatrices(A, B));
        } else {
            System.out.println("\nMatrix multiplication not possible!");
        }
    }
}