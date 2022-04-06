package TrickyProblems.interview;

import java.util.Random;

public class ListaVeciniMatrice {

    private static final int dimensionLimit = 10;
    private static final int valueLimit = 1000;

    private static int[] dirX = {-1, -1, 0, +1, +1, +1, 0, -1};
    private static int[] dirY = {0, +1, +1, +1, 0, -1, -1, -1};

    // Optional: this is for demo only.
    private static String[] dirName = {"N", "NE", "E", "SE", "S", "SV", "V", "NV"};

    private static Random random = new Random();

    public static void main(String[] args) {

        // Generate a random matrix, max of 9x9
        int n = random.nextInt(dimensionLimit - 2) + 2,
                m = random.nextInt(dimensionLimit - 2) + 2;

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = random.nextInt(valueLimit);
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int elementI = random.nextInt(n);
        int elementJ = random.nextInt(m);
        System.out.println("The (randomly) chosen point is: matrix[" +
                elementI + "][" + elementJ + "]=" + mat[elementI][elementJ]);
        System.out.println();

        System.out.println("The neighbors are: ");
        int countNeigh = 0;
        for (int i = 0; i < dirX.length; i++) {
            int neighI = elementI + dirX[i];
            int neighJ = elementJ + dirY[i];
            if (neighI >= 0 && neighI < n && neighJ >= 0 && neighJ < m) {
                // valid coordinates
                System.out.println("The " + dirName[i] + " neighbor is: matrix[" +
                        neighI + "][" + neighJ + "]=" + mat[neighI][neighJ]);
                countNeigh++;
            }
        }
        System.out.println();

        System.out.println("Number of neighbors: " + countNeigh + ".");
    }
}
