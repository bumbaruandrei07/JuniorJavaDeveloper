package C13_Matrix.quiz;

public class Ex02 {


    //TODO What is the output?

    public static void main(String[] args) {
        int x = 3, y = 4;
        int[][] intMatrix = new int[x][y];

        for (int i = 0; i < x * y; i++) { //parcurgem de la 0 la 3 * 4 = 12 (nr. total de elemente ale matricei)
            intMatrix[i / y][i % y] = i + 1;   //
        }

        for (int i = 0; i < intMatrix.length; i++) {
            for (int j = 0; j < intMatrix[i].length; j++) {
                System.out.print(intMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
