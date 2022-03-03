package C13_Matrix.quiz;

public class Ex05 {
    public static void main(String[] args) {


        int dim = 5;
        int[][] heights = new int[dim][dim];
        int[] row = {1, 2, 3, 4, 5}; // variabila de tipul int []

        for (int i = 0; i < heights.length; i++) { //parcurgem fiecare linie
            heights[i] = row; //fiecare linie ia valoarea lui row, row este o referinta
        }
        //toate liniile matricei noastre pointeaza catre acelasi array

        for (int i = 0; i < row.length; i++) {
            heights[0][i] = i % 2;
        }

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[i].length; j++) {
                System.out.print(heights[i][j] + " ");
            }
            System.out.println();
        }

    }
}
