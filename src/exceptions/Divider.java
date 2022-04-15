package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {
    private static Scanner scanner = new Scanner(System.in);

    private static int getIntegerOperand() {
        while (true) {
            try {

                System.out.println("Introdu o valoare intreaga:");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Nu ai introdus o valoare intreaga. Te rog sa reincerci.");
            }
        }
    }

    private static int division(int dividend, int divisor) {
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int dividend = getIntegerOperand();
        int divisor = getIntegerOperand();
        int result = division(dividend, divisor);
        System.out.println("Rezultatul este: " + result);
    }
}
