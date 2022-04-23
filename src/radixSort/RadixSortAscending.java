package radixSort;

public class RadixSortAscending {

    private static void radixSort(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

            for (int s = 1; max / s > 0; s *= 10) {
                countingSortForRadix(arr, s);
            }

        }
    }

    private static void countingSortForRadix(int[] arr, int s) {
        int[] countingArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < arr.length; i++)
            countingArray[(arr[i] / s) % 10]++;

        for (int i = 1; i < 10; i++)
            countingArray[i] += countingArray[i - 1];

        int[] outputArray = {0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = arr.length - 1; i >= 0; i--) {
            outputArray[--countingArray[(arr[i] / s) % 10]] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = outputArray[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {73, 481, 57, 23, 332, 800, 754, 125};
        System.out.println("Initial array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        radixSort(arr);
        System.out.println();
        System.out.println("Array sorted with radix sort method: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}

