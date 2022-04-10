package stackDeque.quiz;

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
        stack.push(0); //elementul top

        while (stack.size() > 1) { //atata timp cat avem cel putin 2 elemente in stiva noastra
            int op1 = stack.pop(); //extrage varful stivei
            int op2 = stack.pop(); //extrage elementul imediat sub varful stivei
            if (op1 < op2) {
                stack.push(op1 + op2);
            } else {
                stack.push(op1 - op2);
            }
        }
        System.out.println(stack.peek()); //afisam varful final al stivei
    }
}
