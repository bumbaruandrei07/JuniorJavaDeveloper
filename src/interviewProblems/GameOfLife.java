package interviewProblems;

import java.util.Scanner;

public class GameOfLife {

    public static void gameOfLife(int[][] board) {
        int[][] board2 = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board2[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int neigh = countNeigh(board2, i, j);
                //1
                if (board2[i][j] == 1 && neigh < 2) {
                    board[i][j] = 0;
                } else if (board2[i][j] == 1 && neigh > 3) {
                    //3
                    board[i][j] = 0;
                } else if (board2[i][j] == 0 && neigh == 3) {
                    //4
                    board[i][j] = 1;
                }

            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
        }

    }

    public static int countNeigh(int[][] mat, int i, int j) {
        int count = 0;
        // left
        if (j - 1 >= 0 && mat[i][j - 1] == 1) {
            count++;
        }
        //right
        if (j + 1 < mat[0].length && mat[i][j + 1] == 1) {
            count++;
        }
        //up
        if (i - 1 >= 0 && mat[i - 1][j] == 1) {
            count++;
        }
        //down
        if (i + 1 < mat.length && mat[i + 1][j] == 1) {
            count++;
        }
        //PD up
        if (i - 1 >= 0 && j - 1 >= 0 && mat[i - 1][j - 1] == 1) {
            count++;
        }
        //PD down
        if (i + 1 < mat.length && j + 1 < mat[0].length && mat[i + 1][j + 1] == 1) {
            count++;
        }
        //SD up
        if (i - 1 >= 0 && j + 1 < mat[0].length && mat[i - 1][j + 1] == 1) {
            count++;
        }
        //SD down
        if (i + 1 < mat.length && j - 1 >= 0 && mat[i + 1][j - 1] == 1) {
            count++;
        }
        return count;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("First matrix - enter the number of rows: ");
        int rowsA = sc.nextInt();
        System.out.println("First matrix - enter the number of columns: ");
        int columnsA = sc.nextInt();

        int[][] matrix = new int[rowsA][columnsA];

        System.out.println("Enter the elements of matrix A: ");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        gameOfLife(matrix);

    }
}
