package interviewProblems;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray(int[] nums, int k) {
        int len = nums.length;
        int[] res = new int[len];

        // to avoid errors with Index out of arrays & increase effectiveness
        // In some test cases there is k > than length of array, that means that
        // you will rotate your array few times. To avoid this we need to
        // decrease k and make our array rotate only once

        while (k > len)
            k = k - len;

        // this part of code to write a rotated last part to the beggining
        // of our new array

        for (int i = 0; i < k; i++) {
            res[i] = nums[len - k + i];
        }

        // this part to replace first values of array of array to the end
        // of our new array

        for (int i = 0; i < len - k; i++) {
            res[k + i] = nums[i];
        }

        // the last part to write everything we have in our new array to original

        for (int i = 0; i <= len - 1; i++) {
            nums[i] = res[i];
        }
        return nums;
    }

    public static int[] rotateArrayOptimized(int[] A, int K) {
        int[] B = new int[A.length];

        //corner case, daca lungimea array-ului e 0, atunci daca nu tratam si ajungem sa facem modulo o sa avem RuntimeException
        if (A.length == 0) {
            return A;
        }

        K = K % A.length;

        for (int i = 0; i < A.length; i++) {
            B[(i + K) % A.length] = A[i];
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateArrayOptimized(A, 2)));

    }

}
