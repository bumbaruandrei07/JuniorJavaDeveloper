package interviewProblems;

import java.util.HashSet;

public class DistributeCandies {

    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> mySet = new HashSet<>();
        int n = candyType.length;
        for (int num : candyType) {
            mySet.add(num);
        }

        int upperLimit = n / 2;
        if (mySet.size() < upperLimit) {
            return mySet.size();
        }
        return upperLimit;
    }

    public static void main(String[] args) {
        int[] candyType1 = new int[]{1, 1, 2, 2, 3, 3};
        int[] candyType2 = new int[]{1, 1, 2, 3};
        int[] candyType3 = new int[]{6, 6, 6, 6};
        System.out.println(distributeCandies(candyType1));
        System.out.println(distributeCandies(candyType2));
        System.out.println(distributeCandies(candyType3));

    }

}

