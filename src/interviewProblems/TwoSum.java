package interviewProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static int[] twoSum(int[] nums, int target) {
        int[] sums = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if ((nums[i] + nums[j] == target) && (i != j)) {
                    sums[0] = i;
                    sums[1] = j;
                }
            }
        }
        return sums;
    }

    public static int[] twoSumWithHashSet(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //complementul este target - valoarea din array
            int complement = target - nums[i];
            //daca map-ul contine complementul atunci intoarcem un vector ce contine indexul la care se afla complementul
            // si indexul la care ne aflam in for, adica indexul lui nums[i] din target - nums[i]
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            //cheia este valoarea din array si valoarea map-ului este indexul la care se afla valoarea
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }


    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
        System.out.println(Arrays.toString(twoSumWithHashSet(arr, 9)));
    }
}
