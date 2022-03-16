package C13_Matrix.homework.generator;

import java.util.ArrayList;
import java.util.Scanner;

public class QuadraticMatrixGeneratorWithArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int matrixDimension = sc.nextInt();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>(matrixDimension);  // reserve n elements for efficiency
        for (int i = 0; i < matrixDimension; i++) {
            ArrayList<Integer> newRow = new ArrayList<Integer>(matrixDimension); // new row
            for (int j = 0; j < matrixDimension; j++) {
                newRow.add(0);
            }
            matrix.add(newRow);
        }

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


//        get -> nr.liniei (i-ul)
//        primul parametru din set() -> nr. coloanei (j-ul)  -- pt update avem set

        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {

                if (i == j) {
                    matrix.get(i).set(j, mainDiagValue);
                }

                if (i + j == matrixDimension - 1) {
                    matrix.get(i).set(j, sndDiagValue);
                }

                if ((i > j) && (i + j < matrixDimension - 1)) {
                    matrix.get(i).set(j, leftValue);
                }

                if ((i < j) && (i + j < matrixDimension - 1)) {
                    matrix.get(i).set(j, upValue);
                }

                if ((i < j) && (i + j > matrixDimension - 1)) {
                    matrix.get(i).set(j, rightValue);
                }

                if ((i > j) && (i + j > matrixDimension - 1)) {
                    matrix.get(i).set(j, bottomValue);
                }

            }
        }
        if (matrixDimension % 2 == 1) {
            System.out.println("Enter the value for the central element of the matrix: "); //  central element : [n/2][n/2], the dimension of the matrix must be an odd (impar) number
            int centerValue = sc.nextInt();
            matrix.get(matrixDimension / 2).set(matrixDimension / 2, centerValue);
            System.out.println("The central element of the matrix is: " + centerValue);
        }

        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                System.out.print(matrix.get(i).get(j) + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}