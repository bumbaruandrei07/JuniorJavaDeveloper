package JAVA_QUIZZES.overriding2;

public class Derivata extends Baza{

    public void metodaUNU(){
        super.metodaUNU();
        System.out.print("C");
    }

    public void metodaDOI(){
        //daca apelam doar metodaDOI(), s-ar fi apelat la infinit -> StackOverFlowError
        super.metodaDOI();
        System.out.print("D");
    }
}
