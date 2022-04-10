package stackDeque.exercices;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStack {

    private Deque<Integer> stack = new ArrayDeque<>();
    private Deque<Integer> minStack = new ArrayDeque<>();

    public MinStack() {
        // helps to avoid treating .isEmpty() cases
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        if (x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int el = stack.pop();
        if (el == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(20);
        minStack.push(10);
        minStack.push(30);
        System.out.println("Varful stivei este: " + minStack.top());
        System.out.println("Cel mai mic element din stiva este: " + minStack.getMin());
        System.out.println("Stergem elementul din varful stivei");
        minStack.pop();
        System.out.println("Noul varf va fi: " + minStack.top());

    }
}