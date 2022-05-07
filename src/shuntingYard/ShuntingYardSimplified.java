package shuntingYard;

import java.util.Stack;


//Evaluarea expresiei (forma postfixata) -> simplificarea algoritmului initial
public class ShuntingYardSimplified {
    public static int evalRPN(String[] tokens) {

        //initializare stack st
        Stack<Integer> st = new Stack<>();

        //parcurgem array-ul de stringuri
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
//      Evaluarea expresiei:   ((2 + 1) * 3) = 9
        System.out.println(evalRPN(arr1));

        String[] arr2 = {"4", "13", "5", "/", "+"};
//      Evaluarea expresiei:   (4 + (13 / 5)) = 6
        System.out.println(evalRPN(arr2));

        String[] arr3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(arr3));

    }
}
