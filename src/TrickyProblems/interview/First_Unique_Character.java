package TrickyProblems.interview;

public class First_Unique_Character {

    public static int firstUniqChar(String s) {
        int[] letters = new int[26];
        for (char c : s.toCharArray()) {
            letters[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (letters[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(firstUniqChar("Leetcode"));
    }
}
