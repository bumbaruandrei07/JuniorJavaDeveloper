package LambdaExpressions.anonymousClass_VS_LambdaExpressions;

import LambdaExpressions.StreamsAndLambda.IAlsoFunctional;

//TODO - Clasa AnonymousExample.java implementeaza interfata IAlsoFuncional folosind o clasa anonima,
// care poate stoca informatii prin membrii sai. Acest aspect nu poate fi obtinut prin intermediul expresiilor lambda:


public class AnonymousExample {
    public static void functionToReference(int i) {
        System.out.println(2 * i);
    }

    public static void main(String args[]) {
        IAlsoFunctional anonymousInstance = new IAlsoFunctional() {
            // membru care poate stoca o stare
            int count = 0; //va creste cu 1 la fiecare apel al functiei processSingleValue() ce este suprascrise
                            //count-ul nu este vizibil in afara metodei, doar ce contine interfata
            @Override
            public int processSingleValue(int x) {
                System.out.println("Acesta este apelul cu numarul: "
                        + count++ + "\n " + 2 * x);
                return 0;
            }
        };

        anonymousInstance.processSingleValue(5);
        anonymousInstance.processSingleValue(2);
        anonymousInstance.processSingleValue(3);
    }
}
