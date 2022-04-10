package stackDeque.exercices;

import java.util.ArrayDeque;
import java.util.Deque;

public class Valid_Parentheses {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        System.out.println(isValid("[][][][][][][][][][][]"));
    }
}
