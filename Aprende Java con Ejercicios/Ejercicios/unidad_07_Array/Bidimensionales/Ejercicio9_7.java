package unidad_07_Array.Bidimensionales;
/*
Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados.
 */

import unidad_07_Array.Methods;

import java.util.Random;

public class Ejercicio9_7 {//Hecho x ChatGPT, la verda'
    public static void main(String[] args) {
        int[][] matrix = generateRandomMatrix(12, 12, 0, 100);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotateClockwise(matrix);

        System.out.println("\nMatrix After Rotation:");
        printMatrix(matrix);
    }

    // Method to generate a random matrix of specified dimensions and range
    public static int[][] generateRandomMatrix(int rows, int cols, int min, int max) {
        int[][] matrix = new int[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }

        return matrix;
    }

    // Method to rotate a square matrix one position clockwise
    public static void rotateClockwise(int[][] matrix) {
        int n = matrix.length;
        int layers = n / 2;

        for (int layer = 0; layer < layers; layer++) {
            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];

                // Move left to top
                matrix[first][i] = matrix[last - offset][first];

                // Move bottom to left
                matrix[last - offset][first] = matrix[last][last - offset];

                // Move right to bottom
                matrix[last][last - offset] = matrix[i][last];

                // Move top to right
                matrix[i][last] = top;
            }
        }
    }

    // Method to print the matrix with aligned numbers
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%3d ", num);
            }
            System.out.println();
        }
    }
}
