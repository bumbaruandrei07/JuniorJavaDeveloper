package interview1.movingZeros;

public class MovingZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 1, 3, 0, 23, 0, 1, 23};
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[counter] = arr[i];
                counter++;
            }
        }
        while (counter < arr.length) {
            arr[counter] = 0;
            counter++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
