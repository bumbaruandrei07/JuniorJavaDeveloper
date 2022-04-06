package StackDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex03 {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(9);
        stack.push(3);
        stack.push(6);
        stack.push(7);
        stack.push(0);

        while (stack.size() > 1) {
            int op1 = stack.pop();
            int op2 = stack.pop();
            if (op1 < op2) {
                stack.push(op1 + op2);
            } else {
                stack.push(op1 - op2);
            }
        }
        System.out.println(stack.peek());
    }
}
