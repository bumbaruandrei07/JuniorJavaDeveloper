package C13_Matrix.Homework;

import java.util.Scanner;

public class MatrixGenerator {
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

    folosind arrays
    folosind ArrayList

     */

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the number of rows and columns: ");
        int a = sc.nextInt();

        int[][] matrix = new int[a][a];


        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.println("Element on line " + i +
                        " and column " + j + " is " + matrix[i][j]);
            }


        }


    }
}
