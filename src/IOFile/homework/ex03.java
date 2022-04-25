package IOFile.homework;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ex03 {

    private static final Scanner sc = new Scanner(System.in);

    private static int[] getData() {
        System.out.println("Introduceti dimenstiunea array-ului: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    private static void bubbleSort(int[] arr) {
        boolean swapped;
        int aux;
        int n = arr.length;

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

    private static int[] mergedArray(int[] A, int[] B) {

        int m = A.length;
        int n = B.length;
        int totalLength = m + n;
        int[] mergedArray = new int[totalLength];
        int pos = 0;
        for (int elements : A) {
            mergedArray[pos] = elements;
            pos++;
        }
        for (int elements : B) {
            mergedArray[pos] = elements;
            pos++;
        }
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
        return mergedArray;
    }


    //clasa Scanner nu va mai efectua citirea direct din fisierul input.txt ci din instanta BufferedReader, care la randul sau va efectua citiri din fisier (i.e. in tamponul intern.
    public static void main(String[] args) throws IOException {

        int[] dataToWrite1 = getData();
        bubbleSort(dataToWrite1);

        int[] dataToWrite2 = getData();
        bubbleSort(dataToWrite2);

        int[] dataToWrite3 = mergedArray(dataToWrite1, dataToWrite2);
        //bubbleSort(dataToWrite3);

        FileWriter outputFile1 = null;
        FileWriter outputFile2 = null;
        FileWriter outputFile3 = null;
        try {
            outputFile1 = new FileWriter("Numbers1.txt");
            outputFile2 = new FileWriter("Numbers2.txt");
            outputFile3 = new FileWriter("NumbersMerge.txt");

            for (int data : dataToWrite1) {
                outputFile1.write(data + " ");
            }

            for (int data : dataToWrite2) {
                outputFile2.write(data + " ");
            }

            for (int data : dataToWrite3) {
                outputFile3.write(data + " ");
            }

        } catch (IOException e) {
            System.out.println("Something wrong has happened...");
            e.printStackTrace();
        } finally {
            try {
                if (outputFile1 != null) {
                    outputFile1.close();
                }
                if (outputFile2 != null) {
                    outputFile2.close();
                }
                if (outputFile3 != null) {
                    outputFile3.close();
                }
                sc.close();
            } catch (IOException e) {
                System.out.println("Exception raised when attempting to close the file");
                e.printStackTrace();
            }
        }
    }
}
