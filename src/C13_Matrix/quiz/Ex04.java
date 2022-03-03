package C13_Matrix.quiz;

public class Ex04 {
    public static void main(String[] args) {
        int dim = 4;
        int[][] heights = new int[dim][dim]; // matrice 4 X 4


        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[i].length; j++) {
                heights[i][j] = i * heights[i].length + j + 1;
            }
        }

        for (int i = 0; i < heights.length / 2; i++) {
            int[] aux = heights[heights.length - i - 1];
            heights[heights.length - i - 1] = heights[i];
            heights[i] = aux;
        }

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[i].length; j++) {
                System.out.print(heights[i][j] + " ");
            }
            System.out.println();
        }
    }
}
