package stackDeque.quiz;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Ex01 {

    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("Dana");
        myQueue.offer("Calin");
        myQueue.offer("Ali");
        myQueue.offer("Vlad");
        myQueue.offer("George");
        myQueue.offer("Mihai");

       Deque<String> myStack = new ArrayDeque<String>();

        int option = 0;
        while (!myQueue.isEmpty()) { //atata timp cat mai avem elemente in coada
            if (option < 2) {
                myStack.push(myQueue.poll());
            } else {
                myQueue.offer(myStack.peek()); //adaugam in coada varful stivei
            }

            option = (option + 1) % 3;
        }

        System.out.println(myStack);

    }
}
