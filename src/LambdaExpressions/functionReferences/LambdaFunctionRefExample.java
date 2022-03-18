package LambdaExpressions.functionReferences;

//putem sa apelam o alta metoda in interiorul unui lambda

public class LambdaFunctionRefExample {
    interface IMethodCall {
        void myMethodCall(int x); // o sa fie suprascrisa de catre expresia lambda

        default int defaultFunction() {
            return -1;
        }
    }

    public static void functionToReference(int x) { // o s-o folosim mai departe, o s-o referentiem
        System.out.println(2 * x);
    }

    public static void main(String args[]) {
        IMethodCall printlnPointer = x -> functionToReference(x); //primeste un parametru x si apeleaza metoda functionToReference(x), referim metoda

        // acest apel printeaza 10
        printlnPointer.myMethodCall(5);
    }
}
