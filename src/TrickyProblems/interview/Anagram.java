package TrickyProblems.interview;

import java.util.Arrays;

/**
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String s1 = new String(arr1);
        String s2 = new String(arr2);

        if (s1.equals(s2)) {
            return true;
        } else return false;
    }

    public static void main(String[] args){
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
