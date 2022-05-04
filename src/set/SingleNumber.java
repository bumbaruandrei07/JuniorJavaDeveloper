package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingleNumber {

//    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//    You must implement a solution with a linear runtime complexity and use only constant extra space.

    private static int singleNumber1(int[] nums) {

        Set<Integer> mySet1 = new HashSet<>();
        Set<Integer> mySet2 = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (mySet2.contains(nums[i])) {
                continue;
            } else if (!mySet1.contains(nums[i])) {
                mySet1.add(nums[i]);
            } else {
                mySet2.add(nums[i]);
                mySet1.remove(nums[i]);

            }
        }


        Iterator<Integer> itr = mySet1.iterator();
        return itr.next();
    }


    private static int singleNumber2(int[] arr) {

        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (mySet.contains(arr[i])) {
                mySet.remove(arr[i]);
            } else {
                mySet.add(arr[i]);
            }
        }

        Iterator<Integer> iterator = mySet.iterator();
        return iterator.next();

    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(singleNumber1(arr));
        System.out.println(singleNumber2(arr));

    }


}
