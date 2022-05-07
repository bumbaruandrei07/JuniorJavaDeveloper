package interviewProblems;

import UpcastingDowncasting.nature.Main;

public class SplitArrayMinimalDifference {

    public static int solution(int[] A) {
        int s = 0;

        for (int i = 0; i < A.length; ++i) {
            s += A[i];
        }

        int leftSum = 0;
        int rightSum = s;
        int minDif = Integer.MAX_VALUE;

        for (int i = 0; i < A.length - 1; ++i) {
            leftSum += A[i];
            rightSum -= A[i];

            if (Math.abs(leftSum - rightSum) < minDif) {
                minDif = Math.abs(leftSum - rightSum);
            }
        }

        return minDif;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 3, 4, 5, 6, 1, 2, 3, 5};
        System.out.println(solution(arr));

    }

}
