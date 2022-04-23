package exceptions.course;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BasicInputMismatchException {

    private final static Scanner sc = new Scanner(System.in);

    private static String basic() {
        while (true) {
            try {
                String a = sc.nextLine();
                return a;
            } catch (InputMismatchException e) {
                e.getMessage();
            }
        }
    }

    private static int getIntegerOperand() {
        while (true) {
            try {
                System.out.println("Introdu o valoare intreaga:");
                return sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Nu ai introdus o valoare intreaga. Te rog sa reincerci.");
            } catch (NoSuchElementException e) {
                System.out.println("INPUT was closed and cannot be reopened! Abort...");
                return 0;
            }
        }
    }

    public static void main(String[] args){
      //  System.out.println(basic());
        System.out.println(getIntegerOperand());
    }
}
