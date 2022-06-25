package interviewProblems;

import java.util.Arrays;

public class MergeSortedArray {

    public static int[] merge(int[] foo, int[] bar) {

        int fooLength = foo.length;
        int barLength = bar.length;

        int[] merged = new int[fooLength + barLength];

        int fooPosition, barPosition, mergedPosition;
        fooPosition = barPosition = mergedPosition = 0;

        while (fooPosition < fooLength && barPosition < barLength) {
            if (foo[fooPosition] < bar[barPosition]) {
                merged[mergedPosition++] = foo[fooPosition++];
            } else {
                merged[mergedPosition++] = bar[barPosition++];
            }
        }

        while (fooPosition < fooLength) {
            merged[mergedPosition++] = foo[fooPosition++];
        }

        while (barPosition < barLength) {
            merged[mergedPosition++] = bar[barPosition++];
        }

        return merged;
    }
//    public static void merge2(int[] array1, int m, int[] array2, int n) {
//        m--;
//        n--;
//
//        while (n >= 0) {
//            if (m < 0 || array1[m] < array2[n]) {
//                array1[n + m + 1] = array2[n];
//                n--;
//            } else {
//                array1[n + m + 1] = array1[m];
//                m--;
//            }
//        }
//
//    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 1, 2, 4};
        int[] arr2 = {2, 3, 4, 5};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
}
