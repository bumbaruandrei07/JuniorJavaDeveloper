package stackDeque.quiz;

import java.util.Deque;
import java.util.LinkedList;

public class Ex02 {

    public static void main(String[] args) {
        Deque<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("pear");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        fruits.peekFirst(); //nu modifica structura, doar intoarce apple
        fruits.removeLast(); //stergem lemon
        fruits.removeLast(); //stergem orange
        fruits.addFirst("mango"); //adaugam mango la inceput
        fruits.addLast(fruits.peekFirst()); //adaugam la final varful, adica la final inseram mango
        fruits.peekLast(); //nu influenteaza in niciun mod structura noastra, nu ii schimba forma
        fruits.addFirst("kiwi"); //punem kiwi la inceput
        fruits.addLast(fruits.removeLast()); //adaugam la final ultimul element, stergam mango si il adaugam iar
        fruits.addFirst(fruits.peekLast()); //adaugam la inceput ultimul element, adica mango
        fruits.removeLast(); //stergem ultimul element, adica mango

        System.out.println(fruits);

    }
}
