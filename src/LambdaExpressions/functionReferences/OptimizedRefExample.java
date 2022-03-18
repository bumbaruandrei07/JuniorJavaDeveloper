package LambdaExpressions.functionReferences;

/**
 * METODE STATICE:
 * <NUME_CLASA>::<NUME_METODA_REFERITA>;
 * <p>
 * METODE NON-STATICE:
 * <NUME_INSTANTA>::<NUME_METODA_REFERITA>;
 */
public class OptimizedRefExample {
    interface IMethodCall {
        void myMethodCall(int x);

        default int defaultFunction() {
            return -1;
        }
    }

    public static void functionToReference(int x) {
        System.out.println(2 * x);
    }

    public static void main(String[] args) {
        IMethodCall printlnPointer = OptimizedRefExample::functionToReference; //clasa in care se situeaza :: metoda referita
        //am folosit numele clasei pt ca metoda este statica, altfel trebuia sa folosim un obiect al clasei OptimizedRefExample
        //metodele statice se apeleaza pe clasa, cele non-statice pe obiect
        //metodele statice se referentiaza prin numele clasei, iar cele non-statice prin obiect

        // acest apel printeaza 10
        printlnPointer.myMethodCall(5);
        printlnPointer.myMethodCall(10);
    }
}

