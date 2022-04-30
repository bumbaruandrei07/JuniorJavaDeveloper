package C13_Matrix.homework.generator;

import java.util.Scanner;

public class QuadraticMatrixGeneratorWithArrays {
    /*Se citesc urmatoarele valori de la tastatura, in ordine:

    Parametru	                                             Descriere
    matrixDimension	  Dimensiunea matricei. Ambele dimensiuni vor fi egale, fiind deci vorba despre o matrice patratica.
    mainDiagValue	Un numar intreg, ce reprezinta valoarea elementelor de pe diagonala principala.
    sndDiagValue	Un numar intreg, ce reprezinta valoarea elementelor de pe diagonala secundara.
    centerValue	  Un numar intreg, ce reprezinta valoarea elementului de pe pozitia din centru a matricei.
            → Daca dimensiunea este un numar par, matricea nu va avea un element central si prin urmare aceasta valoare nu se va citi.
    leftValue	Un numar intreg, ce reprezinta valoarea elementelor din „stanga“: cele aflate sub diagonala principala si deasupra diagonalei secundare.
    upValue	Un numar intreg, ce reprezinta valoarea elementelor din „partea de sus“: cele aflate deasupra diagonalei principale si deasupra diagonalei secundare.
    rightValue	Un numar intreg, ce reprezinta valoarea elementelor din „dreapta“: cele aflate deasupra diagonalei principale si sub diagonala secundara.
    bottomValue	Un numar intreg, ce reprezinta valoarea elementelor din „partea de jos“: cele aflate sub diagonala principala si sub diagonala secundara.
    Sa se genereze o matrice, continand valorile mentionate anterior si sa se afiseze. Problema va fi implementata in 2 moduri:

   -> folosind arrays <-
    folosind ArrayList -> on the next class

     */

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of rows and columns: ");
        int matrixDimension = sc.nextInt();


        System.out.println("Enter the elements of the main diagonal: ");  // i == j
        int mainDiagValue = sc.nextInt();

        System.out.println("Enter the elements of the second diagonal: "); // i + j == n-1  (n - size)
        int sndDiagValue = sc.nextInt();

//      leftValue ->  Un numar intreg, ce reprezinta valoarea elementelor din „stanga“: cele aflate sub diagonala principala si deasupra diagonalei secundare.

        System.out.println("Enter the value for the elements located below the main diagonal and above the secondary diagonal: ");
        int leftValue = sc.nextInt();

//        upValue -> Un numar intreg, ce reprezinta valoarea elementelor din „partea de sus“: cele aflate deasupra diagonalei principale si deasupra diagonalei secundare.
        System.out.println("Enter the value for the elements located above the main diagonal and above the secondary diagonal: ");
        int upValue = sc.nextInt();

//        rightValue -> Un numar intreg, ce reprezinta valoarea elementelor din „dreapta“: cele aflate deasupra diagonalei principale si sub diagonala secundara.
        System.out.println("Enter the value for the elements located above the main diagonal and below the secondary diagonal: ");
        int rightValue = sc.nextInt();

//        bottomValue -> Un numar intreg, ce reprezinta valoarea elementelor din „partea de jos“: cele aflate sub diagonala principala si sub diagonala secundara.
        System.out.println("Enter the value for the elements located below the main diagonal and below the secondary diagonal: ");
        int bottomValue = sc.nextInt();


        int[][] matrix = new int[matrixDimension][matrixDimension];


        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i == j) {
                    matrix[i][j] = mainDiagValue;
                }

                if (i + j == matrixDimension - 1) {
                    matrix[i][j] = sndDiagValue;
                }

                if ((i > j) && (i + j < matrixDimension - 1)) {
                    matrix[i][j] = leftValue;
                }

                if ((i < j) && (i + j < matrixDimension - 1)) {
                    matrix[i][j] = upValue;
                }

                if ((i < j) && (i + j > matrixDimension - 1)) {
                    matrix[i][j] = rightValue;
                }

                if ((i > j) && (i + j > matrixDimension - 1)) {
                    matrix[i][j] = bottomValue;
                }

                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();

        }

        //we can set the central element if our matrix isn't quadratic
        if (matrixDimension % 2 == 1) {
            System.out.println("Enter the value for the central element of the matrix: "); //  central element : [n/2][n/2], the dimension of the matrix must be an odd (impar) number
            int centerValue = sc.nextInt();
            matrix[matrixDimension / 2][matrixDimension / 2] = centerValue;
            System.out.println("The central element of the matrix is: " + centerValue);
        }


        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {

                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();
        }
        sc.close();
    }
}
