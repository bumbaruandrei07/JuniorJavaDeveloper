package ComplexityOfAlgorithms;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){

        //for-ul depinde in mod direct proportional de dimensiunea array-ului, si anume de input, de volumul de date!

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] list = new int[n];
        for (int i=0; i<list.length; i++) {
            list[i] = sc.nextInt();
        }


        for (int i=0; i<list.length/2; i++) {

            int aux = list[i];
            list[i] += list[n-i-1];
            list[n-i-1] += aux;
        }

        if (n % 2 == 1) {
            list[n/2] *= 2;
        }

// Note that we can print the list in the initial order
// because the list has become symmetric ;)
        for (int i=0; i<list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

}
