package interviewProblems;

import java.util.HashSet;
import java.util.Set;

public class JewelsStonesWIthHashSet {

    public static int numJewelsInStones(String jewels, String stones) {
        int matches = 0;

        //jewels nu poate contine duplicate -> il adaugam intr-un HashSet
        Set<Character> mySet = new HashSet<>();
        for (int j = 0; j < jewels.length(); j++) {
            mySet.add(jewels.charAt(j));
        }
        //daca hashset-ul contine un element din stones, atunci crestem matches
        for (int i = 0; i < stones.length(); i++) {
            if (mySet.contains(stones.charAt(i))) {
                matches++;
            }
        }
        return matches;
    }


    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

}

