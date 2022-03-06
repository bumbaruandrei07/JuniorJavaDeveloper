package C13_Matrix.homework.operations;

import java.util.Scanner;

public class Difference {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of rows and columns: ");
        int matrixDimension = sc.nextInt();


        System.out.println("Enter the elements of the main diagonal: ");  // i == j
        int mainDiagValueA = sc.nextInt();

        System.out.println("Enter the elements of the second diagonal: "); // i + j == n-1  (n - size)
        int sndDiagValueA = sc.nextInt();

//      leftValue ->  Un numar intreg, ce reprezinta valoarea elementelor din „stanga“: cele aflate sub diagonala principala si deasupra diagonalei secundare.

        System.out.println("Enter the value for the elements located below the main diagonal and above the secondary diagonal: ");
        int leftValueA = sc.nextInt();

//        upValue -> Un numar intreg, ce reprezinta valoarea elementelor din „partea de sus“: cele aflate deasupra diagonalei principale si deasupra diagonalei secundare.
        System.out.println("Enter the value for the elements located above the main diagonal and above the secondary diagonal: ");
        int upValueA = sc.nextInt();

//        rightValue -> Un numar intreg, ce reprezinta valoarea elementelor din „dreapta“: cele aflate deasupra diagonalei principale si sub diagonala secundara.
        System.out.println("Enter the value for the elements located above the main diagonal and below the secondary diagonal: ");
        int rightValueA = sc.nextInt();

//        bottomValue -> Un numar intreg, ce reprezinta valoarea elementelor din „partea de jos“: cele aflate sub diagonala principala si sub diagonala secundara.
        System.out.println("Enter the value for the elements located below the main diagonal and below the secondary diagonal: ");
        int bottomValueA = sc.nextInt();


        int[][] A = new int[matrixDimension][matrixDimension]; //matrice patratice <-> nr de linii = nr. de coloane


        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i == j) {
                    A[i][j] = mainDiagValueA;
                }

                if (i + j == matrixDimension - 1) {
                    A[i][j] = sndDiagValueA;
                }

                if ((i > j) && (i + j < matrixDimension - 1)) {
                    A[i][j] = leftValueA;
                }

                if ((i < j) && (i + j < matrixDimension - 1)) {
                    A[i][j] = upValueA;
                }

                if ((i < j) && (i + j > matrixDimension - 1)) {
                    A[i][j] = rightValueA;
                }

                if ((i > j) && (i + j > matrixDimension - 1)) {
                    A[i][j] = bottomValueA;
                }

                System.out.print(A[i][j] + "\t");
            }

            System.out.println();

        }


        if (matrixDimension % 2 == 1) {
            System.out.println("Enter the value for the central element of the matrix: "); //  central element : [n/2][n/2], the dimension of the matrix must be an odd (impar) number
            int centerValueA = sc.nextInt();
            A[matrixDimension / 2][matrixDimension / 2] = centerValueA;
            System.out.println("The central element of the matrix is: " + centerValueA);
        }


        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {

                System.out.print(A[i][j] + "\t");

            }

            System.out.println();

        }


        int[][] B = new int[matrixDimension][matrixDimension];


        System.out.println("Enter the elements of the main diagonal: ");  // i == j
        int mainDiagValueB = sc.nextInt();

        System.out.println("Enter the elements of the second diagonal: "); // i + j == n-1  (n - size)
        int sndDiagValueB = sc.nextInt();

//      leftValue ->  Un numar intreg, ce reprezinta valoarea elementelor din „stanga“: cele aflate sub diagonala principala si deasupra diagonalei secundare.

        System.out.println("Enter the value for the elements located below the main diagonal and above the secondary diagonal: ");
        int leftValueB = sc.nextInt();

//        upValue -> Un numar intreg, ce reprezinta valoarea elementelor din „partea de sus“: cele aflate deasupra diagonalei principale si deasupra diagonalei secundare.
        System.out.println("Enter the value for the elements located above the main diagonal and above the secondary diagonal: ");
        int upValueB = sc.nextInt();

//        rightValue -> Un numar intreg, ce reprezinta valoarea elementelor din „dreapta“: cele aflate deasupra diagonalei principale si sub diagonala secundara.
        System.out.println("Enter the value for the elements located above the main diagonal and below the secondary diagonal: ");
        int rightValueB = sc.nextInt();

//        bottomValue -> Un numar intreg, ce reprezinta valoarea elementelor din „partea de jos“: cele aflate sub diagonala principala si sub diagonala secundara.
        System.out.println("Enter the value for the elements located below the main diagonal and below the secondary diagonal: ");
        int bottomValueB = sc.nextInt();


        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i == j) {
                    B[i][j] = mainDiagValueB;
                }

                if (i + j == matrixDimension - 1) {
                    B[i][j] = sndDiagValueB;
                }

                if ((i > j) && (i + j < matrixDimension - 1)) {
                    B[i][j] = leftValueB;
                }

                if ((i < j) && (i + j < matrixDimension - 1)) {
                    B[i][j] = upValueB;
                }

                if ((i < j) && (i + j > matrixDimension - 1)) {
                    B[i][j] = rightValueB;
                }

                if ((i > j) && (i + j > matrixDimension - 1)) {
                    B[i][j] = bottomValueB;
                }

                System.out.print(B[i][j] + "\t");
            }

            System.out.println();

        }


        if (matrixDimension % 2 == 1) {
            System.out.println("Enter the value for the central element of the matrix: "); //  central element : [n/2][n/2], the dimension of the matrix must be an odd (impar) number
            int centerValueB = sc.nextInt();
            B[matrixDimension / 2][matrixDimension / 2] = centerValueB;
            System.out.println("The central element of the matrix is: " + centerValueB);
        }


        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {

                System.out.print(B[i][j] + "\t");

            }

            System.out.println();

        }

        int[][] C = new int[matrixDimension][matrixDimension];

        System.out.println("The difference between the 2 matrices is:  " );
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {

                C[i][j] = A[i][j] - B[i][j];
                System.out.print(C[i][j] + "\t");
            }

            System.out.println();

        }

        sc.close();
    }
}
