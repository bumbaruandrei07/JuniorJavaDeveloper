package interviewProblems;

import java.util.*;

public class KeyboardRow {


    public static String[] findWords(String[] words) {

        Set<Character> row1 = new HashSet<Character>();
        Set<Character> row2 = new HashSet<Character>();
        Set<Character> row3 = new HashSet<Character>();
        String str1 = "qwertyuiop", str2 = "asdfghjkl", str3 = "zxcvbnm";
        for (char c : str1.toCharArray()) {
            row1.add(c);
        }
        for (char c : str2.toCharArray()) {
            row2.add(c);
        }
        for (char c : str3.toCharArray()) {
            row3.add(c);
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String wordsi = words[i].toLowerCase();
            char[] c = wordsi.toCharArray();
            List<Character> word = new ArrayList<>();
            for (char cc : c) {
                word.add(cc);
            }
            if (row1.containsAll(word) || row2.containsAll(word) || row3.containsAll(word)) {
                result.add(words[i]);
            }
        }
        String[] res = new String[result.size()];
        int ind = 0;
        for (String s : result) {
            res[ind] = s;
            ind++;
        }

        return res;
    }


    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }
}
