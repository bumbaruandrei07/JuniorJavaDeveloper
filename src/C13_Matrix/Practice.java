package C13_Matrix;

public class Practice {

    public static void main(String[] args) {
        // 1. Defining a new bi-dimensional array
        // 2. Initializing the array (i.e. allocate memory for the (6) elements)
        int[][] numbers = new int[5][6]; // int[<NUMBER_OF_ROWS>][<NUMBER_OF_COLUMNS>]


        // 3. Updating values of elements
        numbers[2][1] = 101;  // Number is on line 2, column 1.
        // Note: numbering starts at 0 (as always).
        // Look for number 101 in the image!
        numbers[0][0] = 2;  // first position in matrix
        numbers[4][5] = 91; // last position in matrix
        numbers[3][3] = 88;
        numbers[2][5] = 55;
        numbers[3][0] = 923;




    }
}
