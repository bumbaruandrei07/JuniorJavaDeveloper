package interview1.movingZeros;

public class MovingZerosToStart {

    public static void main(String[] args){

        //step 1
       // The array is given. We will scan the elements from end to start. For example, for the array {1,0,2,0,3,0},we will scan one by one element as 0,3,0,2,0 and 1.
        int[] array = {1, 2, 0, 4, 6, 0, 9, 0, 4, 0, 3, 0, 9, 0, 1, 0, 3, 0};

        //step 2
        // Create one variable to store the current index. At first, its value is the last index of the array.
        int current = array.length - 1;

        //step 3
        //Check for each element of the array while scanning, if it is not zero, add the value to the current index of the array.
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 0) {
                array[current] = array[i];
                current--;
            }
        }

        //step 4
        //After all values are completed, fill the remaining position of the array with 0.
        while (current >= 0) {
            array[current] = 0;
            current--;
        }


        //step 5
        // Printing the array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



    }
}
