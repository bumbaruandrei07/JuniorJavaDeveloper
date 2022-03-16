package C13_Matrix.extra;

//Ciurul lui Eratostene

import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean[] prime = new boolean[num];

        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }

        System.out.println("Researching...");
        for (int i = 2; i <= Math.sqrt(num); i++) {  // i * i <= num
//            System.out.print(i + " ");  -> afiseaza numerele de la 2 pana la n a caror patrat este mai mic sau egal decat n -> pentru 50, 7 va fi ultimul i

            for (int j = i * i; j < num; j += i) {
                System.out.print(j + " ");
                prime[j] = false;
            }
        }

        System.out.println("\n");
        System.out.print("Prime numbers: ");
        for (int i = 2; i < prime.length; i++) {
            if (prime[i] == true) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
