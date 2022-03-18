package LambdaExpressions;

// De asemenea o interfata functionala, ce contine
// o singura metoda abstracta si inca o metoda default (nu e obligatoriu sa aiba doar o singura metoda abstracta, poate sa aiba si una non-abstracta)
public interface IAlsoFunctional {
    // Functie abstracta
    int processSingleValue(int x);

    // O metoda non-abstracta
    default void sayHello() {
        System.out.println("Hello");
    }
}