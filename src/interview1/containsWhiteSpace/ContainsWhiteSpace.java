package interview1.containsWhiteSpace;

import java.util.Scanner;

public class ContainsWhiteSpace {

    private static final Scanner sc = new Scanner(System.in);
    static String s = sc.nextLine();

    private static boolean containsWhiteSpaces() {

        if (s.contains(" ")) {
            return true;
        } else return false;
    }


    public static void main(String[] args) {
        System.out.println(containsWhiteSpaces());
    }
}
