package C13_Matrix.homework.operations;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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
        int[][] matrixC = new int[columnsA][rowsB];

        // Inmultire : numarul de coloane a primei matrice este egal cu numarul de linii a celei de-a doua matrice.


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
        System.out.println("Multiplication of Matrix: ");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];

                }

            }
        }

        for (int i = 0; i < columnsA; i++) {
            for (int j = 0; j < rowsB; j++) {

                System.out.print(matrixC[i][j] + "\t");
            }

            System.out.println();

        }


        sc.close();
    }
}
