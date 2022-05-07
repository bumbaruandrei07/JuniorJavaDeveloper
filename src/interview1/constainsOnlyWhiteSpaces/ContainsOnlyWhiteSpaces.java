package interview1.constainsOnlyWhiteSpaces;

import java.util.Scanner;

public class ContainsOnlyWhiteSpaces {
    //TODO We can use the trim() method of String class to remove the leading whitespaces in the string.
    //  Then we can use the isEmpty() method of String class to check if the resultant string is empty or not.
    //  If the string contained only whitespaces, then this method will return true
    private static final Scanner sc = new Scanner(System.in);
    static String s = sc.nextLine();

    public static boolean containsOnlyWhiteSpaces() {

        if (s.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean containsWhiteSpace() {
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == ' ')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

       // System.out.println(containsOnlyWhiteSpaces());
        System.out.println(containsWhiteSpace());

    }
}
