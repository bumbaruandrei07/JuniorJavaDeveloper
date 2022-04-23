package interviewProblems;


import java.util.Scanner;

//TODO intoarcem numarul de elemente ale array-ului fara duplicate
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] array) {
        int readIt = 1;
        int writeIt = 0;

        while (readIt < array.length) {
            if (array[readIt] != array[writeIt]) {
                writeIt++;
                array[writeIt] = array[readIt];
            }
            readIt++;
        }

        return writeIt + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti numarul de elemente ale array-ului: ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(removeDuplicates(arr));
    }


}
