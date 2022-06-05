package JAVA_QUIZZES.overriding;

public class Runner {
    public static void main(String[] args) {
        A a = new B(); //referinta de tipul clasei A la un obiect de tipul clasei B
        a.f(); //metoda f este implementata in clasa B, ce suprascrie metoda din clasa A
        //daca metoda f() era private in clasa A, atunci apelam  ((B) a).f()
    }
}
