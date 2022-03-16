package C13_Matrix.homework.operations;

import java.util.Scanner;

public class Multiplication {

    //helper method to display the elements of any matrix
    public static void printMatrix(int matrix[][], int rowSize, int colSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tips : for successful realization of multiplying two matrices the number of columns of the first matrix is equal to the number of rows of the second matrix");
        System.out.println("First matrix - enter the number of rows: ");
        int rowsA = sc.nextInt();
        System.out.println("First matrix - enter the number of columns: ");
        int columnsA = sc.nextInt();
        System.out.println("Second matrix - enter the number of rows: ");
        int rowsB = sc.nextInt();
        System.out.println("Second matrix - enter the number of columns: ");
        int columnsB = sc.nextInt();

        int[][] matrixA = new int[rowsA][columnsA];
        int[][] matrixB = new int[rowsB][columnsB];
        int[][] matrixC = new int[rowsA][columnsB]; // matricea rezultata va avea numarul de linii a primei matrice si numarul de coloane a celei de-a doua matrice!

        // Inmultire : numarul de coloane a primei matrice trebuie sa fie egal cu numarul de linii a celei de-a doua matrice.


        System.out.println("Enter the elements of matrix A: ");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix B: ");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < columnsB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        if (columnsA == rowsB) {
            System.out.println("Multiplication of Matrix: ");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < columnsB; j++) {
                    for (int k = 0; k < rowsB; k++) {
                        matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
            printMatrix(matrixC, rowsA, columnsB);
        } else {
            System.out.println("The two matrices cannot be multiplied");
        }
        sc.close();
    }
}
