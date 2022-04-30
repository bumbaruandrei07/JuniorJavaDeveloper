package interviewProblems;

import java.util.Scanner;

public class ArrayIntersection {

    private static final Scanner sc = new Scanner(System.in);


    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        int aux;

        do {
            swapped = false;

            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    aux = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = aux;
                    swapped = true;
                }
            }
        } while (swapped);
    }


    private static void removeDuplicate(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                arr[i] = arr[i - 1];
            }
        }
    }

    private static int[] getArray() {
        System.out.println("Introduceti lungimea array-ului");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Introduceti elementele array-ului: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        return arr;
    }


//    private int[] intersection(int[] arr1, int[] arr2) {
//
//
//    }

    public static void main(String[] args) {

        removeDuplicate(getArray());
    }
}
