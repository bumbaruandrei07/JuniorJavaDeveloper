package subiecteExamen1.simulare;

import java.util.Arrays;

public class ArrayWithLastDigit {


    private static int[] getLastDigits(int[] arr) {
        int[] arrWithLastDigit = new int[arr.length];
        for (int i = 0; i < arrWithLastDigit.length; i++) {
            arrWithLastDigit[i] = arr[i] % 10;
        }
        return arrWithLastDigit;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{19, 1, 39, 2, 3, 5, 10, 987};
        System.out.println(Arrays.toString(getLastDigits(arr)));
    }
}
