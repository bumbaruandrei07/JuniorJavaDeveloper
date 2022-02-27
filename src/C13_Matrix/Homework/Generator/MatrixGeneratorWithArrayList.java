package C13_Matrix.Homework.Generator;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixGeneratorWithArrayList {

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


//        get -> nr.liniei (i-ul)
//        primul parametru din set() -> nr. coloanei (j-ul)  -- pt update avem set

        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {

                if (i == j) {
                    matrix.get(i).set(j, mainDiagValue);
                }

                if (i + j == matrixDimension - 1) {

                }

            }
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