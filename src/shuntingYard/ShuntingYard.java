package shuntingYard;

import java.util.Stack;

public class ShuntingYard {
    //metoda pentru a obtine precedenta operatorilor
    private static boolean letterOrDigit(char c) {
        // daca elementul char este litera sau cifra
        if (Character.isLetterOrDigit(c))
            return true;
        else
            return false;
    }

    //operatorul cu precedenta cea mai mare va fi cel returnat
    private static int getPrecedence(char ch) {

        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '^')
            return 3;
        else
            return -1;
    }

    // asocitativitate la stanga
    private static boolean hasLeftAssociativity(char ch) {
        if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
            return true;
        } else {
            return false;
        }
    }

    //    Metoda converteste expresia infixă în expresie postfixă
    private static String infixToRpn(String expression) throws InvalidException {

        //Initializare stack
        Stack<Character> stack = new Stack<>();

        //Initializare string gol pentru output
        String output = new String("");

        //parcurgere string
        for (int i = 0; i < expression.length(); i++) {
            //caracterul c se afla in string pe pozitia i
            char c = expression.charAt(i);

            //daca al doilea param este operand il adaugam in output
            if (letterOrDigit(c))
                output += c;

                //daca tokentul citit este ' ( ' atunci il adaugam in stack
            else if (c == '(')
                stack.push(c);

                //daca tokenul citit este ' ) ' atunci il adaugam la output din stack pana cand intalnim ' ( '
            else if (c == ')') {
                while (!stack.isEmpty()
                        && stack.peek() != '(')
                    output += stack.pop();

                stack.pop();
            }

            //daca se intalneste un operator, atunci urmatorul pas consta in precedenta operatorului

            else {
                while (!stack.isEmpty() && getPrecedence(c) <= getPrecedence(stack.peek()) && hasLeftAssociativity(c)) {

                    //adaugam output-ului elementul din varful stivei
                    output += stack.pop();
                }
                //adaugam in stiva caracterul 'c'
                stack.push(c);
            }
        }


        //extragem toti operatorii ramasi in stiva si ii adaugam output-ului
        //cat timp stiva nu este goala adaugam in output elementul din varful stivei
        while (!stack.isEmpty()) {
            //daca elementul din varful stivei este '(' atunci expresia este invalida
            if (stack.peek() == '(') {
                throw new InvalidException("Aceasta expresie este invalida");
            }
            output += stack.pop();
        }
        return output;
    }

    public static void main(String[] args) throws InvalidException {
        // Considering random infix string notation
        String expression = "3 + (2 - 5) - 1";

        // Printing RPN for the above infix notation
        // Illustrating shunting yard algorithm
        System.out.println(infixToRpn(expression));
    }
}

