package IOFile.course;

import java.util.Arrays;
import java.util.Scanner;

public class Notes {

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
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = arr[1 + 1];
            }
        }
    }

    private static void getArray(int[] arr) {
        System.out.println("Introduceti elementele array-ului: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }


    private static void mergeArrays(int[] A, int[] B) {

        int n = A.length;
        int m = B.length;
        int[] result = new int[n + m];
        System.arraycopy(A, 0, result, 0, n);
        System.arraycopy(B, 0, result, n, m);
        System.out.println("Array-ul rezultat in urma adaugarii primilor 2 este: ");
        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti lungimea primului vector: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Intrduceti elementele array-ului: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Introduceti lungimea celui de-al doilea vector: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Intrduceti elementele array-ului: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }


        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));

        mergeArrays(arr1, arr2);
    }
}
