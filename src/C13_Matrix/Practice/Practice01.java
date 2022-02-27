package C13_Matrix.Practice;

public class Practice01 {


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

        // 4. Accessing elements in the matrix
        System.out.println("The element from the row 2 and column 5 is : " + numbers[2][5]);
        System.out.println("The element from the row 2 and column 4 is : " + numbers[2][4]);


        // 5. Iterate over all elements
        // -> we have to use 2 iterators (which will work as in image)
        //   -> i will be used for rows
        //   -> j will be used for columns
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println("Element on line " + i +
                        " and column " + j + " is " + numbers[i][j]);
            }
        }
        System.out.println();

        // 6. Printing the matrix (in space)
        System.out.println("The matrix representation is: ");
        for(int i=0; i<numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
