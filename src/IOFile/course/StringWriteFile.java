package IOFile.course;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StringWriteFile {

    private static final Scanner sc = new Scanner(System.in);


    private static String[] getArray() throws InputMismatchException {
        try {
            System.out.println("Introduceti lungimea array-ului: ");
            int n = sc.nextInt();

            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            return arr;
        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println("Introduceti valori numerice!");
        }
        return null;
    }

    private static String firstAlphabeticalElement(String[] arr) {

        int n = arr.length;
        String aux;
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("First element: " + arr[0]);
        return arr[0];
    }


    public static String smallest(String[] words) throws java.lang.NullPointerException {
        if (words == null || words.length < 1) {
            throw new java.lang.NullPointerException("Cuvantul nu exista!");
        }
        String smallest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallest.length()) {
                smallest = words[i];
            }
        }
        System.out.print("The smallest string in the array is: ");
        return smallest;
    }

    public static void main(String[] args) {
        String[] arr = getArray();
        System.out.println(smallest(arr));
        firstAlphabeticalElement(arr);
        sc.close();
    }
}