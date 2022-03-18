package LambdaExpressions.exemple2;

public class ComplexLambda {

    interface IVerifyProperty {
        boolean hasProperty(int a);  //avem o interfata generica prin care se verifica daca o valoare intreaga este numar prim.
    }

    public static void main(String args[]) {
        IVerifyProperty isPrime = (x) -> {   //corpul functiei reprezinta un override! suprascrie metoda hasProperty din interfata!
            //ofera o implementare pentru hasProperty si verifica daca o valoare este numar prim. x este parametrul pe care il referim cand se face apelul
            for (int i = 2; i < x / 2; i++) {   //cautam posibilul divizor i al lui x
                if (x % i == 0) { //cand x este divizibil cu un i din intervalul [2, x/2] returnam false, altfel true
                    return false;
                }
            }
            return true;
        };
        //apelul functiei hasProperty
        System.out.println(isPrime.hasProperty(13));
        System.out.println(isPrime.hasProperty(10));
    }
}