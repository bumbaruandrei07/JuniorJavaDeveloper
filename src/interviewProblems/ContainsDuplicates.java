package interviewProblems;

import java.util.HashSet;

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        //initializare HashSet
        HashSet<Integer> mySet = new HashSet<>();
        //adaugarea tuturor elementelor array-ului in HashSet
        for (int num : nums) {
            mySet.add(num);
        }
        //daca dimensiunea HashSetului coincide cu dimensiuniea array-ului primit ca parametru, atunci nu exista elemente duplicate.
        //daca array-ul ar contine elemente duplicate, atunci dimensiunea HashSetului va fi mai mica decat cea a array-ului
        if (mySet.size() == nums.length) {
            return false;
        } else return true;

    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 4};
        System.out.println(containsDuplicate(nums));

    }

}
