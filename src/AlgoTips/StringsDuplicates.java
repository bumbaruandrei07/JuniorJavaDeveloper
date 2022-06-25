package AlgoTips;

import java.util.HashSet;
import java.util.Set;

public class StringsDuplicates {


    private static boolean containsDuplicates(String[] arr) {

        Set<String> mySet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            mySet.add(arr[i]);
        }
        // daca multimea elementelor din set coincide cu dimensiunea vectorului, atunci nu exista duplicate, deoarece set-ul contine doar elemente unice
        if (mySet.size() == arr.length) {
            return false;
        }
        //array-ul contine duplicate
        return true;
    }

    private static int numberOfDuplicates(String[] arr) {
        Set<String> mySet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            mySet.add(arr[i]);
        }
        return arr.length - mySet.size();
    }


    public static void main(String[] args) {
        String[] arr = {"Ana", "maria", "Ioana", "Ana", "Ana"};
        System.out.println(containsDuplicates(arr));
        System.out.println(numberOfDuplicates(arr));
    }
}
