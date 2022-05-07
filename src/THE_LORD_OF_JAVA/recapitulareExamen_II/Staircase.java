package THE_LORD_OF_JAVA.recapitulareExamen_II;

public class Staircase {


    private static void printStairCase(int n) {

        String[][] stairCase = new String[n][n];
        for (int i = 0; i < stairCase.length; i++) {
            for (int j = 0; j < stairCase[0].length; j++) {
//             Formula pentru elementele de sub diagonala secundara pe o matrice pătratică
                if (i + j >= n - 1) {
                    stairCase[i][j] = "#";
                }
                else{
                    stairCase[i][j] = " ";
                }

            }
        }

        for (int i = 0; i < stairCase.length; i++) {
            for (int j = 0; j < stairCase[i].length; j++) {
                System.out.print(stairCase[i][j]);
            }
            System.out.println();
        }
    }


    public static void staircase(int n) {
        for(int i = 1; i <= n; i++ ){
            int numSpaces = n - i;
            //print out the spaces
            for(int j = 0; j < numSpaces; j++){
                System.out.print(' ');
            }

            for(int j = 0; j < i; j++){
                System.out.print('#');
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        printStairCase(6);
    // staircase(6);


    }
}
