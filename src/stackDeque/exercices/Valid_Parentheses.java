package stackDeque.exercices;
import java.util.ArrayDeque;
import java.util.Deque;


/**
 * Se da un sir de paranteze sub forma de sir de caractere, care poate contine: (, ); [, ] si {, }. Verifica daca sirul de paranteze este valid, adica daca toate parantezele „deschise“ se inchid „corect“. Iata cateva exemple din ambele cazuri:
 *
 * Expresii valide	Expresii invalide
 *
 * ()[]({})	[[]
 * (((([{}]))))[]	[[]])
 * ()[([{}])]	[[(]])
 * ()(([])){[[()]]}	[(])
 *
 */

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

    public static void main(String[] args) {
        System.out.println(isValid("[][][][][][][][][][][]"));
        System.out.println(isValid("({})"));
        System.out.println(isValid("((())"));
    }
}
