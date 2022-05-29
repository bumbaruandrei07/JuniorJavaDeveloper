package subiecteExamen1.alteGrile.ex05;

//Which statement, when inserted at Line n1, enables the code to compile?
//super(10);
//clasa de baza nu are un constructor default, atunci trebuie sa implementam un constructor in clasa copil folosind constructorul creat in clasa de baza
//folosind keyword-ul super
public class SubClass extends SuperClass{
    SubClass(int x) {
        super(x);
    }
}
