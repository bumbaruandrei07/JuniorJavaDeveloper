package LambdaExpressions.exemple1;

public class PlayWithLambda {
    public static void main(String[] args) {
        // crearea expresiei lambda, ce implementeaza interfata
        // functionala IFunctional
        IFunctional functionalObject = x -> 2 * x; //instantiere in-place, output : 2 * 5 = 10, x poate fi si intre paranteze (i.e. (x))
        //functionalObject = x -> 6; //output -> 6 (constanta)

        // apelul expresiei lambda
        // (i.e. ce reprezinta implementarea interfetei)
        System.out.println(functionalObject.processSingleValue(5));
    }
}

/**
 * Se observa:
 * instantierea unui obiect prin intermediul unei expresii lambda si
 * apelarea metodei processSingleValue(…) implementata in cadrul blocului de cod functional.
 * deoarece implementarea functiei lambda consta intr-o singura instructiune, am putut omite in totalitate delimitarea blocului de cod prin {}
 */