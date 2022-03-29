package TrickyProblems.interview;

import java.util.Arrays;

public class SelectionSort {


    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {

            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap the found minimum element with the first
            // element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }


    public static void main(String[] args) {

        int[] arr = {9, 2, 3, 4, 12, 4, 5};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
