package StackDeque;

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

        fruits.peekFirst();
        fruits.removeLast();
        fruits.removeLast();
        fruits.addFirst("mango");
        fruits.addLast(fruits.peekFirst());
        fruits.peekLast();
        fruits.addFirst("kiwi");
        fruits.addLast(fruits.removeLast());
        fruits.addFirst(fruits.peekLast());
        fruits.removeLast();

        System.out.println(fruits);

    }
}
