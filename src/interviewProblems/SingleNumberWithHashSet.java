package interviewProblems;

import java.util.HashSet;
import java.util.Set;

public class SingleNumberWithHashSet {


    private static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }


    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 2, 1};
        int[] arr2 = new int[]{4, 1, 2, 1, 2};
        int[] arr3 = new int[]{1};
        System.out.println(singleNumber(arr1));
        System.out.println(singleNumber(arr2));
        System.out.println(singleNumber(arr3));
    }

}
