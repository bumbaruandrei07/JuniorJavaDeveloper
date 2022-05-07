package interviewProblems;

import java.util.*;

public class First_Unique_Character_String {

    private static int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            boolean found = true;
            for (int j = i + 1; j < s.length(); j++) {
                if (c[i] == c[j] && (i != j)){
                    found = false;
                    break;
                }
            }
            if (found == true) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        System.out.println(firstUniqChar(myString));
    }
}
