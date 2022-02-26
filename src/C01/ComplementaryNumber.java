package C01;

import java.util.Scanner;

/*
Scrie un program care citeste de la tastatura un numar natural n si afiseaza numarul complementar, astfel incat suma lor sa fie cel mai mic „numar rotund-perfect“. Un „numar rotund-perfect“ este un numar care are prima cifra 1, urmata doar de 0-uri. Sa consideram cateva exemple pentru a intelege mai bine:

// INPUT -> OUTPUT
123 -> 877   // Explicatie: (123 + 877 == 1000)
             // Numarul 9877 va produce tot un numar rotund-perfect,
             // insa nu e cel mai mic: 123 + 9877 == 10000 > 1000
2301 -> 7699 // 2301 + 7699 == 10000
 */
public class ComplementaryNumber {

    private static final Scanner inputScanner = new Scanner(System.in);

    public static int readNumberFromInput(String message) {
        if (message == null) {
            System.out.println("Please insert the number (and press Enter):");
        } else {
            System.out.println(message + " (and press Enter):");
        }
        return inputScanner.nextInt();
    }

    public static int getComplementaryNumber(int n) {
        // 1. compute the smallest 100..00 number greater than n
        int aux = 1;
        while (aux < n) {
            aux *= 10;
        }

        // 2. the complementary is aux - n
        return aux - n;
    }

    public static void main(String[] args) {
        int number = readNumberFromInput(null);
        int complementaryNumber = getComplementaryNumber(number);
        System.out.println(number + " complementary is: " + complementaryNumber);
    }
}