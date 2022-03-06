package TrickyProblems.interview;

import java.util.Scanner;

public class LongestContinousIncresingSubsequence {

    //TODO
    // Dandu-se o secventa de numere intregi, neordonate, scrie un algoritm care afiseaza numarul de elemente al subsecventei strict crescatoare maxime.

    public static int longestContinousIncresingSubsequence(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[i + 1]) {
                counter++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


    }
}
