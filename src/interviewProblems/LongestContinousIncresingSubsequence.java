package interviewProblems;

public class LongestContinousIncresingSubsequence {

    //TODO
    // Dandu-se o secventa de numere intregi, neordonate, scrie un algoritm care afiseaza numarul de elemente al subsecventei strict crescatoare maxime.
    // Input: nums = [1,3,5,4,7]
    // Output: 3
    // Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
    // Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
    // 4.
    // Example 2:
    // Input: nums = [2,2,2,2,2]
    // Output: 1
    // Explanation: The longest continuous increasing subsequence is [2] with length 1. Note that it must be strictly
    // increasing.

    public static int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 1;
            }
        }
        return max;
    }


    public static void main(String[] args) {

        int[] valus = {1, 2, 5, 7, 2, 3, 4, 5, 6, 1, 23, 3};
        System.out.println(findLengthOfLCIS(valus));


    }
}
