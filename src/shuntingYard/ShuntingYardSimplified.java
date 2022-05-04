package shuntingYard;

import java.util.Stack;

public class ShuntingYardSimplified {
    public static int evalRPN(String[] tokens) {


        Stack<Integer> st = new Stack<>();

        for (String s : tokens) {
            if (s.equals("/") || s.equals("*") || s.equals("+") || s.equals("-")) {
                int a = st.pop();
                int b = st.pop();
                if (s.equals("/")) {
                    st.push((int) b / a);
                } else if (s.equals("*")) {
                    st.push(a * b);
                } else if (s.equals("+")) {
                    st.push(a + b);
                } else if (s.equals("-")) {
                    st.push(b - a);
                }

            } else st.push(Integer.parseInt(s));
        }

        return st.pop();

    }


    public static void main(String[] args) {
        String[] arr1 = {"2", "1", "+", "3", "*"};
//        ((2 + 1) * 3) = 9
        System.out.println(evalRPN(arr1));

        String[] arr2 = {"4", "13", "5", "/", "+"};
//        (4 + (13 / 5)) = 6
        System.out.println(evalRPN(arr2));

        String[] arr3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
/**
 * Output: 22
 * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 */
        System.out.println(evalRPN(arr3));

    }
}
