package LinkedListCollection.ex04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class BigNumbers {

    //    public LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2) {
//
//
//    }


    public int[] sum(int[] op1, int[] op2) {
        ArrayList<Integer> op1Arr = reverseArray(op1);
        ArrayList<Integer> op2Arr = reverseArray(op2);


//        daca lungimea primului array este mai mica atunci inversam array-urile
        if (op1Arr.size() < op2Arr.size()) {
            ArrayList<Integer> aux = op1Arr;
            op1Arr = op2Arr;
            op2Arr = aux;
        }

        ArrayList<Integer> resArr = new ArrayList<>(); //stocam rezultatele

        int i = 0; // pentru parcurgerea array-urilor
        int overflow = 0; //retine daca rezultatul adunarii este > 10

        while (i < op1Arr.size() && i < op2Arr.size()) { //parcurgem paralel cele doua array-uri , conditia de oprire este sa nu depasim lungimea unuia dintre ele
            int result = op1Arr.get(i) + op2Arr.get(i) + overflow;  // op1Arr.get(i) + op2Arr.get(i) inseamna adunarea celor 2 numere
            overflow = 0;  //il setam aici la 0 pentru ca trebuie resetat de fiecare data

            if (result >= 10) {
                result %= 10; //retin restul impartirii la 10
                overflow = 1; //daca avem overflow (depasim de 10 suma) atunci overflow = 1 si il adugam la urmatoarea insumare
            }
            resArr.add(result);
            ++i; //il crestem ca sa trecem la urmatoarea cifra din array
        }

        while (i < op1Arr.size()) {
            int result = op1Arr.get(i) + overflow;
            overflow = 0;

            if (result >= 10) {
                result %= 10;
                overflow = 1;
            }
            resArr.add(result);
            ++i;
        }

        if (overflow == 1) {
            resArr.add(overflow);
        }
        return transformResult(resArr);
    }


    // helper method to reverse the ArrayList
    public ArrayList<Integer> reverseArray(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>(arr.length);
        for (int digit : arr) {
            arrayList.add(digit);
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public int[] transformResult(ArrayList<Integer> arr) {
        int[] transformedArr = new int[arr.size()];
        Collections.reverse(arr);

        for (int i = 0; i < arr.size(); ++i) {
            transformedArr[i] = arr.get(i);
        }

        return transformedArr;
    }


    public static void main(String[] args) {
        int noTests = 6;

        int[][] op1 = {{0}, {9, 9}, {9}, {2, 1, 7, 8},
                {5, 0, 5, 0, 5}, {1, 0, 8, 6, 7, 8, 9, 4, 2, 3, 4}};
        int[][] op2 = {{1, 0, 1}, {1}, {9, 9, 9, 9}, {5, 9, 6},
                {5, 5, 0, 5, 0}, {3, 4, 2, 8, 9, 7, 9, 2, 3, 4, 9}};
        int[][] correct = {{1, 0, 1}, {1, 0, 0}, {1, 0, 0, 0, 8}, {2, 7, 7, 4},
                {1, 0, 5, 5, 5, 5}, {4, 5, 1, 5, 7, 6, 8, 6, 5, 8, 3}};

        int total = 0;
        for (int i = 0; i < noTests; i++) {
            System.out.println("Test " + (i + 1) + ":");
            String op1S = noToString(op1[i]);
            String op2S = noToString(op2[i]);

            TrickyProblems.interview.BigNumbers bn = new TrickyProblems.interview.BigNumbers();
            int[] rez = bn.sum(op1[i], op2[i]);

            String rezS = noToString(rez);
            String correctS = noToString(correct[i]);
            System.out.println(op1S + " + " + op2S + " = " + rezS + " C: " + correctS +
                    "......" + (rezS.equals(correctS) ? "OK" : "WRONG"));
            System.out.println();

            total += rezS.equals(correctS) ? 1 : 0;
        }

        System.out.println("Your total score is: " + total + " / " + noTests);
        System.out.println(total > 3 ? "You passed! Hurray! :)" : "Sorry.. :(");
    }

    private static String noToString(int[] no) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < no.length; i++) {
            sb.append(no[i]);
        }
        return sb.toString();
    }
}

