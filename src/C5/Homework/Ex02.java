package C5.Homework;

import java.util.ArrayList;

public class Ex02 {

    public static void main(String[] args) {
        printCharWithMaxFrequency("Ana Are Mere");
    }

    public static void printCharWithMaxFrequency(String s) {
        s = s.toLowerCase();
//        inlocuim StringBuilder-ul cu un ArrayList

        ArrayList<Character> maxFreqLetters = new ArrayList<Character>();
        int maxFreq = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                continue;
            }

            int charFreq = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    charFreq++;
                }
            }
//            daca gasim un nou maxim, stergem tot ce e in ArrayList si adaugam noul caracter cu numarul maxim de aparitii
            if (charFreq > maxFreq) {
                maxFreq = charFreq;
                maxFreqLetters.clear();
                maxFreqLetters.add(s.charAt(i));
            }
//           altfel, daca gasim caractere care au nr. de aparitii egale cu nr. maxim, doar le adaugam in ArrayList
            else if (charFreq == maxFreq) {
                maxFreqLetters.add(s.charAt(i));
            }
        }

        // detecteaza si afiseaza fiecare element din array care are un numar de aparitii egal cu numarul maxim de aparitii
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                continue;
            }

            int charFreq = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    charFreq++;
                }
            }
            if (charFreq == maxFreq) {
                System.out.println("Character '" + s.charAt(i) +
                        "' appears " + maxFreq + " times.");
            }
        }
    }
}
