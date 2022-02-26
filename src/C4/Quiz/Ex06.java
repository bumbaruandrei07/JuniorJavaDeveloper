package C4.Quiz;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int value = str.length();
        char chValue = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if (value > counter) {
                value = counter;
                chValue = str.charAt(i);
            }
        }

        System.out.println(chValue);
    }
}
