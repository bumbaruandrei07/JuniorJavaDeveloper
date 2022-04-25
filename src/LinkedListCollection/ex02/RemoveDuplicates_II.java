package LinkedListCollection.ex02;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class RemoveDuplicates_II {

    //sa se implementeze o metoda eficienta ce sterge duplicatele dintr-un LinkedList

    private static LinkedList<Integer> removeDuplicates(LinkedList<Integer> duplicateElements) {

        ListIterator<Integer> listIterator = duplicateElements.listIterator();
        int previous, current;

        if (!listIterator.hasNext()) {
            return duplicateElements;
        }

        previous = listIterator.next();

        //Traverse the list with a ListIterator

        while (listIterator.hasNext()) {
            current = listIterator.next();

            if (previous == current) {
                listIterator.remove();
                current = listIterator.next();

                while (previous == current && listIterator.hasNext()) {
                    listIterator.remove();
                    current = listIterator.next();
                }
                if (!listIterator.hasNext() && previous == current) {
                    listIterator.remove();
                }
                previous = current;
            } else {
                previous = current;
            }
        }
        return duplicateElements;
    }

    public static void main(String[] args) {

        LinkedList<Integer> myLinkedList = new LinkedList<>(List.of(1, 1, 2, 3, 32, 2, 2, 3));
        System.out.println(removeDuplicates(myLinkedList));
    }

}
