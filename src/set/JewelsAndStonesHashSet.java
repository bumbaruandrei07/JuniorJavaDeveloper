package set;
import java.util.HashSet;
import java.util.Set;

public class JewelsAndStonesHashSet {

//    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//    You must implement a solution with a linear runtime complexity and use only constant extra space.

    private static int numJewelsInStones(String jewels, String stones) {

        int matches = 0;
        Set<Character> mySet = new HashSet<>();

        //jewels nu poate contine duplicate -> il adaugam intr-un HashSet
        for (int j = 0; j < jewels.length(); j++) {
            mySet.add(jewels.charAt(j));
        }

        //daca hashset-ul contine un element din stones, atunci crestem matches
        for (int s = 0; s < stones.length(); s++) {
            if (mySet.contains(stones.charAt(s))) {
                matches++;
            }
        }
        return matches;
    }

    public static void main(String[] args){
        System.out.println(numJewelsInStones("Aa","aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
        System.out.println(numJewelsInStones("Oo", "OOOo"));
    }


}
