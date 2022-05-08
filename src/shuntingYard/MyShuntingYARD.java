package shuntingYard;

import java.util.Deque;
import java.util.LinkedList;

public class MyShuntingYARD {

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

    private static boolean hasLeftAssociativity(char ch) {
        if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
            return true;
        } else {
            return false;
        }
    }

    private static Deque<Character> postFixNotation(String infix) throws InvalidException {
        Deque<Character> postFixQueue = new LinkedList<>();
        Deque<Character> myStack = new LinkedList<>();

        for (Character character : infix.toCharArray()) {
            if (Character.isDigit(character)) {
                postFixQueue.addLast(character);
            } else if ((character == '+') || (character == '-') || (character == '*') || (character == '/') || (character == '^')) {
                while ((!myStack.isEmpty()) && (myStack.getFirst() != '(')
                        && (getPrecedence(character) < getPrecedence(myStack.getFirst()) ||
                        getPrecedence(character) == getPrecedence(myStack.getFirst()) &&
                                hasLeftAssociativity(myStack.getFirst()))) {
                    postFixQueue.addLast(myStack.removeFirst());
                }
                myStack.addLast(character);
            } else if (character == '(') {
                myStack.addFirst(character);
            } else if (character == ')') {
                char charToBeRemoved = ' ';
                while (!myStack.isEmpty() && myStack.getFirst() != '(') {
                    charToBeRemoved = myStack.removeFirst();
                    postFixQueue.addLast(charToBeRemoved);
                    if (myStack.isEmpty() && charToBeRemoved != '(') {
                        throw new InvalidException("Paranteze gresite!");
                    }
                }
                myStack.removeFirst();
            }
            System.out.println("Postfix notation Queue: " + postFixQueue);
            System.out.println("Operators stack: " + myStack);
        }
        while (!myStack.isEmpty()) {
            char charToBeRemoved = myStack.removeFirst();
            postFixQueue.addLast(charToBeRemoved);
        }
        return postFixQueue;
    }

    public static void main(String[] args) throws InvalidException {

        //infix notation
        String infixNotation1 = "5+(1+3)*2^1^3+4/(1+6*2/2) + 1 -1 * 1 / 2";
        String infixNotation2 = "9 + 1 - 8";

        System.out.println("POSTFIX NOTATION");
        Deque<Character> postFixNotation1 = postFixNotation(infixNotation1);
        System.out.println(postFixNotation1);
        System.out.println();

        Deque<Character> postFixNotation2 = postFixNotation(infixNotation2);
        System.out.println(postFixNotation2);
        System.out.println();
    }
}
