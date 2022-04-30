package LinkedListCollection.ex04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BigNumbers {

    private static LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2) {

        if (op1.size() < op2.size()) {
            LinkedList<Integer> aux = op1;
            op1 = op2;
            op2 = aux;
        }

        LinkedList<Integer> resultLinkedList = new LinkedList<>();

        int overflow = 0;

        while (op1.size() != 0 && op2.size() != 0) {
            //luam valoarea calculata de la final si o adaugam la inceput
            int sum = op1.removeLast() + op2.removeLast() + overflow;
            overflow = 0;

            if (sum >= 10) {
                sum %= 10;
                overflow = 1;
            }
            //adaugam la inceput
            resultLinkedList.addFirst(sum);
        }

        while (op1.size() != 0) {
            int sum = op1.removeLast() + overflow;
            overflow = 0;

            if (sum >= 10) {
                sum %= 10;
                overflow = 1;
            }
            resultLinkedList.addFirst(sum);
        }
        if (overflow == 1) {
            resultLinkedList.addFirst(overflow);
        }
        return resultLinkedList;
    }


    public static void main(String[] args) {

        LinkedList<Integer> bigNumberLinkedList1 = new LinkedList<>(List.of(1, 2, 3, 4, 1, 2, 3));
        LinkedList<Integer> bigNumberLinkedList2 = new LinkedList<>(List.of(2, 3, 4, 1, 2, 5, 12));
        System.out.println(sum(bigNumberLinkedList1, bigNumberLinkedList2));

    }
}

